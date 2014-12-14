package com.itany.p2p.util;

import java.math.BigDecimal;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Timestamp;
import java.sql.Types;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import org.apache.log4j.Logger;

import com.itany.p2p.exception.DataAccessException;

/**
 * 
 * 文 件 名: JDBCTemplate.java 
 * 版 权: Copyright 2014-, All rights reserved 
 * 描 述: <描述>
 * 创 建 人:
 * 版本：V1.0.0
 */
public class JDBCTemplate {

	private Logger logger = Logger.getLogger(JDBCTemplate.class);

	/**
	 * 
	 * <根据sql和参数返回List集合> 
	 * <集合泛型为RowMapper中返回的对象类型>
	 * <功能详细描述>
	 * 
	 * @param sql
	 * @param rm
	 * @param params
	 * @return
	 * @throws DataAccessException
	 * @see [类、类#方法、类#成员]
	 */
	public List query(String sql, RowMapper rm, Object... params)
			throws DataAccessException {
		Connection con = null;
		PreparedStatement ps = null;
		ResultSet rs = null;
		List list = new ArrayList();
		try {
			con = JDBCUtil.getConnection();
			ps = con.prepareStatement(sql);
			for (int i = 0; i < params.length; i++) {
				setParam(ps, i, params[i]);
			}
			rs = ps.executeQuery();
			while (rs.next()) {
				Object obj = rm.mapRow(rs);
				list.add(obj);
			}
			
			//System.out.println(sql);

		} catch (Exception e) {
			logger.error("执行JDBCTemplate中query方法出错！", e);
			throw new DataAccessException("数据库访问异常");
		} finally {
			JDBCUtil.close(null, ps, rs);
		}
		return list;
	}

	/**
	 * 
	 * <分页查询> 
	 * <适用于MySQL>
	 * 
	 * @param sql
	 * @param rm
	 * @param params
	 * @return
	 * @throws DataAccessException
	 * @see [类、类#方法、类#成员]
	 */
	public PageResult findPageBySql4MySQL(String sql,
			RowMapper rm, int pageNo, int pageSize, Object... params)
			throws DataAccessException {
		PageResult pr = new PageResult();
		
		String countSql = "select count(1) from ( " + sql + ") ";
		
		
		int totalCount = Integer.parseInt(query(countSql, new RowMapper() {
			public Object mapRow(ResultSet rs) throws Exception {
				return rs.getInt(1);
			}
		}, params).get(0)+"");

		
		sql += " limit " + (pr.getPageNo() - 1) * pageSize + ","
				+ pr.getPageNo() * pageSize;
		
		List result  = query(sql, rm, params);
		
		pr.setTotleNo(totalCount);
		pr.setPageNo(pageNo);
		pr.setList(result);

		return pr;
	}
	
	
	
	/**
	 * 
	 * <分页查询> 
	 * <适用于Oracle>
	 * 
	 * @param sql
	 * @param rm
	 * @param params
	 * @return
	 * @throws DataAccessException
	 * @see [类、类#方法、类#成员]
	 */
	public PageResult findPageBySql4Oracle(String sql,
			RowMapper rm, int pageNo, int pageSize, Object... params)
			throws DataAccessException {
		PageResult pr = new PageResult();

		
		String countSql = "select count(1) from ( " + sql + ") ";
		
		
		int totalCount = Integer.parseInt(query(countSql, new RowMapper() {
			public Object mapRow(ResultSet rs) throws Exception {
				return rs.getInt(1);
			}
		}, params).get(0)+"");

		
		String newSql = new StringBuffer()
				.append(" select * from ( ")
				.append("   select temp.*,rownum rn from ( ")
				.append(sql)
				.append(" ) temp ")
				.append(" where rownum <= ")
				.append(pageNo*pageSize)
				.append(")   where rn >= ")
				.append((pageNo-1)*pageSize+1)
				.toString();
		
		List result  = query(newSql, rm, params);
		
		pr.setTotleNo(totalCount);
		pr.setPageNo(pageNo);
		pr.setList(result);

		return pr;
	}
	

	/**
	 * 
	 * <根据sql执行update或者delete方法>
	 * <功能详细描述>
	 * 
	 * @param sql
	 * @param params
	 * @throws DataAccessException 
	 * @see [类、类#方法、类#成员]
	 */
	public void update(String sql, Object... params) throws DataAccessException {
		Connection con = null;
		PreparedStatement ps = null;

		try {
			System.out.println(sql);
			con = JDBCUtil.getConnection();
			ps = con.prepareStatement(sql);
			for (int i = 0; i < params.length; i++) {
				setParam(ps, i, params[i]);
			}
			ps.executeUpdate();
		} catch (Exception e) {
			e.printStackTrace();
			throw new DataAccessException("数据库访问异常");
		} finally {
			JDBCUtil.close(null, ps, null);
		}
	}

	/**
	 * 
	 * <根据sql语句执行保存操作>
	 * <当数据库为mysql时，返回插入的数据的id，Oracle不适用>
	 * @param sql
	 * @param params
	 * @return
	 * Object
	 * @throws DataAccessException 
	 *
	 */
	public Object save(String sql, Object... params) throws DataAccessException {
		//System.out.println(sql);
		Connection con = null;
		PreparedStatement ps = null;
		ResultSet rs = null;
		Object pk = null;
		try {
			con = JDBCUtil.getConnection();
			ps = con.prepareStatement(sql,PreparedStatement.RETURN_GENERATED_KEYS);
			for (int i = 0; i < params.length; i++) {
				setParam(ps, i, params[i]);
			}
			ps.executeUpdate();
			rs = ps.getGeneratedKeys();
			while (rs.next()) {
				pk = rs.getObject(1);
			}
		} catch (Exception e) {
			e.printStackTrace();
			throw new DataAccessException("数据库访问异常");
		} finally {
			JDBCUtil.close(null, ps, rs);
		}
		return pk;
	}

	/**
	 * 
	 * <判断数据的类型> 
	 * <功能详细描述>
	 * 
	 * @param ps
	 * @param index
	 * @param data
	 * @throws SQLException
	 * @see [类、类#方法、类#成员]
	 */
	private void setParam(PreparedStatement ps, int index, Object data)
			throws SQLException {
		if (data == null) {
			ps.setNull(index + 1, Types.VARCHAR);
			return;
		}
		Class dataCls = data.getClass();
		if (String.class.equals(dataCls)) {
			ps.setString(index + 1, (String) data);
		} else if (boolean.class.equals(dataCls)) {
			ps.setBoolean(index + 1, ((Boolean) data));
		} else if (int.class.equals(dataCls)) {
			ps.setInt(index + 1, (Integer) data);
		} else if (double.class.equals(dataCls)) {
			ps.setDouble(index + 1, (Double) data);
		} else if (Date.class.equals(dataCls)) {
			Date val = (Date) data;
			ps.setTimestamp(index + 1, new Timestamp(val.getTime()));
		} else if (BigDecimal.class.equals(dataCls)) {
			ps.setBigDecimal(index + 1, (BigDecimal) data);
		} else {
			// 未知类型
			ps.setObject(index + 1, data);
		}
	}
}

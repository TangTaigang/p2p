package com.itany.p2p.util;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Properties;

import javax.sql.DataSource;

import org.apache.commons.dbcp.BasicDataSourceFactory;

import com.itany.p2p.exception.DataAccessException;

/**
 * 文 件 名: JDBCUtil.java
 * 版 权: Copyright 2014-, All rights reserved
 * 描 述: <描述>
 * 创 建 人:
 * 版本：V1.0.0
 */
public class JDBCUtil {
	private static DataSource ds;

	private static ThreadLocal<Connection> local = new ThreadLocal<Connection>();
	
	// 初始化数据库连接池
	static {
		try {
			Properties p = new Properties();
			p.load(JDBCUtil.class.getClassLoader().getResourceAsStream(
					"datasource.properties"));
			ds = BasicDataSourceFactory.createDataSource(p);
		} catch (Exception e) {
			e.printStackTrace();
			throw new ExceptionInInitializerError("JDBCUtil初始化出错");
		}
	}

	/**
	 * 
	 * <获得数据库的连接> 获得跟本线程相关的连接，如果当前线程，创建 如果当前线程有连接，把当前连接给他 <功能详细描述>
	 * 
	 * @return
	 * @throws DataAccessException 
	 * @see [类、类#方法、类#成员]
	 */
	public static Connection getConnection() throws DataAccessException {
		Connection con = local.get();
		try {
			if (con == null) {
				con = ds.getConnection();
				local.set(con);
			}
		} catch (SQLException e) {
			e.printStackTrace();
			throw new DataAccessException("数据库访问异常");
		}
		return con;
	}

	public static void close(Connection con, PreparedStatement ps, ResultSet rs) {
		if (rs != null) {
			try {
				rs.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
		if (ps != null) {
			try {
				ps.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
		if (con != null) {
			try {
				con.close();
				local.remove();

			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
	}

	public static void close() {
		Connection con = local.get();
		if (con != null) {
			try {
				con.close();
				local.remove();
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
	}
	
	
}

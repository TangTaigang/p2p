package com.itany.p2p.dao.impl;

import java.util.List;

import com.itany.p2p.dao.ILendingPeriodDao;
import com.itany.p2p.entity.LendingPeriod;
import com.itany.p2p.exception.DataAccessException;
import com.itany.p2p.mapper.LendingPeriodMapper;
import com.itany.p2p.util.JDBCTemplate;

public class LendingPeriodDaoImpl implements ILendingPeriodDao {
	
	private JDBCTemplate template;
	
	public LendingPeriodDaoImpl(){
		template = new JDBCTemplate();
	}
	
	//获取产品周期(不包括禁用)
	public List getLendingPeriod() throws DataAccessException{
		String sql = "select *from lendingperiod where status=0";
		List list = template.query(sql, new LendingPeriodMapper());
		return list;
	}
	
	//获取产品周期（包括禁用）
	public List getAllLendingPeriod() throws DataAccessException{
		String sql = "select *from lendingperiod order by lendingperiodid";
		List list = template.query(sql, new LendingPeriodMapper());
		return list;
	}

	//添加产品周期
	public Object addLendingPeriod(LendingPeriod lendingPeriod) throws DataAccessException {
		String sql = "insert into lendingperiod values(sequence_lendingperiod_id.nextval,?,0)";
		Object obj = template.save(sql, lendingPeriod.getPeriod());
		return obj;
	}

	//修改产品周期
	public void modifyLendingPeriodById(LendingPeriod lendingPeriod) throws DataAccessException {
		String sql = "update lendingperiod set period=? where lendingPeriodid=?";
		template.update(sql, lendingPeriod.getPeriod(),lendingPeriod.getLendingPeriodId());
		
	}

	//根据产品周期ID修改产品周期状态
	public void modifyStatusById(int lendingPeriodId, int status) throws DataAccessException {
		String sql = "update lendingperiod set status=? where lendingperiodid=?";
		template.update(sql, status,lendingPeriodId);
		
	}
}

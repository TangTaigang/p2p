package com.itany.p2p.dao;

import java.util.List;

import com.itany.p2p.entity.LendingPeriod;
import com.itany.p2p.exception.DataAccessException;

public interface ILendingPeriodDao {

	//获取产品周期
	public List getLendingPeriod() throws DataAccessException;
	
	//获取产品周期（包括禁用）
	public List getAllLendingPeriod() throws DataAccessException;
	
	//添加产品周期
	public Object addLendingPeriod(LendingPeriod lendingPeriod) throws DataAccessException;
	
	//修改产品周期
	public void modifyLendingPeriodById(LendingPeriod lendingPeriod) throws DataAccessException;
	
	//根据产品周期ID修改产品周期状态
	public void modifyStatusById(int lendingPeriodId,int status) throws DataAccessException;
	
}
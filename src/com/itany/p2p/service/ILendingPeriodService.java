package com.itany.p2p.service;

import java.util.List;

import com.itany.p2p.entity.LendingPeriod;
import com.itany.p2p.exception.ServiceException;

public interface ILendingPeriodService {

	//获取产品周期（不包括禁用）
	public List getLendingPeriod() throws ServiceException;
	
	//获取产品周期（包括禁用）
	public List getAllLendingPeriod() throws ServiceException;
	
	//添加产品周期
	public Object addLendingPeriod(LendingPeriod lendingPeriod) throws ServiceException;
	
	//修改产品周期
	public void modifyLendingPeriodById(LendingPeriod lendingPeriod) throws ServiceException;
	
	//根据产品周期ID修改产品周期状态
	public void modifyStatusById(int lendingPeriodId,int status) throws ServiceException;
	
}
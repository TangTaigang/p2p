package com.itany.p2p.service.impl;

import java.util.List;

import com.itany.p2p.dao.ILendingPeriodDao;
import com.itany.p2p.dao.impl.LendingPeriodDaoImpl;
import com.itany.p2p.entity.LendingPeriod;
import com.itany.p2p.exception.DataAccessException;
import com.itany.p2p.exception.ServiceException;
import com.itany.p2p.service.ILendingPeriodService;

public class LendingPeriodServiceImpl implements ILendingPeriodService {
	
	private ILendingPeriodDao lendingPeriodDao = new LendingPeriodDaoImpl();
	
	//获取产品周期（不包括禁用）
	public List getLendingPeriod() throws ServiceException{
		List list = null;
		try {
			list = lendingPeriodDao.getLendingPeriod();
		} catch (DataAccessException e) {
			e.printStackTrace();
			throw new ServiceException();
		}
		return list;
	}
	
	//获取产品周期（包括禁用）
	public List getAllLendingPeriod() throws ServiceException{
		List list = null;
		try {
			list = lendingPeriodDao.getAllLendingPeriod();
		} catch (DataAccessException e) {
			e.printStackTrace();
			throw new ServiceException();
		}
		return list;
	}

	//添加产品周期
	public Object addLendingPeriod(LendingPeriod lendingPeriod) throws ServiceException {
		Object obj = null;
		try {
			obj = lendingPeriodDao.addLendingPeriod(lendingPeriod);
		} catch (DataAccessException e) {
			e.printStackTrace();
			throw new ServiceException();
		}
		return obj;
	}

	//修改产品周期
	public void modifyLendingPeriodById(LendingPeriod lendingPeriod) throws ServiceException {
		try {
			lendingPeriodDao.modifyLendingPeriodById(lendingPeriod);
		} catch (DataAccessException e) {
			e.printStackTrace();
			throw new ServiceException();
		}
		
	}

	//根据产品周期ID修改产品周期状态
	public void modifyStatusById(int lendingPeriodId, int status) throws ServiceException {
		try {
			lendingPeriodDao.modifyStatusById(lendingPeriodId, status);
		} catch (DataAccessException e) {
			e.printStackTrace();
			throw new ServiceException();
		}
		
	}
	
	
}

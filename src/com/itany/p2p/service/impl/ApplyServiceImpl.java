package com.itany.p2p.service.impl;

import java.util.List;

import com.itany.p2p.dao.IApplyDao;
import com.itany.p2p.dao.impl.ApplyDaoImpl;
import com.itany.p2p.exception.DataAccessException;
import com.itany.p2p.exception.ServiceException;
import com.itany.p2p.service.IApplyService;

public class ApplyServiceImpl implements IApplyService {
	
	IApplyDao applyDao = new ApplyDaoImpl();
	
	//获取所有申请信息
	public List getAllApply(int applyProductId) throws ServiceException{
		List list = null;
		try {
			list = applyDao.getAllApply(applyProductId);
		} catch (DataAccessException e) {
			e.printStackTrace();
			throw new ServiceException();
		}
		return list;
	}
	
}	

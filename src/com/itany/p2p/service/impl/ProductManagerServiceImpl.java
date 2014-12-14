package com.itany.p2p.service.impl;

import java.util.List;

import com.itany.p2p.dao.IProductManagerDao;
import com.itany.p2p.dao.impl.ProductManagerDaoImpl;
import com.itany.p2p.exception.DataAccessException;
import com.itany.p2p.exception.ServiceException;
import com.itany.p2p.service.IProductManagerService;
import com.itany.p2p.util.PageResult;

public class ProductManagerServiceImpl implements IProductManagerService {
	
	IProductManagerDao productManagerDao = new ProductManagerDaoImpl();
	
	//查询所有在线申请产品信息
	public List getAllApplyInfo() throws ServiceException {
		List list = null;
		try {
			list = productManagerDao.getAllApplyInfo();
		} catch (DataAccessException e) {
			e.printStackTrace();
			throw new ServiceException();
		}
		return list;
	}
	
	public PageResult getAllProduct(int pageNo,int pageSize) throws ServiceException{
		PageResult pageResult;
		try {
			pageResult = productManagerDao.getAllProduct(pageNo, pageSize);
		} catch (DataAccessException e) {
			e.printStackTrace();
			throw new ServiceException();
		}
		return pageResult;
		
	}

}

package com.itany.p2p.service.impl;

import com.itany.p2p.dao.IProductDao;
import com.itany.p2p.dao.impl.ProductDaoImpl;
import com.itany.p2p.entity.Product;
import com.itany.p2p.exception.DataAccessException;
import com.itany.p2p.exception.ServiceException;
import com.itany.p2p.service.IProductService;
import com.itany.p2p.util.PageResult;

public class ProductServiceImpl implements IProductService {
	
	private IProductDao productDao= new ProductDaoImpl();
	
	//添加产品
	public Object addProduct(Product product) throws ServiceException{
		Object obj = null;
		try {
			obj = productDao.addProduct(product);
		} catch (DataAccessException e) {
			e.printStackTrace();
			throw new ServiceException();
		}
		
		return obj;
	}

	//分页查询所有产品
	public PageResult getAllProduct(int pageNo, int pageSize) throws ServiceException {
		PageResult pageResult = null;
		try {
			pageResult = productDao.getAllProduct(pageNo, pageSize);
		} catch (DataAccessException e) {
			e.printStackTrace();
			throw new ServiceException();
		}
		return pageResult;
	}
	
}

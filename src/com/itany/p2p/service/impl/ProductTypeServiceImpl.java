package com.itany.p2p.service.impl;

import java.util.List;

import com.itany.p2p.dao.IProductTypeDao;
import com.itany.p2p.dao.impl.ProductTypeDaoImpl;
import com.itany.p2p.entity.ProductType;
import com.itany.p2p.exception.DataAccessException;
import com.itany.p2p.exception.ServiceException;
import com.itany.p2p.service.IProductTypeService;

public class ProductTypeServiceImpl implements IProductTypeService {
	
	private IProductTypeDao productTypeDao = new ProductTypeDaoImpl();
	
	//获取不包括禁用的所有产品类型
	public List getProductType() throws ServiceException {
		List list = null;
		try {
			list = productTypeDao.getProductType();
		} catch (DataAccessException e) {
			e.printStackTrace();
			throw new ServiceException();
		}
		return list;
	}
	
	//获取包括禁用的所有产品类型
	public List getAllProductType() throws ServiceException {
		List list = null;
		try {
			list = productTypeDao.getAllProductType();
		} catch (DataAccessException e) {
			e.printStackTrace();
			throw new ServiceException();
		}
		return list;
	}

	//添加产品类型
	public Object addProductType(ProductType productType) throws ServiceException {
		Object obj = null;
		try {
			obj = productTypeDao.addProductType(productType);
		} catch (DataAccessException e) {
			e.printStackTrace();
			throw new ServiceException();
		}
		return obj;
	}

	//修改产品类型名称
	public void modifyProductType(ProductType productType) throws ServiceException {
		try {
			productTypeDao.modifyProductType(productType);
		} catch (DataAccessException e) {
			e.printStackTrace();
			throw new ServiceException();
		}
	}

	//根据产品类型ID修改产品类型状态
	public void modifyStatusById(int productTypeId, int productTypeStatus) throws ServiceException {
		try {
			productTypeDao.modifyStatusById(productTypeId, productTypeStatus);
		} catch (DataAccessException e) {
			e.printStackTrace();
			throw new ServiceException();
		}
		
	}
	
}

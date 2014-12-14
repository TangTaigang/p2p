package com.itany.p2p.service;

import java.util.List;

import com.itany.p2p.entity.ProductType;
import com.itany.p2p.exception.ServiceException;

public interface IProductTypeService {
	
	//获取不包括禁用的所有产品类型
	public List getProductType() throws ServiceException;
	
	//获取包括禁用的所有产品类型
	public List getAllProductType() throws ServiceException;
	
	//添加产品类型
	public Object addProductType(ProductType productType) throws ServiceException;
	
	//修改产品类型名称
	public void modifyProductType(ProductType productType) throws ServiceException;
	
	//根据产品类型ID修改产品类型状态
	public void modifyStatusById(int productTypeId,int productTypeStatus) throws ServiceException;
	
}
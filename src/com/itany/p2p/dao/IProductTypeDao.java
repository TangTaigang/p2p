package com.itany.p2p.dao;

import java.util.List;

import com.itany.p2p.entity.ProductType;
import com.itany.p2p.exception.DataAccessException;

public interface IProductTypeDao {

	//获取所有产品类型(不包括禁用)
	public List getProductType() throws DataAccessException;
	
	//获取所有产品类型(包括禁用)
	public List getAllProductType() throws DataAccessException;
	
	//添加产品类型
	public Object addProductType(ProductType productType) throws DataAccessException;
	
	//修改产品类型名称
	public void modifyProductType(ProductType productType) throws DataAccessException;
	
	//根据产品类型ID修改产品类型状态
	public void modifyStatusById(int productTypeId,int productTypeStatus) throws DataAccessException;
	
}
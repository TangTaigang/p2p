package com.itany.p2p.dao;

import com.itany.p2p.entity.Product;
import com.itany.p2p.exception.DataAccessException;
import com.itany.p2p.util.PageResult;

public interface IProductDao {

	//添加产品
	public Object addProduct(Product product) throws DataAccessException;
	
	//分页查询所有产品
	public PageResult getAllProduct(int pageNo,int pageSize) throws DataAccessException;
	
}
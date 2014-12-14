package com.itany.p2p.dao;

import java.util.List;

import com.itany.p2p.exception.DataAccessException;
import com.itany.p2p.util.PageResult;

public interface IProductManagerDao {
	
	//分页查询融资产品管理页面内容
	@SuppressWarnings("unchecked")
	public PageResult getAllProduct(int pageNo, int pageSize) throws DataAccessException;

	//查询所有在线申请产品信息
	List getAllApplyInfo() throws DataAccessException;

}
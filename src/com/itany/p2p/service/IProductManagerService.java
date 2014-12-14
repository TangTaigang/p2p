package com.itany.p2p.service;

import java.util.List;
import com.itany.p2p.exception.ServiceException;
import com.itany.p2p.util.PageResult;

public interface IProductManagerService {
	
	//分页查询融资产品管理页面内容
	public PageResult getAllProduct(int pageNo, int pageSize) throws ServiceException;
	
	//查询所有在线申请产品信息
	List getAllApplyInfo() throws ServiceException;
	
}

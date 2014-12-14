package com.itany.p2p.service;

import java.util.List;

import com.itany.p2p.exception.ServiceException;

public interface IApplyService {

	//获取所有申请信息
	public List getAllApply(int applyProductId) throws ServiceException;

}
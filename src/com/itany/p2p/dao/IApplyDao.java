package com.itany.p2p.dao;

import java.util.List;

import com.itany.p2p.exception.DataAccessException;

public interface IApplyDao {

	//获取所有申请信息
	public List getAllApply(int applyProductId) throws DataAccessException;

}
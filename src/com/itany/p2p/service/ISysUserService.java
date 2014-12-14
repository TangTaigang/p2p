package com.itany.p2p.service;

import com.itany.p2p.entity.SysUser;
import com.itany.p2p.exception.ServiceException;

public interface ISysUserService {

	//用户登录
	public SysUser login(String name, String password) throws ServiceException;

}
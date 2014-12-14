package com.itany.p2p.service.impl;

import com.itany.p2p.dao.ISysUserDao;
import com.itany.p2p.dao.impl.SysUserDaoImpl;
import com.itany.p2p.entity.SysUser;
import com.itany.p2p.exception.ServiceException;
import com.itany.p2p.service.ISysUserService;

public class SysUserServiceImpl implements ISysUserService {
	
	private ISysUserDao userDao = new SysUserDaoImpl();
	
	//用户登录
	public SysUser login(String name,String password) throws ServiceException{
		SysUser user = null;
		try {
			user = userDao.getSysUserByNamePwd(name, password);
		} catch (Exception e) {
			throw new ServiceException("登录异常!");
		}
		return user;
	}
	
}

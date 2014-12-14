package com.itany.test;


import junit.framework.TestCase;

import com.itany.p2p.entity.SysUser;
import com.itany.p2p.exception.ServiceException;
import com.itany.p2p.service.ISysUserService;
import com.itany.p2p.service.impl.SysUserServiceImpl;

public class SysUserServiceTest extends TestCase{
	
	ISysUserService userService;
	
	@Override
	protected void setUp() throws Exception {
		userService = new SysUserServiceImpl();	
	}
	
	public void testLogin() throws ServiceException{
		SysUser user = userService.login("itany", "itany");
		System.out.println(user.getUserName());
	}
	
}

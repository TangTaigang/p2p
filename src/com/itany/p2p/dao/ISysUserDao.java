package com.itany.p2p.dao;

import com.itany.p2p.entity.SysUser;
import com.itany.p2p.exception.DataAccessException;

public interface ISysUserDao {
	
	//用户登录
	public SysUser getSysUserByNamePwd(String name, String password) throws DataAccessException;
	
}
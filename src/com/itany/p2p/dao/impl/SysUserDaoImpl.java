package com.itany.p2p.dao.impl;

import java.util.List;

import com.itany.p2p.dao.ISysUserDao;
import com.itany.p2p.entity.SysUser;
import com.itany.p2p.exception.DataAccessException;
import com.itany.p2p.mapper.SysUserMapper;
import com.itany.p2p.util.JDBCTemplate;

public class SysUserDaoImpl implements ISysUserDao {
	
	private JDBCTemplate template;
	
	public SysUserDaoImpl(){
		template = new JDBCTemplate();
	}
	
	public SysUser getSysUserByNamePwd(String name,String password) throws DataAccessException{
		String sql = "select *from sysuser where loginname=? and loginpassword=?";
		List list = template.query(sql, new SysUserMapper(), name,password);
		if(list.size()==0){
			return null;
		}
		return (SysUser) list.get(0);
	}
	
}

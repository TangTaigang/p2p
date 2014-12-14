package com.itany.p2p.mapper;

import java.sql.ResultSet;

import com.itany.p2p.entity.SysUser;
import com.itany.p2p.util.RowMapper;

public class SysUserMapper implements RowMapper {

	@Override
	public Object mapRow(ResultSet rs) throws Exception {
		SysUser user = new SysUser();
		user.setUserName(rs.getString("username"));
		user.setLoginName(rs.getString("loginname"));
		return user;
	}

}

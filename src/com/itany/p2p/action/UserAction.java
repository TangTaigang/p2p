package com.itany.p2p.action;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.itany.p2p.entity.SysUser;
import com.itany.p2p.exception.ServiceException;
import com.itany.p2p.service.ISysUserService;
import com.itany.p2p.service.impl.SysUserServiceImpl;

public class UserAction {
	
	//用户登录
	public String login(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		request.setCharacterEncoding("UTF-8");
		String userName = request.getParameter("userName");
		String password = request.getParameter("pwd");
		ISysUserService userService = new SysUserServiceImpl();
		SysUser user=null;
		try {
			user = userService.login(userName, password);
		} catch (ServiceException e) {
			e.printStackTrace();
		}
		if(user!=null){
			request.getSession().setAttribute("sysUser", user);
			return "success";
		} else {
			return "fail";
		}
	}
}

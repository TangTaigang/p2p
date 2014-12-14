package com.itany.p2p.action;

import java.io.UnsupportedEncodingException;
import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.itany.p2p.exception.ServiceException;
import com.itany.p2p.service.IApplyService;
import com.itany.p2p.service.IProductManagerService;
import com.itany.p2p.service.impl.ApplyServiceImpl;
import com.itany.p2p.service.impl.ProductManagerServiceImpl;

public class ApplyyAction {
	
	IProductManagerService productManagerService = new ProductManagerServiceImpl();
	IApplyService applyService = new ApplyServiceImpl();
	
	public String onlineApply(HttpServletRequest request,HttpServletResponse response){
		List list = null;
		try {
			list = productManagerService.getAllApplyInfo();
		} catch (ServiceException e) {
			e.printStackTrace();
		}
		request.setAttribute("applyList", list);
		return "success";
	}
	
	//在线申请产品详情信息
	public String onlineApplyDetail(HttpServletRequest request,HttpServletResponse response){
		try {
			request.setCharacterEncoding("utf-8");
		} catch (UnsupportedEncodingException e1) {
			e1.printStackTrace();
		}
		String productId = request.getParameter("productId").trim();
		List list = null;
		try {
			list = applyService.getAllApply(Integer.parseInt(productId));
		} catch (NumberFormatException e) {
			e.printStackTrace();
		} catch (ServiceException e) {
			e.printStackTrace();
		}
		request.setAttribute("applyList", list);
		return "success";
	}
	
}

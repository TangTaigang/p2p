package com.itany.p2p.action;

import java.io.UnsupportedEncodingException;
import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.itany.p2p.entity.LendingPeriod;
import com.itany.p2p.exception.ServiceException;
import com.itany.p2p.service.ILendingPeriodService;
import com.itany.p2p.service.impl.LendingPeriodServiceImpl;

public class LendingPeriodAction {
	
	ILendingPeriodService lendingPeriodService = new LendingPeriodServiceImpl();
	
	public String showPage(HttpServletRequest request,HttpServletResponse response){
		List list = null;
		try {
			list = lendingPeriodService.getAllLendingPeriod();
		} catch (ServiceException e) {
			e.printStackTrace();
		}
		request.setAttribute("lendingPeriodList", list);
		return "success";
	}
	
	//添加产品周期
	public String lendingPeriodAdd(HttpServletRequest request,HttpServletResponse respons){
		try {
			request.setCharacterEncoding("UTF-8");
		} catch (UnsupportedEncodingException e1) {
			e1.printStackTrace();
		}
		String periodName = request.getParameter("periodName").trim()+"个月";
		LendingPeriod lendingPeriod = new LendingPeriod();
		lendingPeriod.setPeriod(periodName);
		try {
			Object obj = lendingPeriodService.addLendingPeriod(lendingPeriod);
		} catch (ServiceException e) {
			e.printStackTrace();
		}
		return "success";
	}
	
	//修改产品周期
	public String lendingPeriodModify(HttpServletRequest request,HttpServletResponse respons){
		try {
			request.setCharacterEncoding("UTF-8");
		} catch (UnsupportedEncodingException e) {
			e.printStackTrace();
		}
		String periodId = request.getParameter("periodId").trim();
		String periodName = request.getParameter("periodName").trim()+"个月";
		LendingPeriod lendingPeriod = new LendingPeriod();
		lendingPeriod.setLendingPeriodId(Integer.parseInt(periodId));
		lendingPeriod.setPeriod(periodName);
		try {
			lendingPeriodService.modifyLendingPeriodById(lendingPeriod);
		} catch (ServiceException e) {
			e.printStackTrace();
		}
		
		return "success";
	}
	
	//修改产品周期状态
	public String lendingPeriodStatus(HttpServletRequest request,HttpServletResponse respons){
		String lendingPeriodId = request.getParameter("lendingPeriodId").trim();
		String status = request.getParameter("status").trim();
		try {
			lendingPeriodService.modifyStatusById(Integer.parseInt(lendingPeriodId), Integer.parseInt(status));
		} catch (NumberFormatException e) {
			e.printStackTrace();
		} catch (ServiceException e) {
			e.printStackTrace();
		}
		return "success";
	}
	
}

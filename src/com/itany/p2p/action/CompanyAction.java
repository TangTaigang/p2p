package com.itany.p2p.action;

import java.io.UnsupportedEncodingException;
import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.itany.p2p.entity.Company;
import com.itany.p2p.exception.ServiceException;
import com.itany.p2p.service.ICompanyService;
import com.itany.p2p.service.impl.CompanyServiceImpl;

public class CompanyAction {
	
	ICompanyService companyService = new CompanyServiceImpl();
	
	public String showPage(HttpServletRequest request,HttpServletResponse response){
		List list = null;
		try {
			list = companyService.getCompany();
		} catch (ServiceException e) {
			e.printStackTrace();
		}
		request.setAttribute("companyList", list);
		return "success";
	}
	
	//添加企业
	public String companyAdd(HttpServletRequest request,HttpServletResponse response){
		try {
			request.setCharacterEncoding("UTF-8");
		} catch (UnsupportedEncodingException e) {
			e.printStackTrace();
		}
		String companyName = request.getParameter("companyName").trim();
		String commissionNum = request.getParameter("commissionNum").trim();
		String content = request.getParameter("content").trim();
		Company company = new Company();
		company.setCompanyName(companyName);
		company.setFinancingInReturn(Double.parseDouble(commissionNum));
		company.setCompanyDetail(content);
		try {
			companyService.addCompany(company);
		} catch (ServiceException e) {
			e.printStackTrace();
		}
		
		return "success";
	}
	
	//跳转到企业信息修改页面
	public String companyModifyDetail(HttpServletRequest request,HttpServletResponse response){
		String companyId = request.getParameter("companyId").trim();
		List companyList = null;
		try {
			companyList = companyService.getCompanyById(Integer.parseInt(companyId));
		} catch (NumberFormatException e) {
			e.printStackTrace();
		} catch (ServiceException e) {
			e.printStackTrace();
		}
		
		request.setAttribute("company", companyList.get(0));
		return "success";
	}
	
	//修改企业信息
	public String companyModify(HttpServletRequest request,HttpServletResponse response){
		try {
			request.setCharacterEncoding("UTF-8");
		} catch (UnsupportedEncodingException e) {
			e.printStackTrace();
		}
		String companyId = request.getParameter("companyId").trim();
		String companyName = request.getParameter("companyName").trim();
		String financingInReturn = request.getParameter("financingInReturn");
		String content = request.getParameter("content");
		Company company = new Company();
		company.setCompanyId(Integer.parseInt(companyId));
		company.setCompanyName(companyName);
		company.setFinancingInReturn(Double.parseDouble(financingInReturn));
		company.setCompanyDetail(content);
		try {
			companyService.modifyCompany(company);
		} catch (ServiceException e) {
			e.printStackTrace();
		}
		return "success";
	}
	
	//企业详情
	public String companyDetail(HttpServletRequest request,HttpServletResponse response){
		String companyId = request.getParameter("companyId").trim();
		List companyList = null;
		try {
			companyList = companyService.getCompanyById(Integer.parseInt(companyId));
		} catch (NumberFormatException e) {
			e.printStackTrace();
		} catch (ServiceException e) {
			e.printStackTrace();
		}
		
		request.setAttribute("company", companyList.get(0));
		return "success";
	}
	
	//删除企业
	public String companyDelete(HttpServletRequest request,HttpServletResponse response){
		String companyId = request.getParameter("companyId").trim();
		
System.out.println(companyId);

		try {
			companyService.deleteCompanyById(Integer.parseInt(companyId));
		} catch (NumberFormatException e) {
			e.printStackTrace();
		} catch (ServiceException e) {
			e.printStackTrace();
		}
		return "success";
	}
	
	
}

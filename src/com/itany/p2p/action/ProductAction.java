package com.itany.p2p.action;

import java.io.UnsupportedEncodingException;
import java.util.Date;
import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.itany.p2p.entity.Product;
import com.itany.p2p.exception.ServiceException;
import com.itany.p2p.service.ICompanyService;
import com.itany.p2p.service.ILendingPeriodService;
import com.itany.p2p.service.IProductManagerService;
import com.itany.p2p.service.IProductService;
import com.itany.p2p.service.IProductTypeService;
import com.itany.p2p.service.impl.CompanyServiceImpl;
import com.itany.p2p.service.impl.LendingPeriodServiceImpl;
import com.itany.p2p.service.impl.ProductManagerServiceImpl;
import com.itany.p2p.service.impl.ProductServiceImpl;
import com.itany.p2p.service.impl.ProductTypeServiceImpl;
import com.itany.p2p.util.PageResult;
import com.itany.p2p.vo.ProductBean;

public class ProductAction {
	
	ICompanyService companyService = new CompanyServiceImpl();
	IProductTypeService productTypeService = new ProductTypeServiceImpl();
	ILendingPeriodService lendingPeriodService = new LendingPeriodServiceImpl();
	IProductService productService = new ProductServiceImpl();
	IProductManagerService productManagerService = new ProductManagerServiceImpl();
	
	//跳转添加产品页面
	public String forwardPage(HttpServletRequest request, HttpServletResponse response){
		List companyList = null;
		List productTypeList = null;
		List lengdingPeriodList = null;
		try {
			companyList = companyService.getCompany();
			productTypeList = productTypeService.getProductType();
			lengdingPeriodList = lendingPeriodService.getLendingPeriod();
		} catch (ServiceException e) {
			e.printStackTrace();
		}
		ProductBean productBean = new ProductBean();
		productBean.setCompany(companyList);
		productBean.setProductType(productTypeList);
		productBean.setLendingPeriod(lengdingPeriodList);
		request.setAttribute("productBean", productBean);
		return "success";
	}
	
	//添加产品
	public String productAdd(HttpServletRequest request, HttpServletResponse response){
		try {
			request.setCharacterEncoding("UTF-8");
		} catch (UnsupportedEncodingException e) {
			e.printStackTrace();
		}
		String productName = request.getParameter("productName").trim();
		String primeLendingRateFrom = request.getParameter("primeLendingRateFrom").trim();
		String primeLendingRateTo = request.getParameter("primeLendingRateTo").trim();
		String company = request.getParameter("company").trim();
		String financingAmountFrom = request.getParameter("financingAmountFrom").trim();
		String financingAmountTo = request.getParameter("financingAmountTo").trim();
		String productType = request.getParameter("productType").trim();
		String lendingPeriod = request.getParameter("lendingPeriod").trim();
		String linkMan = request.getParameter("linkman").trim();
		String ownedBank = request.getParameter("ownedBank").trim();
		String content = request.getParameter("content").trim();
		
		Date date = new Date();
		Product product = new Product();
		product.setProductName(productName);
		product.setPrimeLendingRateFrom(Double.parseDouble(primeLendingRateFrom));
		product.setPrimeLendingRateTo(Double.parseDouble(primeLendingRateTo));
		product.setCompany(Integer.parseInt(company));
		product.setFinancingAmountFrom(Integer.parseInt(financingAmountFrom));
		product.setFinancingAmountTo(Integer.parseInt(financingAmountTo));
		product.setProductType(Integer.parseInt(productType));
		product.setLendingPeriod(Integer.parseInt(lendingPeriod));
		product.setLinkMan(linkMan);
		product.setOwnedBank(ownedBank);
		product.setProductDescription(content);
		product.setCreateTime(date);
		
		Object obj = null;
		try {
			obj = productService.addProduct(product);
		} catch (ServiceException e) {
			e.printStackTrace();
		}
		if(obj!=null){
			return "success";
		} else{
			return "fail";
		}
	}
	
	//融资产品管理分页显示
	public String productManage(HttpServletRequest request, HttpServletResponse response){
		String pageNo = request.getParameter("pageNo");
		if(pageNo==null || pageNo==""){
			pageNo = "1";
		}
System.out.println("------------------------------------"+pageNo);
		PageResult pageResult = null;
		try {
			pageResult = productManagerService.getAllProduct(Integer.parseInt(pageNo.trim()), 10);
		} catch (NumberFormatException e) {
			e.printStackTrace();
		} catch (ServiceException e) {
			e.printStackTrace();
		}
		request.setAttribute("pageResult", pageResult);
		return "success";
	}
	
}

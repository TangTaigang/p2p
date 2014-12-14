package com.itany.p2p.action;

import java.io.UnsupportedEncodingException;
import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.itany.p2p.entity.ProductType;
import com.itany.p2p.exception.ServiceException;
import com.itany.p2p.service.IProductTypeService;
import com.itany.p2p.service.impl.ProductTypeServiceImpl;

public class ProductTypeAction {
	
	IProductTypeService productTypeService = new ProductTypeServiceImpl();
	
	public String showPage(HttpServletRequest request,HttpServletResponse response){
		List list = null;
		try {
			list = productTypeService.getAllProductType();
		} catch (ServiceException e) {
			e.printStackTrace();
		}
		request.setAttribute("productTypeList", list);
		return "success";
	}
	
	//添加产品类型
	public String productTypeAdd(HttpServletRequest request,HttpServletResponse response){
		try {
			request.setCharacterEncoding("UTF-8");
		} catch (UnsupportedEncodingException e1) {
			e1.printStackTrace();
		}
		String productTypeName = request.getParameter("productTypeName").trim();
		ProductType productType = new ProductType();
		productType.setProductTypeName(productTypeName);
		try {
			Object obj = productTypeService.addProductType(productType);
		} catch (ServiceException e) {
			e.printStackTrace();
		}
		return "success";
	}
	
	//修改产品类型
	public String productTypeModify(HttpServletRequest request,HttpServletResponse response){
		try {
			request.setCharacterEncoding("UTF-8");
		} catch (UnsupportedEncodingException e1) {
			e1.printStackTrace();
		}
		String productTypeId = request.getParameter("productTypeId").trim();
		String productTypeName = request.getParameter("productTypeName").trim();
		ProductType productType = new ProductType();
		productType.setProductTypeId(Integer.parseInt(productTypeId));
		productType.setProductTypeName(productTypeName);
		try {
			productTypeService.modifyProductType(productType);
		} catch (ServiceException e) {
			e.printStackTrace();
		}
		return "success";
	}
	
	//产品类型状态修改
	public String productTypeStatus(HttpServletRequest request,HttpServletResponse response){
		String productTypeId = request.getParameter("productTypeId").trim();
		String status = request.getParameter("status").trim();
		try {
			productTypeService.modifyStatusById(Integer.parseInt(productTypeId), Integer.parseInt(status));
		} catch (NumberFormatException e) {
			e.printStackTrace();
		} catch (ServiceException e) {
			e.printStackTrace();
		}
		return "success";
	}
	
}

package com.itany.p2p.action;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.itany.p2p.exception.ServiceException;
import com.itany.p2p.service.IProductService;
import com.itany.p2p.service.impl.ProductServiceImpl;
import com.itany.p2p.util.PageResult;

public class IndexAction {
	
	IProductService productService = new ProductServiceImpl();
	
	public String showIndex(HttpServletRequest request,HttpServletResponse response){
		String pageNo = request.getParameter("pageNo");
		if(pageNo==null || pageNo==""){
			pageNo = "1";
		}
System.out.println("------------------------------------"+pageNo);
		PageResult pageResult = null;
		try {
			pageResult = productService.getAllProduct(Integer.parseInt(pageNo.trim()), 10);
		} catch (NumberFormatException e) {
			e.printStackTrace();
		} catch (ServiceException e) {
			e.printStackTrace();
		}
		request.setAttribute("pageResult", pageResult);
		return "success";
	}
	
}

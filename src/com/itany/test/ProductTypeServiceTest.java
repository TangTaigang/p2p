package com.itany.test;

import java.util.List;

import junit.framework.TestCase;

import com.itany.p2p.entity.ProductType;
import com.itany.p2p.exception.ServiceException;
import com.itany.p2p.service.IProductTypeService;
import com.itany.p2p.service.impl.ProductTypeServiceImpl;

public class ProductTypeServiceTest extends TestCase{
	
	IProductTypeService productTypeService;
	
	@Override
	protected void setUp() throws Exception {
		productTypeService = new ProductTypeServiceImpl();
	}
	
	public void testGetProductType() throws ServiceException{
		List list = productTypeService.getProductType();
		for (int i = 0; i < list.size(); i++) {
			System.out.println(((ProductType)list.get(i)).getProductTypeName());
		}
		
	}

}

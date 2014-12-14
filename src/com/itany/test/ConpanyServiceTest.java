package com.itany.test;

import java.util.List;

import junit.framework.TestCase;

import com.itany.p2p.entity.Company;
import com.itany.p2p.exception.ServiceException;
import com.itany.p2p.service.ICompanyService;
import com.itany.p2p.service.impl.CompanyServiceImpl;

public class ConpanyServiceTest extends TestCase {
	
	ICompanyService companyService;
	
	@Override
	protected void setUp() throws Exception {
		companyService = new CompanyServiceImpl();
	}
	
	public void testGetCompany() throws ServiceException{
		List list = companyService.getCompany();
		for (int i = 0; i < list.size(); i++) {
			System.out.println(((Company)list.get(i)).getCompanyName());
		}
		
	}
	
}

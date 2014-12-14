package com.itany.p2p.service;

import java.util.List;

import com.itany.p2p.entity.Company;
import com.itany.p2p.exception.ServiceException;

public interface ICompanyService {
	
	//获取所有公司
	public List getCompany() throws ServiceException;
	
	//添加企业
	public Object addCompany(Company company) throws ServiceException;
	
	//修改企业
	public void modifyCompany(Company company) throws ServiceException;
	
	//根据企业ID查找企业
	public List getCompanyById(int companyId) throws ServiceException;
	
	//根据企业ID删除企业
	public void deleteCompanyById(int companyId) throws ServiceException;
	
}
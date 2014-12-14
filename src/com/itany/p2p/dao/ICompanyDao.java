package com.itany.p2p.dao;

import java.util.List;

import com.itany.p2p.entity.Company;
import com.itany.p2p.exception.DataAccessException;

public interface ICompanyDao {

	//获取所有企业
	public List getCompany() throws DataAccessException;
	
	//添加企业
	public Object addCompany(Company company) throws DataAccessException;
	
	//修改企业
	public void modifyCompanyById(Company company) throws DataAccessException;
	
	//根据企业ID查找企业
	public List getCompanyById(int companyId) throws DataAccessException;
	
	//根据企业ID删除企业
	public void deleteCompanyById(int companyId) throws DataAccessException;
	
}
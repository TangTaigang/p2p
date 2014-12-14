package com.itany.p2p.service.impl;

import java.util.List;

import com.itany.p2p.dao.ICompanyDao;
import com.itany.p2p.dao.impl.CompanyDaoImpl;
import com.itany.p2p.entity.Company;
import com.itany.p2p.exception.DataAccessException;
import com.itany.p2p.exception.ServiceException;
import com.itany.p2p.service.ICompanyService;

public class CompanyServiceImpl implements ICompanyService {
	
	private ICompanyDao companyDao = new CompanyDaoImpl();
	
	//获取所有公司
	public List getCompany() throws ServiceException{
		List list = null;
		try {
			list = companyDao.getCompany();
		} catch (DataAccessException e) {
			e.printStackTrace();
			throw new ServiceException();
		}
		return list;
	}

	//添加企业
	public Object addCompany(Company company) throws ServiceException {
		Object obj = null;
		try {
			obj = companyDao.addCompany(company);
		} catch (DataAccessException e) {
			e.printStackTrace();
			throw new ServiceException();
		}
		return obj;
	}

	//修改企业
	public void modifyCompany(Company company) throws ServiceException {
		try {
			companyDao.modifyCompanyById(company);
		} catch (DataAccessException e) {
			e.printStackTrace();
			throw new ServiceException();
		}
		
	}

	//根据企业ID查找企业
	public List getCompanyById(int companyId) throws ServiceException {
		List list = null;
		try {
			list = companyDao.getCompanyById(companyId);
		} catch (DataAccessException e) {
			e.printStackTrace();
			throw new ServiceException();
		}
		return list;
	}

	//根据企业ID删除企业
	public void deleteCompanyById(int companyId) throws ServiceException {
		try {
			companyDao.deleteCompanyById(companyId);
		} catch (DataAccessException e) {
			e.printStackTrace();
			throw new ServiceException();
		}
		
	}
	
}

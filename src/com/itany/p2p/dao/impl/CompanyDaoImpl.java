package com.itany.p2p.dao.impl;

import java.util.List;

import com.itany.p2p.dao.ICompanyDao;
import com.itany.p2p.entity.Company;
import com.itany.p2p.exception.DataAccessException;
import com.itany.p2p.mapper.CompanyMapper;
import com.itany.p2p.util.JDBCTemplate;

public class CompanyDaoImpl implements ICompanyDao {
	
	private JDBCTemplate template;
	
	public CompanyDaoImpl(){
		template = new JDBCTemplate();
	}
	
	//获取所有企业
	public List getCompany() throws DataAccessException{
		String sql = "select *from company";
		List list = template.query(sql, new CompanyMapper());
		return list;
	}

	//添加企业
	public Object addCompany(Company company) throws DataAccessException {
		String sql = "insert into company values(sequence_company_id.nextval,?,?,?)";
		Object obj = template.save(sql, company.getCompanyName(),company.getFinancingInReturn(),company.getCompanyDetail());
		return obj;
	}

	//根据ID修改企业
	public void modifyCompanyById(Company company) throws DataAccessException {
		String sql = "update company set companyname=?,financinginreturn=?,companydetail=? where companyid=?";
		template.update(sql, company.getCompanyName(),company.getFinancingInReturn(),
							 company.getCompanyDetail(),company.getCompanyId());	
	}
	
	//根据企业ID查找企业
	public List getCompanyById(int companyId) throws DataAccessException{
		String sql = "select *from company where companyid=?";
		List list = template.query(sql, new CompanyMapper(), companyId);
		return list;
	}

	//根据企业ID删除企业
	public void deleteCompanyById(int companyId) throws DataAccessException {
		String sql = "delete from company where companyid=?";
		template.update(sql, companyId);
		
	}
	
}

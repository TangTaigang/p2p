package com.itany.p2p.mapper;

import java.sql.ResultSet;

import com.itany.p2p.entity.Company;
import com.itany.p2p.util.RowMapper;

public class CompanyMapper implements RowMapper {

	@Override
	public Object mapRow(ResultSet rs) throws Exception {
		Company company = new Company();
		company.setCompanyId(rs.getInt("COMPANYID"));
		company.setCompanyName(rs.getString("COMPANYNAME"));
		company.setFinancingInReturn(rs.getDouble("FINANCINGINRETURN"));
		company.setCompanyDetail(rs.getString("COMPANYDETAIL"));
		return company;
	}

}

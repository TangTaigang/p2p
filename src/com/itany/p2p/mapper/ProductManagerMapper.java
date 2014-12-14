package com.itany.p2p.mapper;

import java.sql.ResultSet;

import com.itany.p2p.entity.ProductManager;
import com.itany.p2p.util.RowMapper;

public class ProductManagerMapper implements RowMapper{

	public Object mapRow(ResultSet rs) throws Exception {
		ProductManager productManager = new ProductManager();
		productManager.setProductId(rs.getInt("productid"));
		productManager.setProductName(rs.getString("productname"));
		productManager.setCompanyName(rs.getString("companyName"));
		productManager.setProductTypeName(rs.getString("producttypename"));
		productManager.setPeriod(rs.getString("period"));
		productManager.setPrimeLendingRateFrom(rs.getDouble("primelendingratefrom"));
		productManager.setPrimeLendingRateTo(rs.getDouble("primelendingrateto"));
		productManager.setFinancingAmountFrom(rs.getInt("financingAmountFrom"));
		productManager.setFinancingAmountTo(rs.getInt("financingAmountTo"));
		
		return productManager;
	}
	
}

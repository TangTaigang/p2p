package com.itany.p2p.mapper;

import java.sql.ResultSet;

import com.itany.p2p.entity.ProductType;
import com.itany.p2p.util.RowMapper;

public class ProductTypeMapper implements RowMapper {

	@Override
	public Object mapRow(ResultSet rs) throws Exception {
		ProductType productType = new ProductType();
		productType.setProductTypeId(rs.getInt("PRODUCTTYPEID"));
		productType.setProductTypeName(rs.getString("PRODUCTTYPENAME"));
		productType.setStatus(rs.getInt("STATUS"));
		return productType;
	}

}

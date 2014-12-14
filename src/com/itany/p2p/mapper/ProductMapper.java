package com.itany.p2p.mapper;

import java.sql.ResultSet;

import com.itany.p2p.util.RowMapper;
import com.itany.p2p.vo.ProductInfo;

public class ProductMapper implements RowMapper {

	public Object mapRow(ResultSet rs) throws Exception {
		ProductInfo productInfo = new ProductInfo();
		productInfo.setProductId(rs.getInt("productId"));
		productInfo.setProductName(rs.getString("productName"));
		productInfo.setProductTypeName(rs.getString("productTypeName"));
		productInfo.setCompanyName(rs.getString("companyName"));
		productInfo.setOwnedBank(rs.getString("ownedBank"));
		productInfo.setPeriod(rs.getString("period"));
		productInfo.setLinkMan(rs.getString("linkMan"));
		productInfo.setProductDescription(rs.getString("productDescription"));
		productInfo.setPrimeLendingRateFrom(rs.getDouble("primeLendingRateFrom"));
		productInfo.setPrimeLendingRateFrom(rs.getDouble("primeLendingRateTo"));
		productInfo.setFinancingAmountFrom(rs.getInt("financingAmountFrom"));
		productInfo.setFinancingAmountTo(rs.getInt("financingAmountTo"));
		return productInfo;
	}

}

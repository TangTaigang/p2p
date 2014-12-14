package com.itany.p2p.dao.impl;

import java.util.List;

import com.itany.p2p.dao.IProductTypeDao;
import com.itany.p2p.entity.ProductType;
import com.itany.p2p.exception.DataAccessException;
import com.itany.p2p.mapper.ProductTypeMapper;
import com.itany.p2p.util.JDBCTemplate;

public class ProductTypeDaoImpl implements IProductTypeDao {
	
private JDBCTemplate template;
	
	public ProductTypeDaoImpl(){
		template = new JDBCTemplate();
	}
	
	//获取所有产品类型(不包括禁用)
	public List getProductType() throws DataAccessException{
		String sql = "select * from producttype where status=0";
		List list = template.query(sql, new ProductTypeMapper());
		return list;
	}
	
	//获取所有产品类型（包括禁用）
	public List getAllProductType() throws DataAccessException{
		String sql = "select * from producttype order by producttypeid";
		List list = template.query(sql, new ProductTypeMapper());
		return list;
	}

	//添加产品类型
	public Object addProductType(ProductType productType) throws DataAccessException {
		String sql = "insert into productType values(sequence_productType_id.nextval,?,0)";
		Object obj = template.save(sql, productType.getProductTypeName());
		return obj;
	}

	//修改产品类型名称
	public void modifyProductType(ProductType productType) throws DataAccessException {
		String sql = "update productType set producttypename=? where producttypeid=?";
		template.update(sql, productType.getProductTypeName(),productType.getProductTypeId());
		
	}

	//根据产品类型ID修改产品类型状态
	public void modifyStatusById(int productTypeId,int productTypeStatus) throws DataAccessException {
		String sql = "update productType set status=? where producttypeid=?";
		template.update(sql, productTypeStatus,productTypeId);
		
	}
	
}

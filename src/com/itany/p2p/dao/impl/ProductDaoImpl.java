package com.itany.p2p.dao.impl;

import com.itany.p2p.dao.IProductDao;
import com.itany.p2p.entity.Product;
import com.itany.p2p.exception.DataAccessException;
import com.itany.p2p.mapper.ProductMapper;
import com.itany.p2p.util.JDBCTemplate;
import com.itany.p2p.util.PageResult;

public class ProductDaoImpl implements IProductDao {

	private JDBCTemplate template;
	
	public ProductDaoImpl(){
		template = new JDBCTemplate();
	}
	
	//添加产品
	public Object addProduct(Product product) throws DataAccessException{
		String sql = "insert into product (productid,productname,primelendingratefrom,primelendingrateto," +
				"company,financingamountfrom,financingamountto,producttype,lendingperiod,linkman,ownedbank," +
				"productdescription,createtime) values(sequence_product_id.nextval,?,?,?,?,?,?,?,?,?,?,?,?)";
		Object obj = template.save(sql, product.getProductName(),product.getPrimeLendingRateFrom(),
				product.getPrimeLendingRateTo(),product.getCompany(),product.getFinancingAmountFrom(),
				product.getFinancingAmountTo(),product.getProductType(),product.getLendingPeriod(),
				product.getLinkMan(),product.getOwnedBank(),product.getProductDescription(),
				product.getCreateTime());
		
		return obj;
	}

	//分页查询所有产品
	public PageResult getAllProduct(int pageNo, int pageSize) throws DataAccessException {
		String sql = "select p.*,pd.producttypename,co.companyname,le.period from product p," +
					 "producttype pd ,company co,lendingperiod le where 1=1 and p.producttype = pd.producttypeid " +
					 "and p.company=co.companyid and p.lendingperiod=le.lendingperiodid";
		PageResult pageResult = template.findPageBySql4Oracle(sql, new ProductMapper(), pageNo, pageSize);
		return pageResult;
	}
	
	
}

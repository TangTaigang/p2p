package com.itany.p2p.dao.impl;

import java.util.List;

import com.itany.p2p.dao.IProductManagerDao;
import com.itany.p2p.exception.DataAccessException;
import com.itany.p2p.mapper.ProductManagerMapper;
import com.itany.p2p.util.JDBCTemplate;
import com.itany.p2p.util.PageResult;

public class ProductManagerDaoImpl implements IProductManagerDao {
	
	private JDBCTemplate template;
	
	public ProductManagerDaoImpl(){
		template = new JDBCTemplate();
	}
	
	//查询所有在线申请产品信息
	public List getAllApplyInfo() throws DataAccessException{
		String sql = "select pro.productid,pro.productname,co.companyname,pt.producttypename," +
					 "le.period,pro.primelendingratefrom,pro.primelendingrateto,pro.financingAmountFrom," +
					 "pro.financingAmountTo from (select distinct applyproductid from apply) ap," +
					 "(select *from product) pro,(select *from lendingperiod) le,(select *from producttype) pt," +
					 "(select *from company)co where pro.producttype=pt.producttypeid " +
					 "and le.lendingperiodid=pro.lendingperiod and ap.applyproductid=pro.productid" +
					 " and pro.company=co.companyid";
		List list = template.query(sql, new ProductManagerMapper());
		return list;
	}
	
	//分页查询融资产品管理页面内容
	public PageResult getAllProduct(int pageNo,int pageSize) throws DataAccessException{
		String sql = "  select pro.productid,pro.productname,co.companyname,pt.producttypename," +
					 "le.period,pro.primelendingratefrom,pro.primelendingrateto,pro.financingAmountFrom," +
					 "pro.financingAmountTo from (select *from product) pro," +
					 "(select *from lendingperiod) le,(select *from producttype) pt," +
					 "(select *from company)co where pro.producttype=pt.producttypeid " +
					 "and le.lendingperiodid=pro.lendingperiod and pro.company=co.companyid " +
					 "order by productid";
		PageResult pageResult = template.findPageBySql4Oracle(sql, new ProductManagerMapper(), pageNo, pageSize);
		
		return pageResult;
	}
	
	
}

package com.itany.test;

import java.util.Date;
import junit.framework.TestCase;

import com.itany.p2p.entity.Product;
import com.itany.p2p.exception.ServiceException;
import com.itany.p2p.service.IProductService;
import com.itany.p2p.service.impl.ProductServiceImpl;

public class ProductServiceTest extends TestCase {
	

	IProductService productService;
	
	@Override
	protected void setUp() throws Exception {
		productService = new ProductServiceImpl();
	}
	
	public void testAdd() throws ServiceException{
		String[] s1 = new String[]{"格力集团贷","光线传媒贷","华谊兄弟贷","苏商贷","京东贷"};
		String[] s2 = new String[]{"杭州银行","中国建设银行","中国民生银行","招商银行","江苏银行","中国邮政储蓄"};
		for (int i = 0; i < 100; i++) {
		
			Product product = new Product();
			product.setProductName(s1[4]);
			product.setPrimeLendingRateFrom(11);
			product.setPrimeLendingRateTo(13.5);
			product.setCompany(12);
			product.setFinancingAmountFrom(50);
			product.setFinancingAmountTo(1000);
			product.setProductType(111);
			product.setLendingPeriod(4);
			product.setLinkMan("王经理");
			product.setOwnedBank(s1[3]);
			product.setProductDescription("银投联贷业务是指对于合作范围内的PE拟投或已投的科技型中小企业的借款申请，本行在综合考虑私募股权投资机构的投资管理能力和借款人未来发展前景等因素的基础上，以信用、股权质押、PE保证或类保证等方式，向科技型中小企业发放用于满足其日常经营资金需求的授信业务。");
			Date date = new Date();
			product.setCreateTime(date);
			
			productService.addProduct(product);
		}
	}

}

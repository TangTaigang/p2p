package com.itany.p2p.vo;

import java.util.List;

import com.itany.p2p.entity.Company;
import com.itany.p2p.entity.LendingPeriod;
import com.itany.p2p.entity.ProductType;

public class ProductBean {
	
	private List<Company> company;
	private List<ProductType> productType;
	private List<LendingPeriod> lendingPeriod;
	
	public ProductBean(){
	}
	
	public ProductBean( List<Company> company,List<ProductType> productType,List<LendingPeriod> lendingPeriod){
		this.company = company;
		this.productType = productType;
		this.lendingPeriod = lendingPeriod;
	}
	
	public List<Company> getCompany() {
		return company;
	}
	public void setCompany(List<Company> company) {
		this.company = company;
	}
	public List<ProductType> getProductType() {
		return productType;
	}
	public void setProductType(List<ProductType> productType) {
		this.productType = productType;
	}
	public List<LendingPeriod> getLendingPeriod() {
		return lendingPeriod;
	}
	public void setLendingPeriod(List<LendingPeriod> lendingPeriod) {
		this.lendingPeriod = lendingPeriod;
	}
	
}

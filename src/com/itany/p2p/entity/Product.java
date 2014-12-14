package com.itany.p2p.entity;

import java.util.Date;

public class Product {
	
	private int productId;
	//产品名称
	private String productName;
	//产品利率
	private double primeLendingRateFrom;
	
	private double primeLendingRateTo;
	
	private int company;
	//产品金额
	private int financingAmountFrom;
	
	private int financingAmountTo;
	
	private int productType;
	//产品周期
	private int lendingPeriod;
	//经理
	private String linkMan;
	//所属银行
	private String ownedBank;
	
	private String productDescription;
	
	private Date createTime;
	
	public Product(){
		
	}
	
	public int getProductId() {
		return productId;
	}
	public void setProductId(int productId) {
		this.productId = productId;
	}
	public String getProductName() {
		return productName;
	}
	public void setProductName(String productName) {
		this.productName = productName;
	}
	public double getPrimeLendingRateFrom() {
		return primeLendingRateFrom;
	}
	public void setPrimeLendingRateFrom(double primeLendingRateFrom) {
		this.primeLendingRateFrom = primeLendingRateFrom;
	}
	public double getPrimeLendingRateTo() {
		return primeLendingRateTo;
	}
	public void setPrimeLendingRateTo(double primeLendingRateTo) {
		this.primeLendingRateTo = primeLendingRateTo;
	}
	public int getCompany() {
		return company;
	}
	public void setCompany(int company) {
		this.company = company;
	}
	public int getFinancingAmountFrom() {
		return financingAmountFrom;
	}
	public void setFinancingAmountFrom(int financingAmountFrom) {
		this.financingAmountFrom = financingAmountFrom;
	}
	public int getFinancingAmountTo() {
		return financingAmountTo;
	}
	public void setFinancingAmountTo(int financingAmountTo) {
		this.financingAmountTo = financingAmountTo;
	}
	public int getProductType() {
		return productType;
	}
	public void setProductType(int productType) {
		this.productType = productType;
	}
	public int getLendingPeriod() {
		return lendingPeriod;
	}
	public void setLendingPeriod(int lendingPeriod) {
		this.lendingPeriod = lendingPeriod;
	}
	public String getLinkMan() {
		return linkMan;
	}
	public void setLinkMan(String linkMan) {
		this.linkMan = linkMan;
	}
	public String getOwnedBank() {
		return ownedBank;
	}
	public void setOwnedBank(String ownedBank) {
		this.ownedBank = ownedBank;
	}
	public String getProductDescription() {
		return productDescription;
	}
	public void setProductDescription(String productDescription) {
		this.productDescription = productDescription;
	}
	public Date getCreateTime() {
		return createTime;
	}
	public void setCreateTime(Date createTime) {
		this.createTime = createTime;
	}
	
	
	
}

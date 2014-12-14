package com.itany.p2p.vo;

public class ProductInfo {
	
	private int productId;
	private String productName;
	private String ownedBank;
	private String productTypeName;
	private String companyName;
	private String period;
	private String linkMan;
	private String productDescription;
	private double primeLendingRateFrom;
	private double primeLendingRateTo;
	private int financingAmountFrom;
	private int financingAmountTo;
	
	public String getProductDescription() {
		return productDescription;
	}
	public void setProductDescription(String productDescription) {
		this.productDescription = productDescription;
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
	public String getOwnedBank() {
		return ownedBank;
	}
	public void setOwnedBank(String ownedBank) {
		this.ownedBank = ownedBank;
	}
	public String getProductTypeName() {
		return productTypeName;
	}
	public void setProductTypeName(String productTypeName) {
		this.productTypeName = productTypeName;
	}
	public String getCompanyName() {
		return companyName;
	}
	public void setCompanyName(String companyName) {
		this.companyName = companyName;
	}
	public String getPeriod() {
		return period;
	}
	public void setPeriod(String period) {
		this.period = period;
	}
	public String getLinkMan() {
		return linkMan;
	}
	public void setLinkMan(String linkMan) {
		this.linkMan = linkMan;
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
	
}

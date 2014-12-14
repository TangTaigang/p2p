package com.itany.p2p.entity;

public class ProductManager {
	
	private int productId;
	private String productName;
	private String companyName;
	private String productTypeName;
	private String period;
	private double primeLendingRateFrom;
	private double primeLendingRateTo;
	private int financingAmountFrom;
	private int financingAmountTo;
	
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
	public String getCompanyName() {
		return companyName;
	}
	public void setCompanyName(String companyName) {
		this.companyName = companyName;
	}
	public String getProductTypeName() {
		return productTypeName;
	}
	public void setProductTypeName(String productTypeName) {
		this.productTypeName = productTypeName;
	}
	public String getPeriod() {
		return period;
	}
	public void setPeriod(String period) {
		this.period = period;
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

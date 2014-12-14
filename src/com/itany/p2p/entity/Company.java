package com.itany.p2p.entity;

public class Company {
	
	private int companyId;
	//企业名称
	private String companyName;
	//佣金
	private double financingInReturn;
	//企业详情
	private String companyDetail;
	
	public Company(){
		
	}
	
	public int getCompanyId() {
		return companyId;
	}
	public void setCompanyId(int companyId) {
		this.companyId = companyId;
	}
	public String getCompanyName() {
		return companyName;
	}
	public void setCompanyName(String companyName) {
		this.companyName = companyName;
	}
	public double getFinancingInReturn() {
		return financingInReturn;
	}
	public void setFinancingInReturn(double financingInReturn) {
		this.financingInReturn = financingInReturn;
	}
	public String getCompanyDetail() {
		return companyDetail;
	}
	public void setCompanyDetail(String companyDetail) {
		this.companyDetail = companyDetail;
	}
	
}

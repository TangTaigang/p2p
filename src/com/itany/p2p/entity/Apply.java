package com.itany.p2p.entity;

import java.sql.Date;

public class Apply {
	
	private int applyId;
	
	private String applyPerson;
	
	private String applyPersonIDCard;
	
	private Date applyDate;
	
	private String applyProductName;
	
	private int applyProductId;
	
	private int applyNum;
	
	public Apply(){
		
	}

	public int getApplyId() {
		return applyId;
	}

	public void setApplyId(int applyId) {
		this.applyId = applyId;
	}

	public String getApplyPerson() {
		return applyPerson;
	}

	public void setApplyPerson(String applyPerson) {
		this.applyPerson = applyPerson;
	}

	public String getApplyPersonIDCard() {
		return applyPersonIDCard;
	}

	public void setApplyPersonIDCard(String applyPersonIDCard) {
		this.applyPersonIDCard = applyPersonIDCard;
	}

	public Date getApplyDate() {
		return applyDate;
	}

	public void setApplyDate(Date applyDate) {
		this.applyDate = applyDate;
	}

	public String getApplyProductName() {
		return applyProductName;
	}

	public void setApplyProductName(String applyProductName) {
		this.applyProductName = applyProductName;
	}

	public int getApplyProductId() {
		return applyProductId;
	}

	public void setApplyProductId(int applyProductId) {
		this.applyProductId = applyProductId;
	}

	public int getApplyNum() {
		return applyNum;
	}

	public void setApplyNum(int applyNum) {
		this.applyNum = applyNum;
	}
	
	
	
}

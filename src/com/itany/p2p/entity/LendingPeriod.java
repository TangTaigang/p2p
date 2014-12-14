package com.itany.p2p.entity;

public class LendingPeriod {
	
	private int lendingPeriodId;
	
	private String period;
	
	private int status;

	public LendingPeriod(){
		
	}
	
	public int getStatus() {
		return status;
	}
	
	public void setStatus(int status) {
		this.status = status;
	}

	public int getLendingPeriodId() {
		return lendingPeriodId;
	}

	public void setLendingPeriodId(int lendingPeriodId) {
		this.lendingPeriodId = lendingPeriodId;
	}

	public String getPeriod() {
		return period;
	}

	public void setPeriod(String period) {
		this.period = period;
	}
	
}

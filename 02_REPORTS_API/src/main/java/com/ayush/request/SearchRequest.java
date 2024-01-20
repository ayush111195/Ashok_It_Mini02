package com.ayush.request;

import java.time.LocalDate;

public class SearchRequest {

	private String planName;
	
	private String planSatatus;
	
	private LocalDate planStartDate;
	
	private LocalDate planEndDate;

	public String getPlanName() {
		return planName;
	}

	public void setPlanName(String planName) {
		this.planName = planName;
	}

	public String getPlanSatatus() {
		return planSatatus;
	}

	public void setPlanSatatus(String planSatatus) {
		this.planSatatus = planSatatus;
	}

	public LocalDate getPlanStartDate() {
		return planStartDate;
	}

	public void setPlanStartDate(LocalDate planStartDate) {
		this.planStartDate = planStartDate;
	}

	public LocalDate getPlanEndDate() {
		return planEndDate;
	}

	public void setPlanEndDate(LocalDate planEndDate) {
		this.planEndDate = planEndDate;
	}

	public SearchRequest(String planName, String planSatatus, LocalDate planStartDate, LocalDate planEndDate) {
		super();
		this.planName = planName;
		this.planSatatus = planSatatus;
		this.planStartDate = planStartDate;
		this.planEndDate = planEndDate;
	}

	public SearchRequest() {
		super();
	}
	
	
}

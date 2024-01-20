package com.ayush.responce;

public class SearchResponce {


	private String name;
	
	private Long mobile;

	private String email;

	private Character gender;
	
	private Long ssn;
	
	private String planName;
	
	private String planStatus;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Long getMobile() {
		return mobile;
	}

	public void setMobile(Long mobile) {
		this.mobile = mobile;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public Character getGender() {
		return gender;
	}

	public void setGender(Character gender) {
		this.gender = gender;
	}

	public Long getSsn() {
		return ssn;
	}

	public void setSsn(Long ssn) {
		this.ssn = ssn;
	}

	public String getPlanName() {
		return planName;
	}

	public void setPlanName(String planName) {
		this.planName = planName;
	}

	public String getPlanStatus() {
		return planStatus;
	}

	public void setPlanStatus(String planStatus) {
		this.planStatus = planStatus;
	}

	public SearchResponce(String name, Long mobile, String email, Character gender, Long ssn, String planName,
			String planStatus) {
		super();
		this.name = name;
		this.mobile = mobile;
		this.email = email;
		this.gender = gender;
		this.ssn = ssn;
		this.planName = planName;
		this.planStatus = planStatus;
	}

	public SearchResponce() {
		super();
	}
	
	
}

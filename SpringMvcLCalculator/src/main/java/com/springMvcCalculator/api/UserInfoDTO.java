package com.springMvcCalculator.api;

import javax.validation.constraints.AssertTrue;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Size;



public class UserInfoDTO {

	
	@NotBlank(message="User Name is must be not Null ")
	@Size(min = 3 , max =12, message="Characters must be in bewteen 5-18  ")
	private String userName;
	
	@NotBlank(message="User Name is must be not Null ")
	@Size( min = 3 , max =12, message="Characters must be in bewteen 5-18  ")
	private String crushName;
	
	@AssertTrue(message = "Check the box")
	private boolean termAndCondition;
	
	private Communication communication;

	public Communication getCommunication() {
		return communication;
	}

	public void setCommunication(Communication communication) {
		this.communication = communication;
	}

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public String getCrushName() {
		return crushName;
	}

	public void setCrushName(String crushName) {
		this.crushName = crushName;
	}

	public boolean isTermAndCondition() {
		return termAndCondition;
	}

	public void setTermAndCondition(boolean termAndCondition) {
		this.termAndCondition = termAndCondition;
	}

	@Override
	public String toString() {
		return "UserInfoDTO [userName=" + userName + ", crushName=" + crushName + "]";
	}

}

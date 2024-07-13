package com.springMvcCalculator.api;

public class Phone {
	
	private String countryCode;
	private String userPhoneNumber;
	
	
	public String getCountryCode() {
		return countryCode;
	}
	public void setCountryCode(String countryCode) {
		this.countryCode = countryCode;
	}
	public String getUserPhoneNumber() {
		return userPhoneNumber;
	}
	public void setUserPhoneNumber(String userPhoneNumber) {
		this.userPhoneNumber = userPhoneNumber;
	}
	
	@Override
	public String toString() {
		return "Phone [countryCode=" + countryCode + ", userPhoneNumber=" + userPhoneNumber + "]";
	}
	
	
	
	

}

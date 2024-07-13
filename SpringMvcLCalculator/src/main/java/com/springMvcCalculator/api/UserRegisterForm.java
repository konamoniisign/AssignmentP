package com.springMvcCalculator.api;

import java.util.Arrays;

public class UserRegisterForm {
	
	String name;
	String userName;
	char[] password;
	String country;
	 String[] hobbies;
	String gender;
	
	

	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getUserName() {
		return userName;
	}
	public void setUserName(String userName) {
		this.userName = userName;
	}
	public char[] getPassword() {
		return password;
	}
	public void setPassword(char[] password) {
		this.password = password;
	}
	public String getCountry() {
		return country;
	}
	public void setCountry(String country) {
		this.country = country;
	}
	public String[] getHobbies() {
		return hobbies;
	}
	public void setHobbies(String[] hobbies) {
		this.hobbies = hobbies;
	}
	public String getGender() {
		return gender;
	}
	public void setGender(String gender) {
		this.gender = gender;
	}

	
	@Override
	public String toString() {
		return "UserRegisterForm [name=" + name + ", userName=" + userName + ", password=" + Arrays.toString(password)
				+ ", country=" + country + ", hobbies=" + Arrays.toString(hobbies) + ", gender=" + gender + "]";
}	
	
}

package com.beans;

import java.io.Serializable;

public class Registration implements Serializable{
	private String customerName;
	private String mobileNumber;
	private String emailId;
	private String address;
	private int userId;
	private String password;
	public String getCustomerName() {
		return customerName;
	}
	public void setCustomerName(String customerName) {
		this.customerName = customerName;
	}
	public String getMobileNumber() {
		return mobileNumber;
	}
	public void setMobileNumber(String mobileNumber) {
		this.mobileNumber = mobileNumber;
	}
	public String getEmailId() {
		return emailId;
	}
	public void setEmailId(String emailId) {
		this.emailId = emailId;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public int getUserId() {
		return userId;
	}
	public void setUserId(int userId) {
		this.userId = userId;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public Registration(String customerName, String mobileNumber,
			String emailId, String address, int userId, String password) {
		super();
		this.customerName = customerName;
		this.mobileNumber = mobileNumber;
		this.emailId = emailId;
		this.address = address;
		this.userId = userId;
		this.password = password;
	}
	public Registration() {
		super();
	}
	
	
	
	}

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.ttdonline.beans;

import java.io.Serializable;

/**
 *
 * @author Techm
 */
public class Devotee implements Serializable{
	private String devoteeName;
	private int devoteeId;
	private String dateOfBirth;
	private String title;	
	private String city;
	private String country;
	private String address1;
	private String address2;
        private String username;
	private String phoneNumber;

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }
	private String idType;
	private String idNumber;
	
	public Devotee() {
		super();
	}
	public String getDevoteeName() {
		return devoteeName;
	}
	public void setDevoteeName(String devoteeName) {
		this.devoteeName = devoteeName;
	}
	public int getDevoteeId() {
		return devoteeId;
	}
	public void setDevoteeId(int devoteeId) {
		this.devoteeId = devoteeId;
	}
	public String getDateOfBirth() {
		return dateOfBirth;
	}
	public void setDateOfBirth(String dateOfBirth) {
		this.dateOfBirth = dateOfBirth;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public String getCountry() {
		return country;
	}
	public void setCountry(String country) {
		this.country = country;
	}
	public String getAddress1() {
		return address1;
	}
	public void setAddress1(String address1) {
		this.address1 = address1;
	}
	public String getAddress2() {
		return address2;
	}
	public void setAddress2(String address2) {
		this.address2 = address2;
	}

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }
	
	
	
	
}


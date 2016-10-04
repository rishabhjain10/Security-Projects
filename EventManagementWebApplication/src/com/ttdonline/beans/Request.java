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
public class Request implements Serializable {
private int devoteeId;
private String sevaName;
private String bookingDate;
private int noofSeats;
private int requestNo;
private String status;
private int cost;

    public int getSevaId() {
        return sevaId;
    }

    public void setSevaId(int sevaId) {
        this.sevaId = sevaId;
    }
private int sevaId;
public Request() {
	super();
}
public Request(int devoteeId, String sevaName, String bookingDate,
		int noofSeats, int requestNo, String status, int cost) {
	super();
	this.devoteeId = devoteeId;
	this.sevaName = sevaName;
	this.bookingDate = bookingDate;
	this.noofSeats = noofSeats;
	this.requestNo = requestNo;
	this.status = status;
	this.cost = cost;
}
public int getDevoteeId() {
	return devoteeId;
}
public void setDevoteeId(int devoteeId) {
	this.devoteeId = devoteeId;
}
public String getSevaName() {
	return sevaName;
}
public void setSevaName(String sevaName) {
	this.sevaName = sevaName;
}
public String getBookingDate() {
	return bookingDate;
}
public void setBookingDate(String bookingDate) {
	this.bookingDate = bookingDate;
}
public int getNoofSeats() {
	return noofSeats;
}
public void setNoofSeats(int noofSeats) {
	this.noofSeats = noofSeats;
}
public int getRequestNo() {
	return requestNo;
}
public void setRequestNo(int requestNo) {
	this.requestNo = requestNo;
}
public String getStatus() {
	return status;
}
public void setStatus(String status) {
	this.status = status;
}
public int getCost() {
	return cost;
}
public void setCost(int cost) {
	this.cost = cost;
}
    
}

package com.service;

import java.util.List;

import com.beans.Registration;



public interface RegistrationService {
	int insertCustomer(Registration register);
	public List getCustomerDetails();
}

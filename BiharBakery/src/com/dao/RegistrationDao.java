package com.dao;

import java.util.List;

import com.beans.Registration;

public interface RegistrationDao {
	int insertCustomer(Registration register);
	List getCustomerDetails();
}

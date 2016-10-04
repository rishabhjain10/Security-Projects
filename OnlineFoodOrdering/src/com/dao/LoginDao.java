package com.dao;

import java.util.List;

import com.beans.Login;
import com.beans.Registration;

public interface LoginDao {
	String validateUser(Login user);
	int customerId(Login user);
	void insertUser(Registration register);
}

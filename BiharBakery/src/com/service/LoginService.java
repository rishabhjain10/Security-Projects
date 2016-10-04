package com.service;

import java.util.List;

import com.beans.Login;
import com.beans.Registration;

public interface LoginService {
	
		String validateUser(Login User);
		int customerId(Login User);
		void insertUser(Registration register);
	}




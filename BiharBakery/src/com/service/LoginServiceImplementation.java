package com.service;

import java.util.List;

import com.beans.Login;
import com.beans.Registration;
import com.dao.LoginDaoImplementation;


public class LoginServiceImplementation implements LoginService{
	
	private LoginDaoImplementation loginDao;

	@Override
	public String validateUser(Login User) {
		System.out.println("insertEmp method of EmpServiceImpl method!!!");
        return loginDao.validateUser(User);
		
		// TODO Auto-generated method stub
		
	}
	
	@Override
	public void insertUser(Registration User) {
		System.out.println("insertEmp method of EmpServiceImpl method!!!");
        loginDao.insertUser(User);
		
		// TODO Auto-generated method stub
		
	}
	
	@Override
	public int customerId(Login User){
		return loginDao.customerId(User);
	}

	public void setLoginDao(LoginDaoImplementation loginDao) {
		this.loginDao = loginDao;
	}
	

}

package com.service;

import java.util.List;

import com.beans.Registration;
import com.dao.RegistrationDaoImplementation;



public class RegistrationServiceImplementation implements RegistrationService {
	private RegistrationDaoImplementation registerDao;

	@Override
	public int insertCustomer(Registration register) {
		System.out.println("insertEmp method of EmpServiceImpl method!!!");
        return registerDao.insertCustomer(register);
		
		// TODO Auto-generated method stub
		
	}
	
	@Override
	public List getCustomerDetails() {
		System.out.println("insertEmp method of EmpServiceImpl method!!!");
        return registerDao.getCustomerDetails();
		
		// TODO Auto-generated method stub
		
	}
	
	
	
	

	public void setRegisterDao(RegistrationDaoImplementation registerDao) {
		this.registerDao = registerDao;
	}

	
}

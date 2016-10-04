package com.dao;

import java.util.ArrayList;
import java.util.List;

import org.springframework.orm.hibernate3.HibernateTemplate;

import com.beans.Registration;



public class RegistrationDaoImplementation implements RegistrationDao{
	private HibernateTemplate ht;
	static int i=1500;
	@Override
	public int insertCustomer(Registration register) {
		
		register.setUserId(i++);
		System.out.println("insertEmp of EmpDAOImpl class.....");
        ht.save(register);
		// TODO Auto-generated method stub
		return i;
	}
	
	
	
	@Override
	public List getCustomerDetails() {
		
		System.out.println("insertEmp of EmpDAOImpl class.....");
		List r=new ArrayList();
		String queryString="FROM Registration";
		r=ht.find(queryString);
		
		return r;
		
	}
	
	public void setHt(HibernateTemplate ht) {
        this.ht = ht;
    }
}

package com.dao;

import java.util.ArrayList;
import java.util.List;

import org.springframework.orm.hibernate3.HibernateTemplate;

import com.beans.Login;
import com.beans.Registration;

public class LoginDaoImplementation implements LoginDao{
	
	
	private HibernateTemplate ht;
	@Override
	public String validateUser(Login login) {
		System.out.println("1111");
		List r=new ArrayList();
		String queryString="select role from Login where userName=? and password=?";
		r=ht.find(queryString,new Object[]{login.getUserName(),login.getPassword()});
		if(r.size()!=0){
		String role=(String) r.get(0);
		return role;
		}
		else
			return "invalid";
	}
	
	@Override
	public int customerId(Login user){
		List r=new ArrayList();
		String queryString="select userId from Login where userName=? and password=?";
		r=ht.find(queryString,new Object[]{user.getUserName(),user.getPassword()});
		if(r.size()!=0){
		int userid=(Integer) r.get(0);
		return userid;
	    }
		else return 0;
	}
	
	@Override
	public void insertUser(Registration register){
		Login login=new Login();
		login.setUserId(register.getUserId());
		login.setUserName(register.getCustomerName());
		login.setPassword(register.getPassword());
		login.setRole("customer");
		ht.save(login);
	}
	
	public void setHt(HibernateTemplate ht) {
        this.ht = ht;
    }


}

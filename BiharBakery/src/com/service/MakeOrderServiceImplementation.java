package com.service;

import java.util.List;

import com.beans.Login;
import com.beans.MakeOrder;
import com.dao.LoginDaoImplementation;
import com.dao.MakeOrderDaoImplementation;

public class MakeOrderServiceImplementation implements MakeOrderService{
	private MakeOrderDaoImplementation makeOrderDao;
	
	@Override
	public void insertOrder(MakeOrder order) {
		System.out.println("insertEmp method of EmpServiceImpl method!!!");
        makeOrderDao.insertOrder(order);
		
		// TODO Auto-generated method stub
		
	}
	
	@Override
	public List viewOrder(int userid) {
		System.out.println("insertEmp method of EmpServiceImpl method!!!");
        return makeOrderDao.viewOrder(userid);
		
		// TODO Auto-generated method stub
		
	}
	
	
	
	
	
	@Override
	public void updateOrderStatus(String status,int itemid) {
		System.out.println("insertEmp method of EmpServiceImpl method!!!");
        makeOrderDao.updateOrderStatus(status,itemid);
		
		// TODO Auto-generated method stub
		
	}
	
	
	
	@Override
	public List getProcessingOrders() {
		System.out.println("insertEmp method of EmpServiceImpl method!!!");
        return makeOrderDao.getProcessingOrders();
		
		// TODO Auto-generated method stub
		
	}
	
	
	
	
	
	
	
	

	public void setMakeOrderDao(MakeOrderDaoImplementation makeOrderDao) {
		this.makeOrderDao = makeOrderDao;
	}

}

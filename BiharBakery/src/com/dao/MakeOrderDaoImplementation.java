package com.dao;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import org.springframework.orm.hibernate3.HibernateTemplate;

import com.beans.ItemsList;
import com.beans.MakeOrder;

public class MakeOrderDaoImplementation implements MakeOrderDao{
	private HibernateTemplate ht;
	
	@Override
	public List viewOrder(int userid) {
		System.out.println("insertEmp of EmpDAOImpl class.....");
		List r=new ArrayList();
		System.out.println(userid);
		String queryString="FROM MakeOrder where userId=?";
		r=ht.find(queryString,new Object[]{userid});
		
		return r;
	}
	/*public int getorderid(){
	String queryString="select max(orderid) from MakeOrder";
	
	}*/
	
	public void setHt(HibernateTemplate ht) {
		this.ht = ht;
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	static int count=2500;
	@Override
	public void insertOrder(MakeOrder order) {
		System.out.println("insertEmp of EmpDAOImpl class.....");
		ht.save(order);
     
    
	}
	
	
	
	
	
	
	
	
	@Override
	public void updateOrderStatus(String status,int orderid) {
		System.out.println("insertEmp of EmpDAOImpl class.....");
		MakeOrder i=(MakeOrder)ht.get(MakeOrder.class,orderid);
				System.out.println(i);
				i.setOrderstatus(status);
				System.out.println(i.getOrderstatus());
				 
				ht.update(i);
        
	}
	
	
	
	
	
	
	@Override
	public List getProcessingOrders() {
		System.out.println("insertEmp of EmpDAOImpl class.....");
		List r=new ArrayList();
		//System.out.println(userid);
		String queryString="FROM MakeOrder where orderstatus='processing'";
		r=ht.find(queryString);
		
		return r;
        
	}
	
	
	
	
}

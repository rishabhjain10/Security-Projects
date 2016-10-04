package com.dao;

import java.util.List;

import com.beans.MakeOrder;

public interface MakeOrderDao {
	public void insertOrder(MakeOrder order);
	public List viewOrder(int userid);
	public void updateOrderStatus(String status,int itemid);
	public List getProcessingOrders();
	//public int getorderid();
}

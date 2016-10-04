package com.service;

import java.util.List;

import com.beans.ItemsList;
import com.dao.ItemDaoImplementation;
import com.dao.LoginDaoImplementation;

public class ItemServiceImplementation implements ItemService{

	private ItemDaoImplementation itemDao;
	
	@Override
	public List itemList() {
		System.out.println("insertEmp method of EmpServiceImpl method!!!");
        return itemDao.itemList();
	}
	
	@Override
	public void updatequantity(ItemsList itemlist,int q) {
		System.out.println("insertEmp method of EmpServiceImpl method!!!");
        itemDao.updatequantity(itemlist,q);
	}
	
	
	@Override
	public void insertItem(ItemsList i) {
		System.out.println("insertEmp method of EmpServiceImpl method!!!");
        itemDao.insertItem(i);
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	@Override
	public void modifyItem(ItemsList itemid) {
		System.out.println("insertEmp method of EmpServiceImpl method!!!");
        itemDao.modifyItem(itemid);
	}
	
	
	@Override
	public void deleteItem(int itemid) {
		System.out.println("insertEmp method of EmpServiceImpl method!!!");
        itemDao.deleteItem(itemid);
	}
	
	
	
	
	
	
	
	
	
	
	
	
	

	public void setItemDao(ItemDaoImplementation itemDao) {
		this.itemDao = itemDao;
	}

	
	
}

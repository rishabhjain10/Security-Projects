package com.dao;

import java.util.ArrayList;
import java.util.List;

import org.hsqldb.lib.Iterator;
import org.springframework.orm.hibernate3.HibernateTemplate;

import com.beans.ItemsList;
import com.beans.Registration;

public class ItemDaoImplementation implements ItemDao{

	private HibernateTemplate ht;
	
	@Override
	public List itemList() {
		List r=new ArrayList();
		String queryString="FROM ItemsList";
		r=ht.find(queryString);
		
		return r;
	
	}
	
	@Override
	public void updatequantity(ItemsList itemlist,int q) {
		ItemsList i=(ItemsList)ht.get(ItemsList.class,itemlist.getItemId());
				
				i.setQuantity(itemlist.getQuantity()-q);
				ht.update(i);
	}

	public void setHt(HibernateTemplate ht) {
		this.ht = ht;
	}
	
	
	@Override
	public void insertItem(ItemsList item) {
		
		System.out.println(item);
        ht.save(item);
		// TODO Auto-generated method stub
	}
	
	@Override
	public void modifyItem(ItemsList item) {
		
		 ItemsList i=(ItemsList)ht.get(ItemsList.class, item.getItemId());
		 i.setItemCost(item.getItemCost());
		 i.setItemName(item.getItemName());
		 i.setItemType(item.getItemType());
		 i.setQuantity(item.getQuantity());
		 ht.update(i);
		
		
	}

	
	
	
	
	
	
	
	
	
	
	
	
	@Override
	public void deleteItem(int itemid) {
		 ItemsList i=(ItemsList)ht.get(ItemsList.class,itemid);
		 ht.delete(i);
		System.out.println("success");
		
		// TODO Auto-generated method stub
		
	}

	
	
}

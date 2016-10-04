package com.dao;

import java.util.List;

import com.beans.ItemsList;

public interface ItemDao {
	public List itemList();
	public void updatequantity(ItemsList l,int q);
	public void insertItem(ItemsList i);
	public void modifyItem(ItemsList itemid);
	public void deleteItem(int itemid);
}

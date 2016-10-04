package com.service;

import java.util.List;

import com.beans.ItemsList;

public interface ItemService {
	public List itemList();
	public void updatequantity(ItemsList item,int q);
	public void insertItem(ItemsList i);
	public void modifyItem(ItemsList itemid);
	public void deleteItem(int itemid);
}

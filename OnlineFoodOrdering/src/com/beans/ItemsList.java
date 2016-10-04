package com.beans;
import java.io.Serializable;
public class ItemsList implements Serializable{
	private int itemId=0,itemCost=0,quantity=0;
    private String itemName,itemType;
    
    public int getItemId() {
        return itemId;
    }

    public void setItemId(int itemId) {
        this.itemId = itemId;
    }

    public int getItemCost() {
        return itemCost;
    }

    public void setItemCost(int itemCost) {
        this.itemCost = itemCost;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public String getItemName() {
        return itemName;
    }

    public void setItemName(String itemName) {
        this.itemName = itemName;
    }

    public String getItemType() {
        return itemType;
    }

    public void setItemType(String itemType) {
        this.itemType = itemType;
    }

	@Override
	public String toString() {
		return "ItemsList [itemId=" + itemId + ", itemCost=" + itemCost
				+ ", quantity=" + quantity + ", itemName=" + itemName
				+ ", itemType=" + itemType + "]";
	}

	


}

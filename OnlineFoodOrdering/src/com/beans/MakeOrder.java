package com.beans;
import java.io.Serializable;
public class MakeOrder implements Serializable{
	 private String item,orderstatus;
	    private int quantity,orderid,cost,itemid,totalcost,userid;
	    

	    public void setItem(String item) {
	        this.item = item;
	    }

	    public void setQuantity(int quantity) {
	        this.quantity = quantity;
	    }

	    public void setOrderid(int orderid) {
	        this.orderid = orderid;
	    }

	    public void setCost(int cost) {
	        this.cost = cost;
	    }

	  

	    public int getUserid() {
			return userid;
		}

		public void setUserid(int userid) {
			this.userid = userid;
		}

		public String getItem() {
	        return item;
	    }

	    public int getQuantity() {
	        return quantity;
	    }

	    public int getOrderid() {
	        return orderid;
	    }

	    public int getCost() {
	        return cost;
	    }

		public String getOrderstatus() {
			return orderstatus;
		}

		public void setOrderstatus(String orderstatus) {
			this.orderstatus = orderstatus;
		}

		public int getItemid() {
			return itemid;
		}

		public void setItemid(int itemid) {
			this.itemid = itemid;
		}

		public int getTotalcost() {
			return totalcost;
		}

		public void setTotalcost(int totalcost) {
			this.totalcost = totalcost;
		}

		@Override
		public String toString() {
			return "MakeOrder [userid=" + userid + ", item=" + item
					+ ", orderstatus=" + orderstatus + ", quantity=" + quantity
					+ ", orderid=" + orderid + ", cost=" + cost + ", itemid="
					+ itemid + ", totalcost=" + totalcost + "]";
		}
		
		
}

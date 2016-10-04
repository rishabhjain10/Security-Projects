/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.ttdonline.beans;

import java.io.Serializable;

/**
 *
 * @author Techm
 */
public class Transaction implements Serializable {
			private String devoteeName;
			private int devoteeId;
	        private String sevaName;
	        private String sevaDate;

    public int getSevaid() {
        return sevaid;
    }

    public void setSevaid(int sevaid) {
        this.sevaid = sevaid;
    }
	        private long devoteeCost;
	        private int seatsBooked;
	        private int ticketId;
                private int sevaid;
	        
	    	public Transaction() {
				super();
			}

			public Transaction(String devoteeName, int devoteeId,
					String sevaName, String sevaDate, long devoteeCost,
					int seatsBooked, int ticketId) {
				super();
				this.devoteeName = devoteeName;
				this.devoteeId = devoteeId;
				this.sevaName = sevaName;
				this.sevaDate = sevaDate;
				this.devoteeCost = devoteeCost;
				this.seatsBooked = seatsBooked;
				this.ticketId = ticketId;
			}
	        
			public String getDevoteeName() {
				return devoteeName;
			}
			public void setDevoteeName(String devoteeName) {
				this.devoteeName = devoteeName;
			}
			public int getDevoteeId() {
				return devoteeId;
			}
			public void setDevoteeId(int devoteeId) {
				this.devoteeId = devoteeId;
			}
			public String getSevaName() {
				return sevaName;
			}
			public void setSevaName(String sevaName) {
				this.sevaName = sevaName;
			}
			public String getSevaDate() {
				return sevaDate;
			}
			public void setSevaDate(String sevaDate) {
				this.sevaDate = sevaDate;
			}
			public long getDevoteeCost() {
				return devoteeCost;
			}
			public void setDevoteeCost(long devoteeCost) {
				this.devoteeCost = devoteeCost;
			}
			public int getSeatsBooked() {
				return seatsBooked;
			}
			public void setSeatsBooked(int seatsBooked) {
				this.seatsBooked = seatsBooked;
			}
			public int getTicketId() {
				return ticketId;
			}
			public void setTicketId(int ticketId) {
				this.ticketId = ticketId;
			}
		
	      
}

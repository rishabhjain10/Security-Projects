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
  public class Seva implements Serializable {
    	private int sevaCost;
        private int allowedSeats;
        private int totalSeats;
        private String sevaName;
        private String sevaDay;
        private int sevaId;
        
        public Seva() {
			super();
		}
        
        
        
		public Seva(int sevaCost, int allowedSeats, int totalSeats,
				String sevaName, String sevaDay, int sevaId) {
			super();
			this.sevaCost = sevaCost;
			this.allowedSeats = allowedSeats;
			this.totalSeats = totalSeats;
			this.sevaName = sevaName;
			this.sevaDay = sevaDay;
			this.sevaId = sevaId;
		}



		public int getSevaCost() {
			return sevaCost;
		}
		public void setSevaCost(int sevaCost) {
			this.sevaCost = sevaCost;
		}
		public int getAllowedSeats() {
			return allowedSeats;
		}
		public void setAllowedSeats(int allowedSeats) {
			this.allowedSeats = allowedSeats;
		}
		public int getTotalSeats() {
			return totalSeats;
		}
		public void setTotalSeats(int totalSeats) {
			this.totalSeats = totalSeats;
		}
		public String getSevaName() {
			return sevaName;
		}
		public void setSevaName(String sevaName) {
			this.sevaName = sevaName;
		}
		public String getSevaDay() {
			return sevaDay;
		}
		public void setSevaDay(String sevaDay) {
			this.sevaDay = sevaDay;
		}
		public int getSevaId() {
			return sevaId;
		}
		public void setSevaId(int sevaId) {
			this.sevaId = sevaId;
		}
		
       
}
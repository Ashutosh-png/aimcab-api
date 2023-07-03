package com.workshop;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
@Entity
public class UserInfo {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int id;
	 private String pickupLocation;
	    private String dropLocation;
	    private String name;
	    private String email;
	    private String phoneNumber;
	    private String date;
	    private String time;
		public int getId() {
			return id;
		}
		public void setId(int id) {
			this.id = id;
		}
		public String getPickupLocation() {
			return pickupLocation;
		}
		public void setPickupLocation(String pickupLocation) {
			this.pickupLocation = pickupLocation;
		}
		public String getDropLocation() {
			return dropLocation;
		}
		public void setDropLocation(String dropLocation) {
			this.dropLocation = dropLocation;
		}
		public String getName() {
			return name;
		}
		public void setName(String name) {
			this.name = name;
		}
		public String getEmail() {
			return email;
		}
		public void setEmail(String email) {
			this.email = email;
		}
		public String getPhoneNumber() {
			return phoneNumber;
		}
		public void setPhoneNumber(String phoneNumber) {
			this.phoneNumber = phoneNumber;
		}
		public String getDate() {
			return date;
		}
		public void setDate(String date) {
			this.date = date;
		}
		public String getTime() {
			return time;
		}
		public void setTime(String time) {
			this.time = time;
		}
		@Override
		public String toString() {
			return "UserInfo [id=" + id + ", pickupLocation=" + pickupLocation + ", dropLocation=" + dropLocation
					+ ", name=" + name + ", email=" + email + ", phoneNumber=" + phoneNumber + ", date=" + date
					+ ", time=" + time + "]";
		}
		public UserInfo(int id, String pickupLocation, String dropLocation, String name, String email,
				String phoneNumber, String date, String time) {
			super();
			this.id = id;
			this.pickupLocation = pickupLocation;
			this.dropLocation = dropLocation;
			this.name = name;
			this.email = email;
			this.phoneNumber = phoneNumber;
			this.date = date;
			this.time = time;
		}
		public UserInfo() {
			super();
			// TODO Auto-generated constructor stub
		}
	    
	    

}

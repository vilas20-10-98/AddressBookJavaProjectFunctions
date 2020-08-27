package com.java;

public class AddressBookPojo {
	public String firstName;
	public String lastName;
	public String city;
	public String state;
	public String zip;
	public String phoneNumber;
	public AddressBookPojo(String firstName, String lastName, String city, String state, String zip,
			String phoneNumber) {
		super();
		this.firstName = firstName;
		this.lastName = lastName;
		this.city = city;
		this.state = state;
		this.zip = zip;
		this.phoneNumber = phoneNumber;
		
	}
	public String getFirstName() {
		return firstName;
	}
	public String getLastName() {
		return lastName;
	}
	public String getCity() {
		return city;
	}
	public String getState() {
		return state;
	}
	public String getZip() {
		return zip;
	}
	public String getPhoneNumber() {
		return phoneNumber;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public void setState(String state) {
		this.state = state;
	}
	public void setZip(String zip) {
		this.zip = zip;
	}
	public void setPhoneNumber(String phoneNumber) {
		this.phoneNumber = phoneNumber;
	}
	@Override
	public String toString() {
		return "AddressBookPojo [firstName=" + firstName + ", lastName=" + lastName + ", city=" + city + ", state="
				+ state + ", zip=" + zip + ", phoneNumber=" + phoneNumber + "]";
	}
	
	
	
	
	
	
	

}

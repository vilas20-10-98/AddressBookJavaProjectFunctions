package com.java;

public interface AddressBookInterface {
	public void addPerson();
	public void editPerson();
	public void deletePerson();
	public void searchPerson();
	public void sortByZip();
	public void sortByName();
	public void display();
	void addPerson(String firstName, String lastName, String city, String state, String zip, String phoneNumber);
	

}

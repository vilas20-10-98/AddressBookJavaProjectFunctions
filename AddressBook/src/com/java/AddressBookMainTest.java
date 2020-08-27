package com.java;

import java.util.Scanner;

public class AddressBookMainTest {

	public static void main(String[] args) {
		AddressBookMainTest addressBookimpl = new AddressBookMainTest();
		AddressBookMainTest addressBookmanager = new AddressBookMainTest();
		System.out.println("plese enter ur choice");
		Scanner sc = new Scanner(System.in);
		int ch;
		ch=sc.nextInt();
		System.out.println("do u want to choose");
		System.out.println("choice 1 new address book");
		System.out.println("choice 2 open address book");
		System.out.println("choice 3 save address book");
		System.out.println("choice 4 save as address book");
		System.out.println("choice 5 close address book");
		System.out.println("choice 5 quit");
		
	  while(true) {
		  
		switch(ch) {
		case 1 :
			addressBookmanager.newAddressBook();
			  break;
		case 2 :
			addressBookmanager.openAddressBook();
			System.out.println("choose methode");
			Scanner sh = new Scanner(System.in);
			ch=sh.nextInt();
			
			switch(ch) {
			case 1 :
				addressBookmanager.addPerson();
				sc.next();
				System.out.println("vilas");
				System.out.println("targude");
				System.out.println("nanded");
				System.out.println("maharashtra");
				System.out.println("731606");
				System.out.println("7350453485");
				
				break;
			case 2 :
				addressBookmanager.editPerson();
				break;
			case 3 :
				addressBookmanager.deletePerson();
				break;
			case 4 :
				addressBookmanager.searchPerson();
				break;
			case 5 :
				addressBookmanager.sortByZip();
				break;
			case 6 :
				addressBookmanager.sortByName();
				break;
			case 7 :
				addressBookmanager.display();
				break;
			default :
				System.out.println("Wrong choice");
			}
			break;
		case 3 :
			addressBookmanager.saveAddressBook();
			break;
		case 4 :
			addressBookmanager.saveAsddressBook();
			break;
		case 5 :
			addressBookmanager.closeAddressBook();
			break;
		case 6 :
			addressBookmanager.quit();
			break;
		default :
			System.out.println("u have entered wrong choice");
			
		}
	  }
		
		
}

	private void saveAddressBook() {
		// TODO Auto-generated method stub
		
	}

	private void saveAsddressBook() {
		// TODO Auto-generated method stub
		
	}

	private void closeAddressBook() {
		// TODO Auto-generated method stub
		
	}

	private void openAddressBook() {
		// TODO Auto-generated method stub
		
	}

	private void addPerson() {
		// TODO Auto-generated method stub
		
	}

	private void editPerson() {
		// TODO Auto-generated method stub
		
	}

	private void deletePerson() {
		// TODO Auto-generated method stub
		
	}

	private void searchPerson() {
		// TODO Auto-generated method stub
		
	}

	private void sortByZip() {
		// TODO Auto-generated method stub
		
	}

	private void sortByName() {
		// TODO Auto-generated method stub
		
	}

	private void display() {
		// TODO Auto-generated method stub
		
	}

	private void quit() {
		// TODO Auto-generated method stub
		
	}

	private void newAddressBook() {
		// TODO Auto-generated method stub
		
	}

}

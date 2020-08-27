package com.java;

import java.io.BufferedReader;
import java.io.File;
import java.util.Scanner;

public class AddressBookImpl
implements AddressBookInterface {

	private static final Object String = null;
	private static final java.lang.String Null = null;

	public void addPerson(String firstName, String lastName, String city, String state, String zip, String phoneNumber) {
		
		Scanner a = new Scanner(System.in);
		System.out.println("Enter first name = ");
		String firstName1 = a.next();
		System.out.println("Enter last name = ");
		String lastName1 = a.next();
		System.out.println("Enter city = ");
		String city1 = a.next();
		System.out.println("Enter state = ");
		String state1 = a.next();
		System.out.println("Enter zip = ");
		String zip1 = a.next();
		System.out.println("Enter phone number = ");
		String phoneNumber1 = a.next();
		a.close();
	}

	@Override
	public void editPerson() {
		String resultRow = null;
		try {
			BufferedReader br = new BufferedReader(new salectFile());
			String line;
			System.out.println("Enter the name of the person u want to edit");
			String searchString = new String();
			while ((line = br.readLine()!=Null) != null {
				String[] values = line .split(" , ");
				if ( values[5].equals(String)) {
					resultRow = line;
					break;
					
				}
					
			}
			br.close();
			System.out.println("resultRow");
			
		}

			catch (Exception e) {
				e.printStackTrace();
			}

			
		
		
	}

	@Override
	public void deletePerson() {
		System.out.println("shubham heda");
	
	}

	@Override
	public void searchPerson() {
		String resultRow = null;
		try {
			BufferedReader br = new BufferedReader(new salectFile());
			String line;
			System.out.println("Enter the phone number u want to search");
			String searchString = new String();
			while ((line = br.readLine()!=Null) != null {
				String[] values = line .split(" , ");
				if ( values[5].equals(String)) {
					resultRow = line;
					break;
					
				}
					
			}
			br.close();
			
			System.out.println("resultRow");
			
	}

		catch (Exception e) {
			e.printStackTrace();


		}


		
	}



		
	}

	@Override
	public void sortByZip() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void sortByName() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void display() {
		
	}
	
	
	
	
	
	
	
	
	

	@Override
	public void addPerson() {
		// TODO Auto-generated method stub
		
	}
	

}

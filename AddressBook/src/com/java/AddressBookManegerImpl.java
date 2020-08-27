package com.java;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;

public class AddressBookManegerImpl implements AddressBookManagerInterface {

	@Override
	public void newAddressBook() {
		Scanner sc = new Scanner(System.in);
		System.out.println("By What name would you like to save ur new Address Book ---- ");
		String name = sc.nextLine();
		System.out.println("what extension would you like to give (.csv , .txt or .json) ---- ");
		String ext = sc.nextLine();
		
		{ try 
		   {
			 File myObj = new File("C:\\AddressBook\\"+name+ext);
		         if (myObj.createNewFile()) 
		         	{
		    	      System.out.println("File created: " + myObj.getName());
	         	    }
		         else 
		      		{
		        	 System.out.println("File already exists.");
		      		}
		    } catch (IOException e) {
		      System.out.println("An error occurred.");
		      e.printStackTrace();
		      
		      {
					try {
							 System.out.println("how many enteries u want to enter = ");
							 	int entry = sc.nextInt();
						        FileWriter myWriter = new FileWriter("C:\\AddressBook\\"+name+ext);
						        PrintWriter pw = new PrintWriter(myWriter);
						    { for(int i=0; i < entry; i++) 
						        {	    System.out.println("for entry "+ (i+1));
								    	System.out.println("Enter first name = ");
									    String firstName = sc.next();
									    System.out.println("Enter last name = ");
									    String lastName = sc.next();
									    System.out.println("Enter city = ");
									    String city = sc.next();
									    System.out.println("Enter state = ");
										String state = sc.next();
										System.out.println("Enter zipcode = ");
										long zipCode = sc.nextLong();
										System.out.println("Enter phone number = ");
										long pNum = sc.nextLong();
										//construct new person object
										Person p = new Person (firstName, lastName, city, state, zipCode, pNum);
										Object persons;
										persons.add(p);
							            
										 pw.print(p.getfirstName()+" ");
							             pw.print(p.getfirstName()+" ");
							             pw.print(p.getClass()+" ");
							             pw.print(p.getstate()+" ");
							             pw.print(p.getzipCode()+" ");
							             pw.print(p.getpNum());
							             pw.println();
							        }
							      pw.close();
							    }
							      System.out.println("Successfully wrote to the file");

						  } catch (IOException e1) {
							      System.out.println("An error occurred.");
							      e1.printStackTrace();
				       }		 
					} 

		    						}
	}	


		
	}

	@Override
	public void openAddressBook() {
		System.out.println("Total AddressBooks present  ");
	  	  File file = new File("C:\\AddressBook\\");
	  	  String[] files=file.list();
	  	   for (String string : files) {
	  	  System.out.println(string);
	  	   }
			System.out.println("Enter the name of Address Book you want to open --- ");
			@SuppressWarnings("resource")
			Scanner sc = new Scanner(System.in);
			String name1 = sc.next();
			 try {
			      File myObj = new File("C:\\AddressBook\\"+name1);
			      Scanner myReader = new Scanner(myObj);
			      while (myReader.hasNextLine()) {
			        String data = myReader.nextLine();
			        System.out.println(data);
			      }
			      myReader.close();
			    } catch (FileNotFoundException e) {
			      System.out.println("An error occurred.");
			      e.printStackTrace();
			    }
			 System.out.println("Please Choose from the below given Options what Operations would you like to perform");
			 	System.out.println();
			 	System.out.println("\t Enter (1) to add new Person");
				System.out.println("\t Enter (2) to edit any Person");
				System.out.println("\t Enter (3) to delete any Person");
				System.out.println("\t Enter (4) to search Person");
				System.out.println("\t Enter (5) to sort by Zip");
				System.out.println("\t Enter (6) to sort by name");
				System.out.println("\t Enter (7) to display");
				System.out.println();
				try (Scanner sci = new Scanner(System.in)){
					System.out.print("Please Enter your choice  --->");
					int ch = sci.nextInt();
					
					Object addressBookmanager;
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
				}
	}

	@Override
	public void saveAddressBook() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void saveAsAddressBook() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void closeAddressBook() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void quit() {
		// TODO Auto-generated method stub
		
	}
	

}

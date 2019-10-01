package TimBuchalka_Arrays;

import java.awt.List;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Scanner;

// Create a program that implements a simple mobile phone with the following capabilities.
// Able to store, modify, remove and query contact names.
// You will want to create a separate class for Contacts (name and phone number).
// Create a master class (MobilePhone) that holds the ArrayList of Contacts
// The MobilePhone class has the functionality listed above.
// Add a menu of options that are available.
// Options:  Quit, print list of contacts, add new contact, update existing contact, remove contact
// and search/find contact.
// When adding or updating be sure to check if the contact already exists (use name)
// Be sure not to expose the inner workings of the Arraylist to MobilePhone
// e.g. no ints, no .get(i) etc
// MobilePhone should do everything with Contact objects only.
public class MobilePhone {
	
	private static PhoneDirectory PhList = new PhoneDirectory();
	private static Scanner scanner = new Scanner(System.in);
	public static void main(String[] args) {
	//	ArrayList<PhoneContacts> List = new ArrayList<PhoneContacts>();
		  boolean quit = false;
	         int choice = 0;
	         printInstructions();
	         while(!quit) {
	        	 System.out.println("Enter your choice: " );
	             choice = scanner.nextInt();
	             scanner.nextLine();
	        		switch(choice){
	        		case 0: 
	        			printInstructions();
	        			break;
	        		case 1:
	        			PhList.printContactList();
	        			 break;
	        		case 2: 
	        			addContact();
	        			break;
	        		case 3: 
	        			updateContact();
	        			break;
	        		case 4:
	        			removeContact();
	        			break;
	        		case 5: 
	        			searchForContact();
	        			break;
	        		case 6:
	        			 quit = true;
	                     break;
	        		}//end switch
	         }//end while
	 
	}//end main

	private static void addContact() {
		System.out.println("enter a new contact name, followed by the phone number");
		String info = scanner.nextLine();
		PhList.addContact(info);
		
	}//end method

	private static void updateContact() {
		System.out.println("choose a contact # to be updated from the list");
		PhList.printContactList();
		int position = scanner.nextInt();
		position -= 1;
		scanner.nextLine();
		System.out.println("what do you want to change it to?  (name followed by number");
		String contact = scanner.nextLine();
		PhList.modifyContact(position, contact);
		
	}//end method

	private static void removeContact() {
		System.out.println("What contact would you like to remove from the below list?");
		PhList.printContactList();
		 int position = scanner.nextInt();
		position -= 1;
		PhList.removeContact(position);
		
	}//end method

	private static void searchForContact() {
		System.out.println("contact to search for:");
		 String searchItem = scanner.nextLine();
	        if(PhList.findItem(searchItem) != null) {
	            System.out.println("Found " + searchItem + " in  our contact list");
	        } else {
	            System.out.println(searchItem + " is not in the contact list");
	        }
		
	}//end method

	private static void printInstructions() {
		System.out.println("Welcome to your new JDubbs Phone");
		System.out.println("Please choose one of the following options: ");
		System.out.println("0: show menu options");
		System.out.println("1: print list of contacts");
		System.out.println("2: add new contact");
		System.out.println("3: update and existing contact");
		System.out.println("4: remove a contact");
		System.out.println("5: search/find contact");
		System.out.println("6: quit");
		
	}//end method

	private static void addItem() {
		String contact = scanner.nextLine();
        System.out.print("Please enter the grocery item: ");
        PhList.addContact(contact);
    }//end method
	
}//end class

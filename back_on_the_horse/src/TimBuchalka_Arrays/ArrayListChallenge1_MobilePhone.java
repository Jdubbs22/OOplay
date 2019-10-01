package TimBuchalka_Arrays;

import java.util.ArrayList;

public class ArrayListChallenge1_MobilePhone {

	private String myNumber;//number of the phone...not really used however
	private ArrayList<ArrayListChallenge1_Contact> myContacts;//creates an arraylist of contacts

	public ArrayListChallenge1_MobilePhone(String myNumber) {
		this.myNumber = myNumber;
		this.myContacts = new ArrayList<ArrayListChallenge1_Contact>();
	}//end constructor

	public boolean addNewContact(ArrayListChallenge1_Contact contact) {
		if (findContact(contact.getName()) >= 0) {
			System.out.println("Contact is already on file");
			return false;
		}//end if

		myContacts.add(contact);
		return true;

	}//end method

	public boolean updateContact(ArrayListChallenge1_Contact oldContact, ArrayListChallenge1_Contact newContact) {
		int foundPosition = findContact(oldContact); //foundContact is the postion in the arrayList
		if (foundPosition < 0) {
			System.out.println(oldContact.getName() + ", was not found.");
			return false;
		}else if (findContact(newContact.getName()) != -1 ){//checks to see if name already exists
			System.out.println("Contact name with "+ newContact.getName()+" already exists. Update was not succesful");
			return false;
		}//end elseif

		this.myContacts.set(foundPosition, newContact);//replaces the old with the new
		System.out.println(oldContact.getName() + ", was replaced with " + newContact.getName());
		return true;
	}//end method

	public boolean removeContact(ArrayListChallenge1_Contact contact) {
		int foundPosition = findContact(contact);
		if (foundPosition < 0) {
			System.out.println(contact.getName() + ", was not found.");
			return false;
		}//end if
		this.myContacts.remove(foundPosition);
		System.out.println(contact.getName() + ", was deleted.");
		return true;
	}//end method

	private int findContact(ArrayListChallenge1_Contact contact) {//finds the index of a contact
		return this.myContacts.indexOf(contact);
	}//end method

	private int findContact(String contactName) {  //checks to see if the name exists in the arrayList
		for (int i = 0; i < this.myContacts.size(); i++) {
			ArrayListChallenge1_Contact contact = this.myContacts.get(i);
			if (contact.getName().equals(contactName)) {
				return i;
			}//end if
		}//end for
		return -1;
	}//end method

	public String queryContact(ArrayListChallenge1_Contact contact) {
		if (findContact(contact) >= 0) {
			return contact.getName();
		}//end if
		return null;
	}//end method

	public ArrayListChallenge1_Contact queryContact(String name) {
		int position = findContact(name);
		if (position >= 0) {
			return this.myContacts.get(position);
		}//end if

		return null;
	}//end method

	public void printContacts() {
		System.out.println("Contact List");
		for (int i = 0; i < this.myContacts.size(); i++) {
			System.out.println((i + 1) + "." + this.myContacts.get(i).getName() + " -> "
					+ this.myContacts.get(i).getPhoneNumber());
		}//end for

	}//end method

}// end class

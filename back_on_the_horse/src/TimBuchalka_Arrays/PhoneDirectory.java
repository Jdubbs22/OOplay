package TimBuchalka_Arrays;

import java.util.ArrayList;

public class PhoneDirectory {

	private ArrayList<String> PhoneList = new ArrayList<String>();

    public void addContact(String item) {
        PhoneList.add(item);
    }

    public void printContactList() {
        System.out.println("You have " + PhoneList.size() + " contacts in your contact list");
        for(int i=0; i< PhoneList.size(); i++) {
            System.out.println((i+1) + ". " + PhoneList.get(i));
            System.out.println();
        }
    }

    public void modifyContact(int position, String newItem) {
        PhoneList.set(position, newItem);
        System.out.println("contact # " + (position+1) + " has been modified.");
    }

    public void removeContact(int position) {
        String theItem = PhoneList.get(position);
        PhoneList.remove(position);
    }

    public String findItem(String searchItem) {
//        boolean exists = groceryList.contains(searchItem);

        int position = PhoneList.indexOf(searchItem);
        if(position >=0) {
            return PhoneList.get(position);
        }

        return null;
    }
	
	
}//end class

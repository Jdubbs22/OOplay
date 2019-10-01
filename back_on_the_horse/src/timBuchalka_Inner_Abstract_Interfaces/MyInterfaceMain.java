package timBuchalka_Inner_Abstract_Interfaces;

import java.util.ArrayList;
import java.util.Scanner;

public class MyInterfaceMain {

	public static void main(String[] args) {
	
		ISaveable3 DepaulHW1 = new HWRecords(1, "a");
		  System.out.println("Grade for Home Work Number "+ ((HWRecords)DepaulHW1).HWNum+ " = " 
				   +  ((HWRecords)DepaulHW1).getGrade());
		ISaveable3 DepaulHW2 = new HWRecords(2, "B");
		System.out.println(DepaulHW2);
		ISaveable3 DepaulHW3 = new HWRecords(3, "A");
		saveObject(DepaulHW3);
		System.out.println(DepaulHW3);
		ISaveable3 DepaulHW4= new HWRecords(0, null);
		System.out.println(DepaulHW4);
		loadObject(DepaulHW4);
		System.out.println(DepaulHW4);

	}//end main
	
	 public static ArrayList<String> readValues() {
	        ArrayList<String> values = new ArrayList<String>();

	        Scanner scanner = new Scanner(System.in);
	        boolean quit = false;
	        int index = 0;
	        System.out.println("Choose\n" +
	                "1 to enter a string\n" +
	                "0 to quit");

	        while (!quit) {
	            System.out.print("Choose an option: ");
	            int choice = scanner.nextInt();
	            scanner.nextLine();
	            switch (choice) {
	                case 0:
	                    quit = true;
	                    break;
	                case 1:
	                    System.out.print("Enter a string: ");
	                    String stringInput = scanner.nextLine();
	                    values.add(index, stringInput);
	                    index++;
	                    break;
	            }//end switch
	        }//end while
	        return values;
	    }//end method
	 
	 
	 public static void saveObject(ISaveable3 objectToSave) {//whatever class that impliments Isaveable3
	        for(int i=0; i<objectToSave.write().size(); i++) {//whatever info was "written"'s size
	            System.out.println("Saving " + objectToSave.write().get(i) + " to storage device");
	        }//end for
	    }//end method

	    public static void loadObject(ISaveable3 objectToLoad) {//this can be used for ANY object we create that impliments Isaveable3
	        ArrayList<String> values = readValues();// this puts the scanner info into an arraylist
	        objectToLoad.read(values);//whatever class your using that impliments Isaveable3 uses the read method to load
	        							//the info from the scanner
	    }//end method

}//end class

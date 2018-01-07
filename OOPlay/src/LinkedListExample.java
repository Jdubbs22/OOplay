import java.util.Iterator;
import java.util.LinkedList;
import java.util.ListIterator;
import java.util.Scanner;

public class LinkedListExample {
	public static void main(String[] args) {
		LinkedList<Integer> num = new LinkedList<Integer>();//can also be String, double ect.
		
		num.add(4);
		num.add(7);
		num.add(9);
		num.add(12);
		num.add(16);
		LinkedList<String> city = new LinkedList<String>();
		city.add("Boston");
		city.add("Denver");
		city.add("Los Angels");
		city.add("Portland");
		addInOrderString(city, "Chicago"); //could also be used to put them all in from beginning 
		addInOrderString(city, "Chicago"); //testing the duplicate function of the method
		
		printListString(city);
		
		printListInt(num);
		num.add(3,10);//position 3, inserting the #10
		printListInt(num);
		
		num.remove(3);//removes position 3
		printListInt(num);
		
		visit(city);
		
	}// end main

	private static void printListInt(LinkedList<Integer> linkList) {  //similar to using a for loop
		Iterator<Integer> i = linkList.iterator();
		while(i.hasNext()){ //goes through the entire list
			System.out.println("The Next integer is: "+i.next()); //DOES include the first element
		}//end while
		System.out.println("=========================");
	}//end printlist
	
	private static void printListString(LinkedList<String> city) {  //you need to be careful using methods that change the list
																//as the hasNext() can have side effects...make sure you know what your doing
		
		Iterator<String> i = city.iterator();
		while(i.hasNext()){ //goes through the entire list
			System.out.println("The Next City is: "+i.next()); 
		}//end while
		System.out.println("=========================");
	}//end printlist
	
	private static boolean addInOrderString(LinkedList<String> linkedList, String newCity){
		ListIterator<String> stringListIterator = linkedList.listIterator();  //used for insertion purposes
																			//listIterator works better for this
		while(stringListIterator.hasNext()){
			int comparison = stringListIterator.next().compareTo(newCity);
			if(comparison ==0) { //if its the same string...do not add
				System.out.println(newCity+ " is already in the list");
				return false;
			}//end if
			else if(comparison >0){//new city should appear before this one
				stringListIterator.previous(); //you have to go back one because of 
											//the previous .hasNext already moved it forward
				stringListIterator.add(newCity);
				return true;
			}//end elseif
			else if(comparison <0){ //do nothing...keep moving forward
				//move onto next city
			}//end elseif
			
		}//end while
		
		stringListIterator.add(newCity);
		return true;
	}//end addinorder
	
	private static void visit(LinkedList cities) {
        Scanner scanner = new Scanner(System.in);
        boolean quit = false;
        boolean goingForward = true; //added because otherwise it would take 2 presses to change direction
        // this is because of a oddity in the .next that keeps it from causing a infinate loop issue
        ListIterator<String> listIterator = cities.listIterator();

        if(cities.isEmpty()) {
            System.out.println("No cities in the itenerary");
            return;
        } //end if
        else {
            System.out.println("Now visiting " + listIterator.next());
            printMenu();
        }//end else

        while (!quit) {
            int action = scanner.nextInt();
            scanner.nextLine();
            switch(action) {
                case 0:
                    System.out.println("Holiday (Vacation) over");
                    quit = true;
                    break;

                case 1:
                    if(!goingForward) {
                        if(listIterator.hasNext()) {
                            listIterator.next();
                        }//end internal if
                        goingForward = true;
                    }//end if
                    if(listIterator.hasNext()) {
                        System.out.println("Now visiting " + listIterator.next());
                    } //end if
                    else {
                        System.out.println("Reached the end of the list");
                        goingForward = false;
                    }//end else
                    break;

                case 2:
                    if(goingForward) {
                        if(listIterator.hasPrevious()) {
                            listIterator.previous();
                        }//end internal if
                        goingForward = false;
                    }//end if
                    if(listIterator.hasPrevious()) {
                        System.out.println("Now visiting " + listIterator.previous());
                    } //end if
                    else {
                        System.out.println("We are at the start of the list");
                        goingForward = true;
                    }//end else
                    break;

                case 3:
                    printMenu();
                    break;

            }//end switch

        }//end while
    }//end visit
	
	
	private static void printMenu() {
        System.out.println("Available actions:\npress ");
        System.out.println("0 - to quit\n" +
                "1 - go to next city\n" +
                "2 - go to previous city\n" +
                "3 - print menu options");
    }//end printmenu
	
	
}// end link3 class

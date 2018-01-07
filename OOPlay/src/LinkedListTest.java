import java.util.Iterator;
import java.util.LinkedList;

public class LinkedListTest {

	
	public static void main(String[]args){
		LinkedList<String> numString = new LinkedList<String>();
		LinkedList<Integer> num = new LinkedList<Integer>();
		LinkedList<LinkedListTest> test = new LinkedList<LinkedListTest>();
		num.add(1);
		num.add(2);
		num.add(3);
		num.add(4);
		
		numString.add("one");
		numString.add("two");
		numString.add("three");
		numString.add("four");
		
		printList(numString,num);
		
	}//end main
	




	
	private static void printList(LinkedList<String> numString, LinkedList<Integer> num ) {  //similar to using a for loop
		Iterator<String> i = numString.iterator();
		while(i.hasNext()){ //goes through the entire list
			System.out.println(i.next()+ " "); //DOES include the first element
		}//end while
		Iterator<Integer> j = num.iterator();
		while(j.hasNext()){ //goes through the entire list
			System.out.println(" "+j.next()); //DOES include the first element
		}//end while
		
	}//end printlist
	
}//end class

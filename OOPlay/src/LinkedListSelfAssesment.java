
public class LinkedListSelfAssesment {

	/*
	 * class Node { public Node(double item, Node next) { this.item = item;
	 * this.next = next; }//end node
	 * 
	 * public double item; public Node next;
	 * 
	 * }// end node class
	 */

	public static class Node {
		int data;
		Node next;

		Node(){
			
		}
		Node(int data) {
			this.data = data;
		}// end node constructor

		Node(int data, Node next) {
			this.data = data;
			this.next = next;
		}// end node constructor
		
	}// end node class

	static Node insert(int data) {
		// precondition: the list is in ascending order
		// postcondition: the list is in ascending order and contains x
		Node start;
		if (start == null) { 
			start = new Node();
			return start;
		}
		Node p = start;
		while (p.next != null) {
			
			p = p.next;
		}
		p.next = new Node();
		return start;
	}// end insert

	static Node delete(Node start, int x) {
		// precondition: the list is in ascending order
		// postcondition: in asscendign order and if it did contain x, then the
		// first occurance of x has been deleted
		if (start == null || start.data > x) { // x is not in the list
			return start;
		} // end if
		else if (start.data == x) { // x is the first element in the list
			return start.next;
		} // end elseif
		for (Node p = start; p.next != null; p = p.next) {
			if (p.next.data > x) {
				break; // x is not in the list
			} // end if
			else if (p.next.data == x) { // x is in p.next node
				p.next = p.next.next; // delete it
				break;
			} // end elseif

		} // end for
		return start;
	}// end delete

	public static void main(String[] args) {
		
		Node start = new Node(22);
		Node p = start;
		
		
		//insert(4,null);
		
		for( int i= 1; i< 5; i++){
			p = p.next = new Node(22+ 11*i);
		}//end for
		for(p = start; p != null; p = p.next){
			System.out.println(p.data);
		}//end for
		

	}// end main

}// end linked list self ass

	
	
	
	
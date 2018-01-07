

public class LInkedListTake2 {

	public static class Node {
		int data;
		public Node first;
		public Node next;
		public Node prev;
		public Node current;

		Node() {

		}

		Node(int data) {
			this.data = data;
		}// end node constructor

		Node(int data, Node current) {
			this.data = data;
			this.current = current.next;
		}// end node constructor
	}// end Node class
	
	Node first;
	public boolean isEmpty () { return first == null; }
	
	public  void LinkedList(){
		first = new Node(0);
	}
	
	public static void insert( int data){
	

		
		
	}//end insert
	
	public static void main(String[]args){
		Node first = new Node(22);
		System.out.println(first.data);
		insert(33);
		System.out.println(first.next.data);
		
		
	}//end main

}

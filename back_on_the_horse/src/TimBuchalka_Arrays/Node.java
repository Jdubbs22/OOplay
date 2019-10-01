package TimBuchalka_Arrays;

public class Node{

		public Node first;
	public Song info;
	public Node next;
	
	public Node(Song info) {
		super();
		this.info = info;
		
	}//end constructor
	
	public Node(Song info, Node next){
		super();
		this.info = info;
		this.next = next;
	}//end expanded constructor
	
	
public Node getFirst() {
		return first;
	}



	public Song getInfo() {
		return info;
	}



	public Node getNext() {
		return next;
	}



public void setFirst(Node first) {
		this.first = first;
	}



	public void setInfo(Song info) {
		this.info = info;
	}



	public void setNext(Node next) {
		this.next = next;
	}



public void add(Song song){
	Node oldFirst = first;
	first= new Node(info);
	first.info = info;
	first.next= oldFirst;
	System.out.println("add executed");
}//end method
public void add2(Song song){
	
	info = song;
	System.out.println("add2 executed");
}//end method



}//end class


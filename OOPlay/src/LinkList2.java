
public class LinkList2 {
	public Link1 firstLink;
	
	LinkList2(){
		firstLink = null;
	}//end linklist constructor
	
	public boolean isEmpty(){
		return(firstLink ==null);
	}//end isempty
	
	public void insertFirstLink(int data){
		Link1 newLink = new Link1(data);
		newLink.next = firstLink;
		firstLink = newLink;
	}//end insert
	
	public Link1 removeFirst(){
		Link1 linkReference = firstLink;
		
		if(!isEmpty()){
			firstLink = firstLink.next;
		}//end if
		else{
			System.out.println("Empty linked list");
		}//end else
		return linkReference;
	}//end remove
	
	
	public void display(){
		Link1 theLink = firstLink;
		while(theLink != null){
			theLink.display();
			System.out.println("Next link: "+ theLink.next.data);
			theLink = theLink.next;
			System.out.println();
		}//end while
	}//end dislplay
	
	public Link1 find(int data){
		Link1 theLink = firstLink;
		if(!isEmpty()){
			while(theLink.data != data){
				if(theLink.next == null){
					return null;
				}//end if
				else{
					theLink = theLink.next;
				}//end else
			}//end while
		}//end if
		else{
			System.out.println("Empty linked list");
		}//end else
		return theLink;
	}//end find
	
public Link1 removeLink(int data){
	Link1 currentLink = firstLink;
	Link1 prevLink = firstLink;
	
	while(currentLink.data != data){
		if(currentLink.next ==null){
			return null;
		}//end if
		else{
			prevLink = currentLink;
			currentLink = currentLink.next;
		}//end else
	}//end while
		if(currentLink ==firstLink){
			firstLink= firstLink.next;
		}//end if
		else{
			prevLink.next = currentLink.next;
		}
		return currentLink;
}//end remove
}//end linklist2

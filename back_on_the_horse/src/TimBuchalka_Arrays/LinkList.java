package TimBuchalka_Arrays;

public class LinkList {

	  // Reference to first Link in list
	
	    // The last Link added to the LinkedList

	    public Node firstLink;
	
	    LinkList(){

	        // Here to show the first Link always starts as null

	        firstLink = null;
	    }//end constructor

	    public boolean isEmpty(){
	    	return(firstLink == null);
	    }//end method
	
	
	    public void insertFirstLink(Song info ){
	    	Node newNode = new Node(info );
	    }//end method
	    
	    public Node removeFirst(){
	    	Node nodeReference = firstLink;
	    	if(!isEmpty()){
	    		firstLink = firstLink.next;
	    	}//end if
	    	else{
	    		System.out.println("empty list");
	    	}//end else
	    	return nodeReference;
	    }//end method
	    
	    
	    public void display(){
	    	Node theNode = firstLink;
	    	 // Start at the reference stored in firstLink and
	    	  // keep getting the references stored in next for
	       // every Link until next returns null
	    	while(theNode !=null){
	    		//theNode.display();
	    		
	    		System.out.println("New node: "+ theNode.next);
	    		theNode= theNode.next;
	    		System.out.println("test test test");
	    	}//end while
	    	
	    }//end method
}//end class

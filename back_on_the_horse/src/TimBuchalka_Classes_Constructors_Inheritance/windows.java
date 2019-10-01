package TimBuchalka_Classes_Constructors_Inheritance;

public class windows {

	String type;
	Boolean open;
	Boolean locked;
	
	
	public windows(String type, Boolean open, Boolean locked) {
		super();
		this.type = type;
		this.open = open;
		this.locked = false;
	}//end constructor

	public void open_closeWindow(String choice){
		
		if(choice == "open")
			openWindow();
		if(choice == "closed")
			closeWindow();
		else
			System.out.println("You must choose open or closed");
	}
	
	
	private void openWindow(){
		this.open = true;
	}//end method
	
	private void closeWindow(){
		this.open = false;
	}//end method
	
	public void lock_unlockWindow(){
		if(locked==true){
			locked = false;
			System.out.println("The window is unlocked");
		}//end if
		else{
			locked = true;
			System.out.println("The window is locked");
		}//end else
	}//end method

	public String getType() {
		return type;
	}


	public Boolean getOpen() {
		return open;
	}


	public Boolean getLocked() {
		return locked;
	}
	
	
	
}//end class

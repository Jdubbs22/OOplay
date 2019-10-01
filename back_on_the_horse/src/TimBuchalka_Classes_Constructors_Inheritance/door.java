package TimBuchalka_Classes_Constructors_Inheritance;

public class door {

	String type;
	boolean locked;
	public door(String type, boolean locked) {
		super();
		this.type = type;
		this.locked = false;
	}
	
	public String getType() {
		return type;
	}
	public boolean isLocked() {
		return locked;
	}
	
	
	
	
}//end class

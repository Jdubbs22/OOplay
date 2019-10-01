package TimBuchalka_Classes_Constructors_Inheritance;

public class Jeep extends Car{

	private boolean hardTop;
	
	public Jeep(int doors, String steering, int gears, int speed, int wheels, boolean hardTop) {
		super(doors, steering, gears, speed, wheels);
		this.hardTop=hardTop;
		// TODO Auto-generated constructor stub
	}//end constructor

	public boolean isHardTop() {
		
		return hardTop;
	}//end getter

	
	

	
	
	
}//end class

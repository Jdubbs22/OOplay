package TimBuchalka_Classes_Constructors_Inheritance;

public class Car extends Vehicle{
	private int wheels;
	private int gears;
	public Car(int doors, String steering, int gears, int speed,int wheels) {
		super(doors, steering, speed);
		this.wheels = wheels;
		this.gears = gears;
		
		// TODO Auto-generated constructor stub
	}//end constructor

	public int getWheels() {
		return wheels;
	}
	
	

}//end class

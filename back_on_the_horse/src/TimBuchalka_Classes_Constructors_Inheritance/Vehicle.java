package TimBuchalka_Classes_Constructors_Inheritance;
//Challenge.
// Start with a base class of a Vehicle, then create a Car class that inherits from this base class.
// Finally, create another class, a specific type of Car that inherits from the Car class.
// You should be able to hand steering, changing gears, and moving (speed in other words).
// You will want to decide where to put the appropriate state and behaviours (fields and methods).
// As mentioned above, changing gears, increasing/decreasing speed should be included.
// For you specific type of vehicle you will want to add something specific for that type of car.

public class Vehicle {

	private int doors;
	private String steering;
	private int gears;
	private int speed;
	
	
	
	public Vehicle(int doors, String steering,  int speed) {
		super();
		this.doors = doors;
		this.steering = steering;
		
		this.speed = speed;
	}//end constructor
	
	public int increaseSpeed(){
		return speed++;
		
	}//end method
	
	public int decreaseSpeed(){
		while(speed >0){
		return speed--;
		}
		System.out.println("You cannot lower the speed any furhter");
		return speed;
	}//end method
	
	public void displaySpeed(){
		System.out.println("The current speed is "+ speed);
		
	}//end method

	public int getDoors() {
		return doors;
	}
	public String getSteering() {
		return steering;
	}
	public int getGears() {
		return gears;
	}
	public int getSpeed() {
		return speed;
	}
	
	
	
	
}//end class

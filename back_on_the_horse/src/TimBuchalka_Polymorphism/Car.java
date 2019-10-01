package TimBuchalka_Polymorphism;
// We are going to go back to the car analogy.
// Create a base class called Car
// It should have a few fields that would be appropriate for a generice car calss.
// engine, cylinders, wheels, etc.
// Constructor should initialize cylinders (number of) and name, and set wheels to 4
// and engine to true. Cylinders and names would be passed parameters.
//
// Create appropriate getters
//
// Create some methods like startEngine, accelerate, and brake
//
// show a message for each in the base class
// Now create 3 sub classes for your favorite vehicles.
// Override the appropriate methods to demonstrate polymorphism in use.
// put all classes in the one java file (this one).
public class Car {

	protected boolean engine;
	protected String name;
	protected int wheels;
	protected int cylinders;
	protected int speed;
	protected boolean engineOn;
	
	public Car( String name, int cylinders) {
		super();
		this.engine = true;
		this.name = name;
		this.wheels = 4;
		this.cylinders = cylinders;
		this.speed = 0;
		this.engineOn= false;
	}//end constructor
	
	public void startEngine(){
		if(engineOn==false){
			engineOn =true;
			System.out.println("engine starting");
		}//end if
	}//end method
	
	public int accelerate(){
		this.speed++;
		System.out.println("The current speed is "+ this.speed);
		return this.speed;
	}
	
	public int brake() {
		this.speed--;
		System.out.println("The current speed is " + this.speed);
		return this.speed;
	}

	public boolean isEngine() {
		return engine;
	}

	public String getName() {
		return name;
	}

	public int getWheels() {
		return wheels;
	}

	public int getCylinders() {
		return cylinders;
	}

	public int getSpeed() {
		return speed;
	}

	public boolean isEngineOn() {
		return engineOn;
	}
	
	
}//end class

package TimBuchalka_Polymorphism;

public class SafeCar extends Car {

	public SafeCar(String name, int cylinders) {
		super(name, cylinders);
		// TODO Auto-generated constructor stub
	}// end constructor

	public int brake() {
		this.speed = 0;
		System.out.println("The current speed is " + this.speed);
		return this.speed;
	}

}// end class

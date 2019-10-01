package TimBuchalka_Polymorphism;

public class LoudCar extends Car {

	public LoudCar(String name, int cylinders) {
		super(name, cylinders);
		// TODO Auto-generated constructor stub
	}// end constructor

	@Override
	public void startEngine() {
		if (engineOn == false) {
			engineOn = true;
			System.out.println("Vroom, VRoom, VROOM");
		} // end if
	}// end method

}// end class

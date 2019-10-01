package TimBuchalka_Polymorphism;

public class Main {

	public static void main(String[] args) {

		Car testCar = new Car("Test car", 4);
		System.out.println(testCar.getSpeed());
		testCar.accelerate();
		System.out.println(testCar.getSpeed());
		testCar.brake();
		System.out.println(testCar.getSpeed());
		System.out.println();

		FastCar nitroCar = new FastCar("Nitro car", 4, true);
		System.out.println(nitroCar.getSpeed());
		nitroCar.accelerate();
		nitroCar.accelerate();
		nitroCar.startEngine();
		System.out.println();

		LoudCar loudCar = new LoudCar("LoudCar", 6);
		loudCar.startEngine();
		System.out.println(loudCar.getSpeed());
		loudCar.accelerate();
		loudCar.accelerate();
		loudCar.brake();
		System.out.println();

		SafeCar volvo = new SafeCar("Volvo", 4);
		volvo.startEngine();
		volvo.accelerate();
		volvo.accelerate();
		volvo.accelerate();
		volvo.accelerate();
		volvo.brake();
		System.out.println(volvo.getWheels());
	}// end main

}// end class

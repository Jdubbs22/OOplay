package TimBuchalka_Polymorphism;

public class FastCar extends Car {

	boolean nitroBoost;

	public FastCar(String name, int cylinders, boolean nitroBoost) {
		super(name, cylinders);
		this.nitroBoost = nitroBoost;
	}

	@Override
	public int accelerate() {
		if (nitroBoost == true) {
			this.speed++;
			this.speed++;
			System.out.println("The current speed is " + this.speed);
			return this.speed;
		} else
			this.speed++;
		System.out.println("The current speed is " + this.speed);
		return this.speed;
	}

}

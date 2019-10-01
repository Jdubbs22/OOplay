package TimBuchalka_Classes_Constructors_Inheritance;

public class Fish extends Animal{

	private int gills;
	private int eyes;
	private int fins;
	
	
	public Fish(String name, int size, int weight, int gills, int eyes, int fins) {
		super(name, 1, 1, size, weight);
		this.gills = gills;
		this.eyes = eyes;
		this.fins = fins;
	}//end constructor
	
	private void rest(){
		
	}//end method
	
	@Override
	public void  move(int speed){
		super.move(speed);
		if(speed > 5)
			System.out.println("The fish " + getName()  + " is swimming fast");
		else
			System.out.println("The fish " + getName()  + " is swimming slow.");
		
		
	}//end method
	
	
	
	
}//end class

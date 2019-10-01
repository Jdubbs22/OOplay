package TimBuchalka_Classes_Constructors_Inheritance;

public class Dog extends Animal{

	
	private int eyes;
	private int legs;
	private int tail;
	private int teeth;
	private String coat;

	public Dog(String name, int size, int weight, int eyes, int legs, int tail,int teeth, String coat) {
		super(name, 1, 1, size, weight);
		this.eyes = eyes;
		this.legs = legs;
		this.tail = tail;
		this.teeth= teeth;
		this.coat = coat;
	}//end constuctor

	private void burp(){
		System.out.println("burp");
	}
	
	@Override
	public void eat() {
		// TODO Auto-generated method stub
	super.eat();//calls the original method
	burp();
	}
	@Override
	public void  move(int speed){
		super.move(speed);
		if(speed > 5)
			System.out.println( getName()  + " is running fast");
		else
			System.out.println(  getName()  + " is walking slow.");
		
	}//end method  

}//end class

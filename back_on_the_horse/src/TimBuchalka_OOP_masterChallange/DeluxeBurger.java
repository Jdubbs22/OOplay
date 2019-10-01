package TimBuchalka_OOP_masterChallange;

public class DeluxeBurger  extends Hamburger{

	String chips;
	String drink;
	
	public DeluxeBurger(String chips, String drink) {
		super("regular", "beef", 7.0);
		this.chips = chips;
		this.drink = drink;
		// TODO Auto-generated constructor stub
	}//end constructor
	
	@Override
	public double addCondiments(boolean cheese, boolean veggies, boolean sauce, boolean condiments){
		System.out.println("no additions are allowed");
		return price;
		
		
	}//end method

}//end class

package TimBuchalka_OOP_masterChallange;

public class Hamburger {

	String roll;
	String meat;
	boolean cheese;
	boolean veggies;
	boolean sauce;
	boolean condiments;
	double price;
	public Hamburger(String roll, String meat, double price) {
		super();
		this.roll = roll;
		this.meat = meat;
		this.price = price;
	}//end constructor
	
	public double addCondiments(boolean cheese, boolean veggies, boolean sauce, boolean condiments){
		
		if(cheese){
		 price +=1.0;
		}//end if
		if(veggies){
			 price +=.5;
			}//end if
		if(sauce){
			 price +=.5;
			}//end if
		if(condiments){
			 price +=.75;
			}//end if
		return price;
	}//end method
	
	public String getRoll() {
		return roll;
	}
	public String getMeat() {
		return meat;
	}
	public boolean isCheese() {
		return cheese;
	}
	public boolean isVeggies() {
		return veggies;
	}
	public boolean isSauce() {
		return sauce;
	}
	public boolean isCondiments() {
		return condiments;
	}
	public double getPrice() {
		return price;
	}
	
	
	
	
	
}//end class

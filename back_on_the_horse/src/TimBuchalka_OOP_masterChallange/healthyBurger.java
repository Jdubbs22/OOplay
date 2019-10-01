package TimBuchalka_OOP_masterChallange;

public class healthyBurger extends Hamburger{
	boolean soycheese;
	boolean plain;
	
	double additionalPrice = 0;
	
	
	
	public healthyBurger( String meat) {
		super("brown rye", meat, 5.5);
		// TODO Auto-generated constructor stub
	}//end constructor

	
	public double addCondiments(boolean cheese, boolean veggies, boolean sauce,
			boolean condiments, boolean soycheese, boolean plain){
		if(cheese){
			 price +=1.0;
			 additionalPrice+=1;
			}//end if
			if(veggies){
				 price +=.5;
				 additionalPrice+=.5;
				}//end if
			if(sauce){
				price +=.5;
				additionalPrice+=.5;
				}//end if
			if(condiments){
				 price +=.75;
				 additionalPrice+=.75;
				}//end if
		if( soycheese){
			price += .5;
			additionalPrice+=.5;
		}//end if
		if(plain){
			price -= additionalPrice;
		}//end if
		
	return healthyBurger.this.price+ additionalPrice;	
	}//end method
	
}//end class

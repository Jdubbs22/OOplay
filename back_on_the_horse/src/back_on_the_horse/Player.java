package back_on_the_horse;

public class Player{
	int number =0;
	public void guess(){
	number = (int) (Math.random()*10);
	System.out.println("I'm guessing a number "+ number);
	
	}//end guess
}//end player

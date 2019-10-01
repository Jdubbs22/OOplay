package back_on_the_horse;

public class GuessGame {

	
	   // GuessGame has 3 instance variables for 3 player objects
		Player p1;
		Player p2;
		Player p3;
		
		public void startGame(){  //creates 3 player objects and assigns them to the 3
									// instance variables
			p1 = new Player();
			p2 = new Player();
			p3 = new Player();
			
			int guessp1 = 0;//declares 3 varaiable to hold guesses players make
			int guessp2 = 0;
			int guessp3 = 0;
			
			boolean p1isRight = false;//declare 3 variables to hold true or false based on player answer
			boolean p2isRight = false;
			boolean p3isRight = false;
			
			int targetNumber = (int) (Math.random()*10);//makes target # players have to guess
			System.out.println("I'm thinking of a number between 0 and 9...");
			
			while(true){
				System.out.println("Number to guess is " + targetNumber);
				
				p1.guess();//calls guess method
				p2.guess();
				p3.guess();
				
				guessp1 = p1.number;//players guess by accessing the # variable of player
				System.out.println("Player one has guessed "+ guessp1);
				
				guessp2 = p2.number;
				System.out.println("Player two has guessed "+ guessp2);
				
				guessp3 = p3.number;
				System.out.println("Player three has guessed "+ guessp3);
				
				if (guessp1 == targetNumber){//check to see if guess matches target #
											//if true than set true otherwise false by default
					p1isRight = true;
				}//end if
				
				if (guessp2 == targetNumber){
					p2isRight = true;
				}//end if
				
				if (guessp3 == targetNumber){
					p3isRight = true;
				}//end if
				
				if (p1isRight || p2isRight || p3isRight){// || is or
					
					System.out.println("We have a winner");
					System.out.println("Player one got it right? "+ guessp1);
					System.out.println("Player two got it right? "+ guessp2);
					System.out.println("Player three got it right? "+ guessp3);
					System.out.println("Game is over.");
					break;
					
				}//end if
				
				else{//otherwise stay in the loop and ask players for another guess
				System.out.println("Players will have to try again");	
				}//end else
				
			}//end while
			
		}//end method...startgame

		 
		
	}// end class
	
	




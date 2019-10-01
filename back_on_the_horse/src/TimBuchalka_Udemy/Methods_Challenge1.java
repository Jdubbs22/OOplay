package TimBuchalka_Udemy;

public class Methods_Challenge1 {
	
	public static void main(String[]args){
		
		boolean gameOver = true;
        int score = 800;
        int levelCompleted = 5;
        int bonus = 100;

        int highScore = calculateScore(gameOver, score, levelCompleted, bonus);
        System.out.println("Your final score was " + highScore);

        score = 10000;
        levelCompleted = 8;
        bonus = 200;

        highScore = calculateScore(gameOver, score, levelCompleted, bonus);
        System.out.println("Your final score was " + highScore);

        // Create a method called displayHighScorePosition
        // it should a players name as a parameter, and a 2nd parameter as a position in the high score table
        // You should display the players name along with a message like " managed to get into position " and the
        // position they got and a further message " on the high score table".
        //
        // Create a 2nd method called calculateHighScorePosition
        // it should be sent one argument only, the player score
        // it should return an in
        // the return data should be
        // 1 if the score is >=1000
        // 2 if the score is >=500 and < 1000
        // 3 if the score is >=100 and < 500
        // 4 in all other cases
        // call both methods and display the results of the following
        // a score of 1500, 900, 400 and 50
        //
        int highScorePosition = calculateHighScorePostion(1500);
        displayHighScorePostion("Tim", highScorePosition);

        highScorePosition = calculateHighScorePostion(900);
        displayHighScorePostion("Bob", highScorePosition);

        highScorePosition = calculateHighScorePostion(400);
        displayHighScorePostion("Percy", highScorePosition);

        highScorePosition = calculateHighScorePostion(50);
        displayHighScorePostion("Gilbert", highScorePosition);

        highScorePosition = calculateHighScorePostion(1000);
        displayHighScorePostion("Louise", highScorePosition);

        highScorePosition = calculateHighScorePostion(500);
        displayHighScorePostion("Carol", highScorePosition);

        highScorePosition = calculateHighScorePostion(100);
        displayHighScorePostion("Frank", highScorePosition);
	}//end main
	
	public static int calculateHighScorePostion(int score){
		if(score >=1000){
			return 1;
		}else if(score >=500 && score <1000){
			return 2;
		}else if(score >=100 && score <5000){
			return 3;
		}else return 4;
	}//end calculatehighscorepostion
	
	public static void displayHighScorePostion(String name, int position){
		System.out.println( name + " managed to get into position "+ position);
	}//end displayHighscorepostion

	public static int calculateScore(boolean gameOver, int score, int levelCompleted, int bonus) {
		if(gameOver) {
            int finalScore = score + (levelCompleted * bonus);
            finalScore += 2000;
            return finalScore;
	}
	
	return -1;
	}

}//end class

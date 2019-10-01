package TimBuchalka_Udemy;

import java.text.DecimalFormat;

public class testCodeSnippets {


	public static void main(String[] args) {
		
	}//end main

	public static boolean isCatPlaying(boolean summer, int temp){
		if((summer != true) &&(temp >=25 && temp <=35)){

			return true;

		}//end if

		else if((summer == true)&& (temp >=25 && temp <=45)){

			return true;

		}//end if
		else return false;


	}//end method
	
}//end class

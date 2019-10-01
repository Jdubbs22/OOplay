package TimBuchalka_Udemy;

import java.util.Scanner;

public class readingUserInput {

	public static void main(String[] args) {
		/*
		 * Scanner scanner = new Scanner(System.in);
		 * 
		 * System.out.println("What is the year of your birth?");
		 * 
		 * boolean hasNextInt = scanner.hasNextInt();// returns false if not an
		 * int
		 * 
		 * if (hasNextInt) { int birthYear = scanner.nextInt();// automatically
		 * parses string to // int scanner.nextLine();// otherwise it recognizes
		 * the enter key as a // value for the next line
		 * 
		 * System.out.println("Enter your name: "); String name =
		 * scanner.nextLine(); // System.out.println("Hello "+ name);
		 * 
		 * int age = 2018 - birthYear; if (age >= 0 && age <= 100) {
		 * System.out.println("So " + name + " that makes you " + age); } // end
		 * if else { System.out.println("Invalid year of birth"); } // end else
		 * } // end if else {
		 * System.out.println("unable to parse year of birth"); }
		 * scanner.close();// free's the memory scanner took up
		 */

		/*
		 * -Read 10 numbers from the console entered by the user and print the
		 * sum of those numbers. -Create a Scanner like we did in the previous
		 * video. -Use the hasNextInt() method from the scanner to check if the
		 * user has entered an int value. -If hasNextInt() returns false, print
		 * the message gInvalid Numberh. Continue reading until you have read
		 * 10 numbers. -Use the nextInt() method to get the number and add it to
		 * the sum. -Before the user enters each number, print the message
		 * gEnter number #x:h where x represents the count, i.e. 1, 2, 3, 4,
		 * etc. -For example, the first message printed to the user would be
		 * gEnter number #1:h, the next gEnter number #2: h, and so on.
		 * 
		 * Hint: -Use a while loop. -Use a counter variable for counting valid
		 * numbers. -Close the scanner after you donft need it anymore. -Create
		 * a project with the name ReadingUserInputChallenge.
		 
		int temp = 0;
		int answer = 0;
		int count = 0;
		System.out.println("Please enter 10 #'s");
		Scanner scanner = new Scanner(System.in);
		boolean hasNextInt = scanner.hasNextInt();// returns false if not an int
		while (count <= 9) {
			if (hasNextInt) {
				temp = scanner.nextInt();
				answer += temp;
				count++;
				System.out.println("Num entered was " + temp);
			} // end if
			else {
				System.out.println("Not a valid #");
			} // end else
			
		} // end while
		scanner.close();
		System.out.println();
		System.out.println("Total count of all numbers given is " + answer);
		*/
		
	}// end main

}// end class

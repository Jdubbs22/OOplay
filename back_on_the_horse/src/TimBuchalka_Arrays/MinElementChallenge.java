package TimBuchalka_Arrays;

import java.util.Scanner;

public class MinElementChallenge {
//-Write a method called readIntegers() with a parameter called count that represents how many integers the user needs to enter.

//-The method needs to read from the console until all the numbers are entered, and then return an array containing the numbers entered.

//-Write a method findMin() with the array as a parameter. The method needs to return the minimum value in the array.

//-In the main() method read the count from the console and call the method readIntegers() with the count parameter. 

//-Then call the findMin() method passing the array returned from the call to the readIntegers() method.

//-Finally, print the minimum element in the array.

	//Tips: 
		//-Assume that the user will only enter numbers, never letters
		//-For simplicity, create a Scanner as a static field to help with data input
		//-Create a new console project with the name eMinElementChallengef
	
	public static int findMin(int[]array){
		int min= array[0];
		for(int i = 0;i<array.length;i++){
			if(min>=array[i]){
				min = array[i];
			}//end if
		}//end for
		System.out.println(min);
		return min;
	}//end method
	
	public static void printArray(int[] array) {
	    for(int i=0; i<array.length; i++) {
	        System.out.println("Element " + i + " contents " + array[i]);
	    }//end for
	}//end method 
	
	private static Scanner scanner = new Scanner(System.in);
	
	private static int[] readIntegers(int count) {

        int[] array = new int[count];
        System.out.println("enter "+count+" numbers");
        for(int i = 0; i<array.length; i++) {
            int number = scanner.nextInt();
            scanner.nextLine();
            array[i] = number;
            
        }//end for
        return array;
    }//end method

	
	public static void main(String []args){
		findMin(readIntegers(4));
		
	}//end main
	
	
}//end class

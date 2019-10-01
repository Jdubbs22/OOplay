package TimBuchalka_Arrays;

public class reverseArrayChallenge {

	
	//-Write a method called reverse() with an int array as a parameter.

//	-The method should not return any value. In other words, the method is allowed to modify the array parameter.

//	-In main() test the reverse() method and print the array both reversed and non-reversed.

//	-To reverse the array, you have to swap the elements, so that the first element is swapped with the last element and so on.

//	-For example, if the array is {1, 2, 3, 4, 5}, then the reversed array is {5, 4, 3, 2, 1}.
	
	private static void reverse(int[] array){
		int hi = array.length - 1;
		int lo = 0;
		while (lo < hi) {
			int loVal = array[lo];
			int hiVal = array[hi];
			array[hi] = loVal;
			array[lo] = hiVal;
			lo = lo + 1;
			hi = hi - 1;
			
		}//end while
		for(int i=0;i<array.length;i++){
			System.out.print(array[i]+" ");
		
			
		}//end for
		System.out.println();
	}//end method
	
	public static void displayArray(int[] array){
		for(int i=0; i<array.length;i++)
			System.out.print(array[i]+" ");
		System.out.println();
	}//end method
	public static void main(String[] args) {
		int[] testArray = {7,3,6,8,1,9,14};
		displayArray(testArray);
		System.out.println();
		reverse(testArray);
		displayArray(testArray);
	}//end main

}//end class

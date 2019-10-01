package TimBuchalka_Udemy;

public class numberToWords {
	//counts the number of digits in a number..used if reverse takes off zero's for the numbtowords method
	public static int getDigitCount(int number){ 
		int count = 0;
		//System.out.println(number);
		if (number <0){
			return -1;
		}//end if 
		if(number == 0){
			count = 1;
		}
		while(number >0){
			number/=10;
			count++;
		}//end while
		
		return count;
	}//end method
	
	// reverses a number ala 123 becomes 321  but it also removes zeros so 120 becomes 21
	public static int reverse (int numb){
		int finalNum=0;
		
			while (numb != 0) {
			    finalNum = finalNum * 10 + numb % 10;
			    numb = numb / 10;   
		
		}//end while
		
		return finalNum;
		
		
	//	return finalNum;
	}//end method
	
	//prints the number given to words..also uses the above two methods to fix bugs
	public static void numberToWords(int num){
		int reverseNum = reverse(num);//without this it will print reverse so we use this to print as seen
		int numb = reverseNum;
		int temp;
		int numLength =getDigitCount(num);
		//System.out.println("numlength ="+ numLength);
		
		int revLength = getDigitCount(numb);
		//System.out.println("revlength = "+revLength);
		String stringNum = null;
		if(numb <0){
			 System.out.println("Invalid Value");
			
		}//end if
		while(numb>0){
			
			temp = numb % 10;
			numb/=10;
			switch(temp){
			case 0: 
			stringNum= "Zero ";
			break;
			case 1: 
			stringNum = "One ";
			break;
			case 2: 
				stringNum = "Two ";
				break;
			case 3: 
				stringNum = "Three ";
				break;
			case 4: 
				stringNum = "Four ";
				break;
			case 5: 
				stringNum = "Five ";
				break;
			case 6: 
				stringNum = "Six ";
				break;
			case 7: 
				stringNum = "Seven ";
				break;
			case 8: 
				stringNum = "Eight ";
				break;
			case 9: 
				stringNum = "Nine ";
				break;
			}//end switch
		
			System.out.print(stringNum);
			
		}//end while
		for(int i = revLength; i< numLength;i++){ //if reverse removed zeros this puts them back in
			System.out.print("Zero ");
		}//end for
		System.out.println();
	}//end method
	
	
	//##################################################################################################
	// a perfect # is a postive int  where the divisors (minus the # itself) add up to the number
	//ala 6 is a perfect number because 1+2+3 = 6
	public static boolean isPerfectNumber (int num){
		int total=0;
		if (num <1){
			return false;
		}//end if
			for(int i =1;i<num;i++){
				if(num % i ==0){
				total+= i;	
				}//end if
				if(total == num){
					return true;
				}//end if
			}//end for
		return false;
	}//end method

	//factors are #'s that divide without a remainder
	public static void printFactors(int num){
		
		if(num < 1){
			System.out.println("Invalid Value");
		}//end if
		else{
			for(int i=1; i<=num;i++){
				if(num % i ==0){
					System.out.print(i+ " ");
				}
			}//end for
		}//end else
		
	}//end method
	
	
}//end class

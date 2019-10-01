package TimBuchalka_Udemy;

public class digitSums {
	
	
	// below method returns the sum of even numbers ala 1234 returns 6
	public static int getEvenDigitSum( int number){
		int lastDig=0;
		int tempDig = 0;
		int answer = 0;
		if(number <0){
			return -1;
		}//end if
		
		while (number>9){
			if((number % 10) % 2 == 0){  //checks to see if last num is even and if so stores it and adds it to answer
				tempDig =number % 10;
				answer +=tempDig;
			}//end if
			number /= 10;  //removes last number	
		}//end while
		if((number <9)&& number %2 ==0){//above if would return answer minus the first number so this is needed
			answer+=number;
		}
		return answer;
	}//end method

	
	
	//below takes the first digit and the last digit in a number and sums them reguardless of length
	public static int sumFirstAndLastDigit(int num){
		  if (num<0){
	            return -1;
	        }//end if
		  else if(num<10){  //if its a single digit add it to itself (per the parameters on challenge)
	            return num+num;
	            }// end if
		  else {
	            int sumDigits = 0;
	            int lastDigit =0;
	            int firstDigit = 0;
	            lastDigit=num%10;  //stores the last digit
	            while (num>9){
	                num/=10;
	                firstDigit=num;
	                sumDigits = firstDigit+lastDigit;
	            }//end while
	            return sumDigits;
	        }//end else
		 /* alternate solution
		  * if(num <0) return -1;
	      
	       int lastdig = num % 10;
	       int firstDigit = Integer.parseInt(Integer.toString(num).substring(0, 1));
	        return (lastdig+firstDigit);
	    	*/
		  
	}//end method
	
	//below checks to see if a number is shared between num1 and num2...they both must be between 10-99 or 2 digits
	public static boolean hasSharedDigit( int num1, int num2){ 
		int num1a;
		int num1b;
		int num2a;
		int num2b;
		
		if((num1 >=10 && num1 <=99) && (num2 >=10 && num2 <=99)){
			num1b= num1 %10;
			num1a= num1 /10;
			num2b= num2 %10;
			num2a= num2 /10;
			if((num1a == num2a || num1a == num2b) ||(num1b == num2a || num1b == num2b) ){
				return true;
			}//end internal if
		}//end if
		return false;
	}//end method
	
	// below needs to be cleaned up but it finds the greatest common divisor between two ints
	public static int greatestCommonDivisor(int first, int second){
		int firstDiv=1;
		int secondDiv=1;
		int sharedDiv=1;
		int lowest;
		int highest;
		int answer = 0;
		if(first==1 || second==1){
			return 1;
		}//end if
		if(first<second){  //not sure if this if/else is needed
			lowest = first;
			highest = second;
		}//end if
		else {
			lowest = second;
		highest = first;
		}//end else
		while (first>=10 && second >=10){
		for(int i=2; i<=lowest;i++){  //set for lowest because at max it could be the smallest number
			if(lowest % i ==0 && highest % i ==0){
				answer = i;
			}//end if
		}//end for
		return answer;
		}//end while
		return -1;
	}//end method
	
	
	
	
	
}//end class

package TimBuchalka_Udemy;

public class numPalendrome_leapYearCalculator {
	
	
	public static boolean isPalindrome (int number){
		int orginalNum = number;
		int reverse = 0;
		if (number <0){
			number = number * -1;
			orginalNum = number;
		}//end if
		while( number > 0){
		
		int lastDigit = number % 10;
		reverse*=10;
		reverse+=lastDigit;
		number /= 10;
		
		if(orginalNum == reverse)
			
			return true;
		}//end while
		
		return false;
	}//end method
	
	
	   public static boolean isLeapYear(int year){
			while(year >0 && year<=9999){
				if((year %4 ==0 && year %100 != 0) || year %400 == 0){
					return true;
				}//end if
				else return false;
			}//end while
			return  false;
		}//end method
		
		public static int getDaysInMonth(int month,int year){
			int days;
			while((month>=1 && month <=12) &&(year>=1 &&year <=9999)){
				switch(month){
				case 1: case 3: case 5: case 7: case 8:
				case 10: case 12:
					days=31;
					return days;
				case 4: case 6: case 9: case 11:
					days = 30;
					return days;
				case 2:
					if( isLeapYear(year)==true){
						days = 29;
						return days;
					}//end if
					else days = 28;
					return days;
				
				}//end switch
				
			}//end while
			return -1;
		}//end method

}//end method

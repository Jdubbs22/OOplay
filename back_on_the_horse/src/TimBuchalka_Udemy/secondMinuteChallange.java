package TimBuchalka_Udemy;

public class secondMinuteChallange {

	public static String getDurationString(int min, int sec){
		if((min <0) || ((sec <0) || (sec >59))) {
            System.out.println("Invalid Value");
            return null;
        }//end if
		 int hours = min / 60; 
		 int remainMin = min % 60;
		 
		return hours+" Hours.."+remainMin+" minutes..."+sec+" seconds";
		
	}//end getdur method
	
	public static String getDurationString(int sec){
		if(sec <0){
		return "Invalid value";  }//end if
		
		int min = sec/60;
		int remainSec = sec % 60;
		
		return getDurationString(min, remainSec);
		
		
	}//end getdur overloaded method
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(getDurationString(127,50));
		System.out.println(getDurationString(3945));
		
		
	}//end main

}//end class

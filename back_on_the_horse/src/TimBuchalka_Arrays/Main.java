package TimBuchalka_Arrays;

import java.util.ArrayList;

public class Main {

	
	
	
	public static void main(String[]args){
		
		ArrayList<Double> myDoubleVal = new ArrayList<Double>();
		Double dbl;
		for(dbl= 0.0;dbl <= 10.0; dbl+=.5 ){
			myDoubleVal.add(dbl);
			System.out.println(myDoubleVal.toString());
			
		}
		
		
	}//end main
	
}//end class

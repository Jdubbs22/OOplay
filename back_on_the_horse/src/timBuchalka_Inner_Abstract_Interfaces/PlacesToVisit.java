package timBuchalka_Inner_Abstract_Interfaces;


import java.util.ArrayList;

public class PlacesToVisit implements ISaveable{

	String cities;
	
	
	
	public PlacesToVisit() {
		super();
		
	}//end constructor

	 
	
	@Override
	public ArrayList<String> SaveArray() {
		ArrayList<String> city= Iterface_Main.readValues();
		return city;
	}//end method

	@Override
	public ArrayList<String> returnArray(ArrayList<String> thing) {
		
		for(int i = 0; i<thing.size();i++){
			cities=thing.get(i);
			System.out.println("Another city to visit: "+ cities);
		}//end for
		return null;
	}//end method
	
	@Override
	public String toString(){
		return "Another city to visit: "+ cities;
	}//end tostring 



	

	

	

}//end class

package timBuchalka_Inner_Abstract_Interfaces;

import java.util.ArrayList;

public class FavoriteFoods implements ISaveable {

	@Override
	public ArrayList<String> SaveArray() {
		ArrayList<String> food= Iterface_Main.readValues();
		
		return food;
	}//end method

	@Override
	public ArrayList<String> returnArray(ArrayList<String> thing) {
	
		return null;
	}//end method
	
	
	public void printFavFoods(ArrayList<String> foods){
		for(int i = 0; i<foods.size();i++){
			System.out.println("Another favorite food of mine is "+ foods.get(i));
		}//end for
	}//end method


	
	
}//end class

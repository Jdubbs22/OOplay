package shapes;

import java.util.ArrayList;

public class ShapesCollection {
	
	ShapesCollection(){
		 shapesArray = new ArrayList<IShape>();
		
	}//end constructor
	
	private ArrayList<IShape> shapesArray;
	
	public void insertShape(IShape shape){
		if(shape == null){
			return;
		}//end if
		shapesArray.add(shape);
	}//end insert
	
	public void removeShape(IShape shape){
		
		int index =shapesArray.indexOf(shape);
		if(index == -1){
			return;
		}//end if
		shapesArray.remove(index);
		
	}//end remove



}//end class

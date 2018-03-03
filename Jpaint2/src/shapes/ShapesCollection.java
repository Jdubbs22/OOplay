package shapes;

import java.util.ArrayList;

import controller.RenderControler;
import model.ApplicationState;
import view.PaintCanvas;
import view.interfaces.IUiModule;

public class ShapesCollection {  
	PaintCanvas pc;
	RenderControler rc;
	public ShapesCollection(){
		 shapesArray = new ArrayList<IShape>();
		
	}//end constructor
	
	private final ArrayList<IShape> shapesArray; //added final keyword

	public void insertShape(IShape shape){
		if(shape == null){
			return;
		}//end if
		shapesArray.add(shape);
		System.out.println("shape added to shapes array");
		
	}//end insert
	
	public void removeShape(IShape shape){
		
		int index =shapesArray.indexOf(shape);
		if(index== -1){
			return;
			
		}//end if
		shapesArray.remove(index);
		//index--;
		System.out.println("shape removed from shapes array");//why isn't this printing???
		
	/*	pc.repaint();
		for(IShape currentShape : shapesArray){
			rc.DrawShapeAtPoints(currentShape);
			
		}//end for   
		*/ 
	}//end remove
	
// -----------------vvv---made into singleton---vvv---------------------------
								//???
	
	 private static void initializeShapesCollectionSingleton(){
		   if(instance != null){
			   throw new RuntimeException("initialize of shapes collection called twice");
		   }
		   instance = new ShapesCollection();
		   
		   
	   }
	 private static ShapesCollection instance;
	 
	 public static ShapesCollection getShapesCollectionInstance(){
	    	if(instance == null){
	    		throw new RuntimeException(" initialization of shapes collection has not been called");
	    		}
	    	return instance;
	    }
	 


}//end class

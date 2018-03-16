package shapes;

import java.awt.Point;
import java.awt.Rectangle;
import java.util.ArrayList;

import controller.RenderControler;
import model.ApplicationState;
import view.PaintCanvas;
import view.interfaces.IUiModule;

public class ShapesCollection {  
	PaintCanvas pc;
	RenderControler rc;
	private ShapesCollection(){
		 shapesArray = new ArrayList<IShape>();
		
	}//end constructor
	
	private final ArrayList<IShape> shapesArray; //added final keyword

	
	public void insertShape(IShape shape){
		if(shape == null){
			return;
		}//end if
		
		
		
		shapesArray.add(shape);
		int index =shapesArray.indexOf(shape);
		//index++;
		System.out.println("shape added to shapes array");
		System.out.println(index);
		System.out.println("shapes in the arraylist"+ shapesArray);
		
		
	}//end insert
	
	public void removeShape(IShape shape){
		
		int index =shapesArray.indexOf(shape);
		if(index ==-1){
			return;
			
		}//end if
		shapesArray.remove(index);
		//index--;
		System.out.println("shape removed from shapes array");//why isn't this printing???
		System.out.println("shapes in the arraylist"+ shapesArray);
		
	/*	pc.repaint();
		for(IShape currentShape : shapesArray){
			rc.DrawShapeAtPoints(currentShape);
			
		}//end for   
		*/ 
	}//end remove
	
	public IShape[] getList(){
		IShape tempArray[]  = new IShape[shapesArray.size()];
		return shapesArray.toArray(tempArray);
		
	}//end getlist
	
	
	public IShape getShapeAtPoint(Point p){
		
		for( IShape shape :shapesArray){
			if(shape.getOriginPosition().getX() <p.getX()&& shape.getOriginPosition().getY() < p.getY()
					&& shape.getEndPoint().getX() > p.getX()&& shape.getEndPoint().getY() >p.getY())
				return shape;
		
			
		}
		return null;
	}
	
// -----------------vvv---made into singleton---vvv---------------------------
								
	
/*	 private static void initializeShapesCollectionSingleton(){
		   if(instance != null){
			   throw new RuntimeException("initialize of shapes collection called twice");
		   }
		   instance = new ShapesCollection();
		   
		   
	   }*/
	 private static ShapesCollection instance ;
	 
	 public static ShapesCollection getShapesCollectionInstance(){
	    	if(instance == null){
	    		//throw new RuntimeException(" initialization of shapes collection has not been called");
	    		instance = new ShapesCollection();
	    		}
	    	return instance;
	    }
	 


}//end class

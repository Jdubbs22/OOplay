package shapes;
import java.awt.Point;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

import controller.MousePaintController;
import model.ApplicationState;
import model.IApplicationState;
import shapes.ShapeName;
public class ShapeFactory {
/*
	public static IShape creatRectangle(){
		return new Rectangle();
	}//end createRec
	
	public static IShape createElipse(){
		return new Elipse();
	}//end createEli
	
	public static IShape createTriangle(){
		return new Triangle();
	}//end createTri
	
	
	private IApplicationState appState;
	ApplicationState currentState;//??? see below
	public ApplicationState getCurrentState() {///??? just a guess
		return currentState;
	}
	*/
	
	//private ShapeFactory(IApplicationState appState){
		
//	}
	
	
	
	public static IShape createShape(Point startPoint, Point endPoint){
		IShape shape = null;
		ApplicationState current =ApplicationState.getInstance();
		
		switch (current.getActiveShapeType()){
		case ELLIPSE:
			shape = new Elipse(startPoint, endPoint,current.getActivePrimaryColor(),
					current.getActiveSecondaryColor(),
					current.getActiveShapeShadingType());
			break;
		case RECTANGLE:
			shape = new Rectangle(startPoint, endPoint,current.getActivePrimaryColor(),
					current.getActiveSecondaryColor(),current.getActiveShapeShadingType());
			break;
		case TRIANGLE:
			shape = new Triangle(startPoint, endPoint,current.getActivePrimaryColor(),
					current.getActiveSecondaryColor(),current.getActiveShapeShadingType());
			break;
		}
		return shape;
	}
}//end shapefactory

package shapes;
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
	*/
	
	private IApplicationState appState;
	ApplicationState currentState;//??? see below
	public ApplicationState getCurrentState() {///??? just a guess
		return currentState;
	}
	
	
	private ShapeFactory(IApplicationState appState){
		
	}
	
	public static IShape createShape(ShapeName shapeName){
		IShape shape = null;
		
		switch (shapeName){
		case ELLIPSE:
			shape = new Elipse(MouseEvent.MOUSE_PRESSED,MouseEvent.MOUSE_RELEASED );
			break;
		case RECTANGLE:
			shape = new Rectangle();
			break;
		case TRIANGLE:
			shape = new Triangle();
			break;
		}
		return shape;
	}
}//end shapefactory

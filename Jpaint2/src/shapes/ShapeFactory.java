package shapes;
import java.awt.Point;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

import controller.MousePaintController;
import model.ApplicationState;
import model.IApplicationState;
import shapes.ShapeName;
public class ShapeFactory {

	
	
	public static IShape createShape(Point startPoint, Point endPoint){
		IShape shape = null;
		ApplicationState current =ApplicationState.getInstance();
		
		switch (current.getActiveShapeType()){  //sets the current selected color(s) and shade type (strategy method draws the shadetype)
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

package shapes;
import java.awt.Point;

import model.ShapeColor;
import model.ShapeShadingType;
public interface IShape {
	
	Point getOriginPosition();
	
	void setOriginPostion(Point p);
	
	public ShapeName getType();
	public ShapeColor getOutlineColor();
	public ShapeColor getFillColor();
	public ShapeShadingType getShadingType();
	
	Point getEndPoint();
	
	void setEndPoint(Point p);
	
	
	
}//end interface

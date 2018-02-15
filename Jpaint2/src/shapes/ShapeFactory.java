package shapes;
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
	
	private ShapeFactory(){
		
	}
	
	public static IShape createShape(ShapeName shapeName){
		IShape shape = null;
		switch (shapeName){
		case ELLIPSE:
			shape = new Elipse();
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

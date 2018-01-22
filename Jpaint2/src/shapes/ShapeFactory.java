package shapes;

public class ShapeFactory {

	public static IShape creatRectangle(){
		return new Rectangle();
	}//end createRec
	
	public static IShape createElipse(){
		return new Elipse();
	}//end createEli
	
	public static IShape createTriangle(){
		return new Triangle();
	}//end createTri
	
}//end shapefactory

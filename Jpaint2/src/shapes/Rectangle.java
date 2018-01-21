package shapes;

import java.awt.Point;

public class Rectangle implements IShape{

	
	int hieght;
	int width; 
	Point origin;
	
	
	public Point getOriginPosition(){
		return origin;
		
	}
	
	public void setOriginPostion(Point p){
		origin = p;
	}
	
	public void setHightWidth (int h, int w){
		hieght =h;
		width =w;
		
	}
	
	public int getHieght(){
		return hieght;
	}
	
	public int getWidth(){
		return width;
	}
	
}

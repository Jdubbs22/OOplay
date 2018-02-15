package shapes;

import java.awt.Point;

 class Rectangle implements IShape{

	
	int hieght;
	int width; 
	Point origin;
	
	
	public Point getOriginPosition(){
		return origin;
		
	}//end getter
	
	public void setOriginPostion(Point p){
		origin = p;
	}//end set
	
	public void setHightWidth (int h, int w){
		hieght =h;
		width =w;
		
	}//end set
	
	public int getHieght(){
		return hieght;
	}//end get
	
	public int getWidth(){
		return width;
	}//end get
	
}//end rectangle

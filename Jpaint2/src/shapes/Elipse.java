package shapes;

import java.awt.Color;
import java.awt.Graphics2D;
import java.awt.Point;
import java.awt.geom.Ellipse2D;

import model.ShapeColor;
import model.ShapeShadingType;

 class Elipse implements IShape {
	 
	 Elipse(Point startPoint, Point endpoint){
		 this.startPoint=startPoint;
		 this.endPoint=endpoint;
	 }
	 
	 Elipse(Point startPoint, Point endPoint,ShapeColor primary, ShapeColor secondary, ShapeShadingType shadeType){
		 this.startPoint= startPoint;
		 this.endPoint = endPoint;
		 this.primary = primary;
		 this.secondary = secondary;
		 this.shadeType = shadeType;
	 }
	 
	 Point startPoint;
	 Point endPoint;
	 ShapeColor primary;
	 ShapeColor secondary;
	 ShapeShadingType shadeType;
	@Override
	public Point getOriginPosition() {
		
		return  startPoint;
	}//end get

	@Override
	public void setOriginPostion(Point p) {
		startPoint = p;

	}//end set

	@Override
	public ShapeName getType() {
		
		return ShapeName.ELLIPSE;
	}//end get

	@Override
	public ShapeColor getOutlineColor() {
		
		return primary;
	}//end get

	@Override
	public ShapeColor getFillColor() {
		
		return secondary;
	}//end get

	@Override
	public ShapeShadingType getShadingType() {
		
		return shadeType;
	}//end get

	@Override
	public Point getEndPoint() {
		
		return endPoint;
	}//end get

	@Override
	public void setEndPoint(Point p) {
	endPoint=p;
		
	}//end set
	
	public void draw(int startX, int startY, int endX, int endY, Graphics2D render, Color color,Color secondColor, boolean fill) {
		Ellipse2D ellipse= new Ellipse2D.Double( startX,  startY,  endX-startX,  endY-startY);
			
			render.draw(ellipse);
			
		}//end draw

	@Override
	public Color setColor() {
		Color clear = Color.WHITE;
		return clear;
	}

}//end elipse

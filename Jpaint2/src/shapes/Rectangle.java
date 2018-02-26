package shapes;

import java.awt.Color;
import java.awt.Graphics2D;
import java.awt.Point;

import model.ShapeColor;
import model.ShapeShadingType;

 class Rectangle implements IShape{
	 
		 Rectangle(Point startPoint, Point endPoint,ShapeColor primary, ShapeColor secondary, ShapeShadingType shadeType){
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
			
			return ShapeName.RECTANGLE;
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
			render.drawRect(startX, startY, endX-startX, endY-startY);
			
			}//end draw


	}//end rectangle

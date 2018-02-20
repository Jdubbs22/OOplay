package controller;
import java.awt.Color;
import java.awt.Graphics2D;
import java.awt.Point;
import java.awt.Polygon;
import java.awt.Shape;
import  java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.geom.Ellipse2D;

import view.PaintCanvas;
public class MousePaintController {
	//IJPaintController paintcontroller;
	RenderControler render;
//	PaintCanvas component;
//	Graphics2D render1;
	MouseAdapter mouse1 = new MouseAdapter(){  //move into a strategy pattern
		int orginX;
		int orginY;
		Ellipse2D shape;
		Polygon triangle;
		Color color;
		Point start;  //added for test
		Point end;
		@Override
	
		public void mousePressed(MouseEvent e){
			start = e.getPoint();
			orginX = e.getX();
			orginY = e.getY();
		/*	shape = new Ellipse2D.Double(orginX,orginY,0,0);
			//render.draw(shape);
			System.out.println("Test of mouse");
			triangle = new Polygon();  //???  */
		
			
		}//end mousepressed  
	/*	@Override
		public void mouseDragged(MouseEvent e){
			int deltaX;
			int deltaY;
			int endX= e.getX();
			int endY = e.getY();
			deltaX = endX - orginX;
			deltaY = endY - orginY;
			
			
			shape.setFrame(orginX, orginY, deltaX, deltaY);
			
		//	render.draw(shape);
			
			System.out.println("test of mouseMoved");
			
		}//end mousemoved  */
		
		@Override
		public void mouseReleased(MouseEvent e){
			end = e.getPoint();
			int endX= e.getX();
			int endY = e.getY();
		//render.draw(shape); 
		//render1.setColor(color.blue);
		//render.fill(shape);
		//	render.draw(triangle);
			render.DrawShapeAtPoints(orginX, orginY, endX, endY);
			
		}//end mouseReleased
		
	};//end anon class
	
	
	
	public MouseAdapter getListener(){
		return mouse1;
		
	}
	
	public MousePaintController (RenderControler render){
	this.render=render;
		
	}
	
}//end controller

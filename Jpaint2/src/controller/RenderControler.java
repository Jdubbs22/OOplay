package controller;

import java.awt.Graphics2D;

import model.ApplicationState;
import model.ShapeType;
import strategy.EllipseStrategy;
import strategy.IStratMousePaintController;
import strategy.RectangleStrategy;
import strategy.TriangleStrategy;
import view.PaintCanvas;

public class RenderControler {  //setting up a hub for rendering...allowing for strategy pattern to choose which to impliment
	
	private PaintCanvas component;
	private Graphics2D render;
	private IStratMousePaintController drawStrat;
	private ApplicationState appState;
	public RenderControler(PaintCanvas component, ApplicationState appState){  
		this.appState = appState;
		this.component=component;
		//drawStrat= new EllipseStrategy();
		this.render = component.getGraphics2D();
	}//end constructor
	
	public void chooseShape(){
		if(appState.getActiveShapeType() == ShapeType.ELLIPSE) drawStrat = new EllipseStrategy();
		else if(appState.getActiveShapeType()==ShapeType.TRIANGLE) drawStrat = new TriangleStrategy();
		else if (appState.getActiveShapeType()== ShapeType.RECTANGLE) drawStrat = new RectangleStrategy();
	}//end chooseshape
	
	public void chooseFill(){
		
	}//end chooseFill
	
	public void chooseColor(){
		
	}//end chooseColor
	
	
	public void DrawShapeAtPoints(int startX,int startY, int endX, int endY){
		chooseShape();
		drawStrat.draw(startX, startY, endX, endY, render, null,null, false);
		
	}//end drawshapeatpoints

	
	
}//end rendercontroler

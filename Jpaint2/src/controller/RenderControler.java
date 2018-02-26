package controller;

import java.awt.Color;
import java.awt.Graphics2D;

import model.ApplicationState;
import model.ShapeColor;
import model.ShapeShadingType;
import model.ShapeType;
import shapes.IShape;
import shapes.ShapeFactory;
import strategy.*;

import view.PaintCanvas;
import view.interfaces.IUiModule;

public class RenderControler {  //setting up a hub for rendering...allowing for strategy pattern to choose which to impliment
	
	private PaintCanvas component;
	private Graphics2D render;
	private IStratShape drawStrat;
	
	private ApplicationState appState;
	public RenderControler(PaintCanvas component){  //send to comand stack instead appstate only
		this.appState = ApplicationState.getInstance();
		this.component=component;
		//drawStrat= new EllipseStrategy();
		this.render = component.getGraphics2D();
	}//end constructor
	
	public static RenderControler getInstance(){
		if(instance == null){
    		throw new RuntimeException(" initialization has not been called");
    		}
    	return instance;
	}
	private static RenderControler instance;
	public static void initializeSingle(PaintCanvas component){
		if(instance != null){
			   throw new RuntimeException("initialized called twice");
		   }
		instance = new RenderControler(component);
	}
	
	public void chooseShape(){
		if(appState.getActiveShapeType() == ShapeType.ELLIPSE) drawStrat = new EllipseStrategy();
		else if(appState.getActiveShapeType()==ShapeType.TRIANGLE) drawStrat = new TriangleStrategy();
		else if (appState.getActiveShapeType()== ShapeType.RECTANGLE) drawStrat = new RectangleStrategy();
	}//end chooseshape
	
	public void chooseFill(){
		
	}//end chooseFill
	
	public static java.awt.Color chooseColor(ShapeColor primaryColor){
		
		switch(primaryColor){
		case BLACK:
			return java.awt.Color.BLACK;
			
		case BLUE:
		return java.awt.Color.BLUE;
		
		default: 
			return java.awt.Color.GREEN;
		}
		
		
		
	}//end chooseColor
	
	
	public void chooseShadingType(IShape shape){
		
		ShapeShadingType shadeType = shape.getShadingType();
		switch(shadeType){
		case FILLED_IN:
			
		}
		
	}
	
	public void DrawShapeAtPoints(IShape shape){
		
		
		//colorStrat.setColor(render);
		chooseShape();
		drawStrat.draw(shape, render);
		
	//	filledIn.setShadingType(render);
		
	}//end drawshapeatpoints

	
	
}//end rendercontroler

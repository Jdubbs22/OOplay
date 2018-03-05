package controller;

import java.awt.Color;
import java.awt.Graphics2D;

import model.ApplicationState;
import model.ShapeColor;
import model.ShapeShadingType;
import model.ShapeType;
import shapes.IShape;
import shapes.ShapeFactory;
import shapes.ShapesCollection;
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
	public static void initializeRenderSingle(PaintCanvas component){
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
		
		case CYAN:
			return java.awt.Color.CYAN;
			
		case DARK_GRAY:
			return java.awt.Color.DARK_GRAY;
			
		case GRAY:
			return java.awt.Color.GRAY;
			
		case LIGHT_GRAY:
			return java.awt.Color.LIGHT_GRAY;
			
		case MAGENTA:
			return java.awt.Color.MAGENTA;
			
		case ORANGE:
			return java.awt.Color.ORANGE;
			
		case PINK:
			return java.awt.Color.PINK;
			
		case RED:
			return java.awt.Color.RED;
			
		case WHITE:
			return java.awt.Color.WHITE;
			
		case YELLOW:
			return java.awt.Color.YELLOW;
			
		default: 
			return java.awt.Color.GREEN;
		}
		
		
		
	}//end chooseColor
	
	public void DrawShapeAtPoints(IShape shape){
		
		
		//colorStrat.setColor(render);
		chooseShape();
		drawStrat.draw(shape, render);
	//	ShapesCollection CollectionInstance = ShapesCollection.getShapesCollectionInstance();
	//	CollectionInstance.insertShape(shape);
		
	//	filledIn.setShadingType(render);
		
	}//end drawshapeatpoints
	
	public void refreshScreen(){
		
		
	render.clearRect(0, 0, component.getWidth(), component.getHeight());
		//couldn't get repaint to work so did above ^^^
		
//		component.validate();
		//component.repaint();
	/*	component.paint(render);
		
		render = component.getGraphics2D();

		component.update(render);
		
		//component.wipeScreen();
		 * */
		 
		
		
		for(IShape shape: ShapesCollection.getShapesCollectionInstance().getList()){
			
		DrawShapeAtPoints(shape);
			
			System.out.println("test of drawshape at points");
		}//end for
		
		//component.update(render);
	}//end clearscreen
	
	

	
	
}//end rendercontroler

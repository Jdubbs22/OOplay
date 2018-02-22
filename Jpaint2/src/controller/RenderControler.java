package controller;

import java.awt.Graphics2D;

import model.ApplicationState;
import model.ShapeColor;
import model.ShapeShadingType;
import model.ShapeType;
import shapes.ShapeFactory;
import strategy.*;

import view.PaintCanvas;

public class RenderControler {  //setting up a hub for rendering...allowing for strategy pattern to choose which to impliment
	
	private PaintCanvas component;
	private Graphics2D render;
	private IStratShape drawStrat;
	private IStratPrimaryColor colorStrat;
	private ApplicationState appState;
	public RenderControler(PaintCanvas component, ApplicationState appState){  //send to comand stack instead appstate only
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
		if(appState.getActivePrimaryColor()== ShapeColor.BLUE) colorStrat = new BlueStrategy();
		else if(appState.getActivePrimaryColor()== ShapeColor.BLACK) colorStrat = new BlackStrategy();
		else if(appState.getActivePrimaryColor()== ShapeColor.CYAN) colorStrat = new CyanStrategy();
		else if(appState.getActivePrimaryColor()== ShapeColor.DARK_GRAY) colorStrat = new DarkGreyStrategy();
		else if(appState.getActivePrimaryColor()== ShapeColor.GRAY) colorStrat = new GreyStrategy();
		else if(appState.getActivePrimaryColor()== ShapeColor.GREEN) colorStrat = new GreenStrategy();
		
		
	}//end chooseColor
	
	
	public void chooseShadingType(){
		if(appState.getActiveShapeShadingType() == ShapeShadingType.FILLED_IN);
	}
	
	public void DrawShapeAtPoints(int startX,int startY, int endX, int endY){
		chooseColor();
		colorStrat.setColor(render);
		chooseShape();
		drawStrat.draw(startX, startY, endX, endY, render, null,null, false);
		
		
	
	}//end drawshapeatpoints

	
	
}//end rendercontroler

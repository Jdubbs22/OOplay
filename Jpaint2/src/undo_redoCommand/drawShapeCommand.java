package undo_redoCommand;

import java.awt.Component;
import java.awt.Graphics2D;
import java.awt.Point;

import controller.RenderControler;
import model.ApplicationState;
import model.ShapeColor;
import shapes.IShape;
import shapes.ShapeFactory;
import shapes.ShapesCollection;
import strategy.EllipseStrategy;
import strategy.IStratShape;
import view.PaintCanvas;

public class drawShapeCommand implements IUndoRedo, IRunCommand{
	private Point startPoint;
	private Point endPoint;
	private IShape shape;
	private PaintCanvas pc;
	//private Component c;//do I need this?
	ShapesCollection shapesArray = new ShapesCollection();
	public drawShapeCommand(Point startPoint, Point endPoint) {
		this.startPoint=startPoint;
		this.endPoint=endPoint;
	}
	
	@Override
	public void run() {
	
		shape = ShapeFactory.createShape(startPoint, endPoint);
		
		//DrawHistory.add(this);   //he put this in in the demo to make sure the IUndoRedo is added
									//adds to the command history
		
		RenderControler currentInstance = RenderControler.getInstance();
		
		currentInstance.DrawShapeAtPoints(shape);
		
		shapesArray.insertShape(shape);
		// add to shapescollection
		//shapescollection.add
		
	}

	@Override
	public void undo() {
		//code to undo
		
		shape = ShapeFactory.createShape(startPoint, endPoint);
		//shape.setColor();// can I just set it to all white???
		
		
		
		//remove from shapes collection
	//	shapesArray.removeShape(shape);
	//	pc.wipeScreen();
		System.out.println("undo pressed");
	
	}

	@Override
	public void redo() {
		RenderControler currentInstance = RenderControler.getInstance();
		currentInstance.DrawShapeAtPoints(shape);
		shapesArray.insertShape(shape);
		//add back to shapes collection
		System.out.println("Redo pressed");
	}

}

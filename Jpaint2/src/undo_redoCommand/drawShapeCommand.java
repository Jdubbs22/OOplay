package undo_redoCommand;

import java.awt.Point;

import controller.RenderControler;
import model.ApplicationState;
import shapes.IShape;
import shapes.ShapeFactory;
import strategy.EllipseStrategy;
import strategy.IStratShape;

public class drawShapeCommand implements IUndoRedo, IRunCommand{
	private Point startPoint;
	private Point endPoint;
	private IShape shape;
	
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
		// add to shapescollection
		//shapescollection.add
		
	}

	@Override
	public void undo() {
		//code to undo
		//remove from shapes collection
	}

	@Override
	public void redo() {
		RenderControler currentInstance = RenderControler.getInstance();
		currentInstance.DrawShapeAtPoints(shape);
		//add back to shapes collection
		
	}

}

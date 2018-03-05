package undo_redoCommand;

import java.awt.Point;

import controller.RenderControler;
import shapes.IShape;
import shapes.ShapesCollection;

public class MoveCommand implements IRunCommand, IUndoRedo {
	Point start;
	Point end;
	IShape shape;
	Point newStartPoint;
	Point newEndPoint;
	Point oldStartPoint;
	Point oldEndPoint;
	
	
	public MoveCommand(Point start, Point end) {
	this.start=start;
	this.end=end;
	}

	@Override
	public void undo() {
	shape.setOriginPostion(oldStartPoint);
	shape.setEndPoint(oldEndPoint);	
	RenderControler.getInstance().refreshScreen();
	}

	@Override
	public void redo() {
		shape.setOriginPostion(newStartPoint);
		shape.setEndPoint(newEndPoint);
		RenderControler.getInstance().refreshScreen();
	}

	@Override
	public void run() {
		shape= ShapesCollection.getShapesCollectionInstance().getShapeAtPoint(start);
		if(shape == null){
			return;
		}
		DrawHistory.add(this);
		oldStartPoint = shape.getOriginPosition();
		oldEndPoint = shape.getEndPoint();
		int deltaX = end.x-start.x;
		int deltaY = end.y-start.y;
		 newStartPoint = new Point(deltaX + (int)shape.getOriginPosition().getX(), deltaY + (int) shape.getOriginPosition().getY()) ;
		 newEndPoint = new Point(deltaX + (int)shape.getEndPoint().getX(), deltaY + (int)shape.getEndPoint().getY()) ;
		
		shape.setOriginPostion(newStartPoint);
		shape.setEndPoint(newEndPoint);
		RenderControler.getInstance().refreshScreen();
		
		
		
	}

}

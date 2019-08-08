package controller;

import java.awt.Color;
import java.awt.Component;

import undo_redoCommand.DrawHistory;
import undo_redoCommand.MoveCommand;
import undo_redoCommand.drawShapeCommand;

import java.awt.Graphics2D;
import java.awt.Point;
import java.awt.Polygon;
import java.awt.Shape;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.geom.Ellipse2D;

import model.ApplicationState;
import shapes.ShapesCollection;
import view.PaintCanvas;

public class MousePaintController {
	// IJPaintController paintcontroller;
	RenderControler render;
	// PaintCanvas component;
	// Graphics2D render1;
	MouseAdapter mouse1 = new MouseAdapter() { // move into a strategy pattern
		int orginX;
		int orginY;
		Ellipse2D shape;
		Polygon triangle;
		Color color;
		Point start; // added for test
		Point end;

		@Override

		public void mousePressed(MouseEvent e) {
			switch (ApplicationState.getInstance().getActiveStartAndEndPointMode()) {
			case DRAW:
			case MOVE:// similar to or
				start = e.getPoint();
				orginX = e.getX();
				orginY = e.getY();
				break;

			case SELECT:

			}// end switch
		}// end method

		@Override
		public void mouseReleased(MouseEvent e) {
			switch (ApplicationState.getInstance().getActiveStartAndEndPointMode()) {
			case DRAW:
				end = e.getPoint();
				int endX = e.getX();
				int endY = e.getY();
				drawShapeCommand getCommand = new drawShapeCommand(start, end);
				DrawHistory.add(getCommand);
				getCommand.run();
				break;

			case MOVE:
				end = e.getPoint();
				MoveCommand command = new MoveCommand(start, end);
				// DrawHistory.add(command);
				command.run();
				break;

			case SELECT:

			}// end switch

			// render.draw(shape);
			// render1.setColor(color.blue);
			// render.fill(shape);
			// render.draw(triangle);
			// render.DrawShapeAtPoints(orginX, orginY, endX, endY);

		}// end mouseReleased

	};// end anon class

	public MouseAdapter getListener() {
		return mouse1;

	}// end get

	public MousePaintController(RenderControler render) {
		this.render = render;

	}// end constructor

}// end controller

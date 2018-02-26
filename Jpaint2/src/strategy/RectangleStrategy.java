package strategy;

import java.awt.Color;
import java.awt.Graphics2D;
import java.awt.Shape;

import controller.RenderControler;
import shapes.IShape;

public class RectangleStrategy implements IStratShape {

	@Override
	public void draw(IShape shape, Graphics2D renderer) {
		int startX = shape.getOriginPosition().x;
		int startY = shape.getOriginPosition().y;
		int endX= shape.getEndPoint().x;
		int endY= shape.getEndPoint().y;
		//Shape Rectangle = new Shape;
		
		renderer.drawRect(startX, startY, endX-startX, endY-startY);
	/*	
		switch (shape.getShadingType()){
		case FILLED_IN:
			renderer.setColor(RenderControler.chooseColor(shape.getFillColor()));
			
			renderer.fill(Rectangle);
			break;
		case OUTLINE:
			renderer.setColor(RenderControler.chooseColor(shape.getOutlineColor()));
			renderer.draw(Rectangle);
			break;
		case OUTLINE_AND_FILLED_IN:
			renderer.setColor(RenderControler.chooseColor(shape.getFillColor()));
			renderer.fill(Rectangle);
			renderer.setColor(RenderControler.chooseColor(shape.getOutlineColor()));
			renderer.draw(Rectangle);

		}*/
	}	
}

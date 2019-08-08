package strategy;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Shape;
import java.awt.geom.Rectangle2D;
import java.awt.*;

import controller.RenderControler;
import model.ShapeShadingType;
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
		
		if(shape.getShadingType()==ShapeShadingType.FILLED_IN){
			renderer.setColor(RenderControler.chooseColor(shape.getFillColor()));
			renderer.fillRect(startX, startY, endX - startX, endY -startY);
		}//end if
		else if(shape.getShadingType()==ShapeShadingType.OUTLINE){
			renderer.setColor(RenderControler.chooseColor(shape.getFillColor()));
			renderer.drawRect(startX, startY, endX - startX, endY -startY);
		}//end else
		else if(shape.getShadingType()==ShapeShadingType.OUTLINE_AND_FILLED_IN){
			renderer.setColor(RenderControler.chooseColor(shape.getFillColor()));
			renderer.fillRect(startX, startY, endX - startX, endY -startY);
			renderer.setColor(RenderControler.chooseColor(shape.getOutlineColor()));
			renderer.drawRect(startX, startY, endX - startX, endY -startY);
		}//end else
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
	}	//end method
}//end class

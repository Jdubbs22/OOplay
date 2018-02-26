package strategy;



import java.awt.Color;
import java.awt.Graphics2D;
import java.awt.geom.Ellipse2D;

import controller.RenderControler;
import shapes.IShape;

public class TriangleStrategy  implements IStratShape{



@Override

public void draw(IShape shape, Graphics2D renderer) {
	int startX = shape.getOriginPosition().x;
	int startY = shape.getOriginPosition().y;
	int endX= shape.getEndPoint().x;
	int endY= shape.getEndPoint().y;
	int[] xPoints = {startX,endX,startX};
	int[] yPoints= {startY,endY,endY};
	
	renderer.drawPolygon(xPoints, yPoints, 3);
	/*
	switch (shape.getShadingType()){
	case FILLED_IN:
		renderer.setColor(RenderControler.chooseColor(shape.getFillColor()));
		renderer.fill();
		break;
	case OUTLINE:
		renderer.setColor(RenderControler.chooseColor(shape.getOutlineColor()));
		renderer.draw(ellipse);
		break;
	case OUTLINE_AND_FILLED_IN:
		renderer.setColor(RenderControler.chooseColor(shape.getFillColor()));
		renderer.fill(ellipse);
		renderer.setColor(RenderControler.chooseColor(shape.getOutlineColor()));
		renderer.draw(ellipse);
		
	}*/
	
}


}//end EllipseStrategy

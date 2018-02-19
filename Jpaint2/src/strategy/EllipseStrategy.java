package strategy;

import java.awt.Color;
import java.awt.Graphics2D;
import java.awt.geom.Ellipse2D;

public class EllipseStrategy  implements IStratMousePaintController{



@Override
public void draw(int startX, int startY, int endX, int endY, Graphics2D render, Color color,Color secondColor, boolean fill) {
Ellipse2D ellipse= new Ellipse2D.Double( startX,  startY,  endX-startX,  endY-startY);
	
	render.draw(ellipse);
	
}


}//end EllipseStrategy
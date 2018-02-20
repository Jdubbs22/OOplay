package strategy;



import java.awt.Color;
import java.awt.Graphics2D;
import java.awt.geom.Ellipse2D;

public class TriangleStrategy  implements IStratShape{



@Override

public void draw(int startX, int startY, int endX, int endY, Graphics2D render, Color color,Color secondColor, boolean fill) {
	int[] xPoints = {startX,endX,startX};
	int[] yPoints= {startY,endY,endY};
	
	render.drawPolygon(xPoints, yPoints, 3);
	
}


}//end EllipseStrategy

package strategy;

import java.awt.Color;
import java.awt.Graphics2D;

public class RectangleStrategy implements IStratMousePaintController {

	@Override
	public void draw(int startX, int startY, int endX, int endY, Graphics2D render,Color color,Color secondColor, boolean fill) {
		render.drawRect(startX, startY, endX-startX, endY-startY);

	}

}

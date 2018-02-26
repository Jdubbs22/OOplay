package strategy;

import java.awt.Color;
import java.awt.Graphics2D;
import java.awt.Shape;
import java.awt.geom.Ellipse2D;

public class FilledInStrat implements IStratFilledIn {
IStratPrimaryColor color;
IStratShape shape;
Ellipse2D shape2;
	@Override
	public void setShadingType(Graphics2D render) {
		render.fill(shape2);
		//render.setColor((Color) color);
		
		
	}

}

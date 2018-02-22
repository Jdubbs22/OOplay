package strategy;

import java.awt.Color;
import java.awt.Graphics2D;
import java.awt.Shape;

public class FilledInStrat implements IStratFilledIn {
IStratPrimaryColor color;
IStratShape shape;
	@Override
	public void setShadingType(Graphics2D render) {
		render.setColor((Color) color);
		render.fill((Shape) shape);

	}

}

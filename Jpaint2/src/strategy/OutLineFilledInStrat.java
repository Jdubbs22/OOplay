package strategy;

import java.awt.Graphics2D;
import java.awt.Shape;

public class OutLineFilledInStrat implements IStratFilledIn {
IStratShape shape;
	@Override
	public void setShadingType(Graphics2D render) {
		render.fill((Shape) shape);
		render.draw((Shape) shape);
		

	}

}

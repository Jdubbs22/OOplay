package strategy;

import java.awt.Color;
import java.awt.Graphics2D;

public class BlackStrategy implements IStratPrimaryColor {
	Color black = Color.BLACK;
	@Override
	public void setColor(Graphics2D render) {
		render.setColor(black);
		

	}

}

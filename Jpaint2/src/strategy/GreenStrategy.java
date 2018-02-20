package strategy;

import java.awt.Color;
import java.awt.Graphics2D;

public class GreenStrategy implements IStratPrimaryColor {
	Color green = Color.GREEN;
	@Override
	public void setColor(Graphics2D render) {
		render.setColor(green);
		
	}

}

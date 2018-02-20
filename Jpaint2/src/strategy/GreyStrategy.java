package strategy;

import java.awt.Color;
import java.awt.Graphics2D;

public class GreyStrategy implements IStratPrimaryColor {
	Color grey = Color.GRAY;
	@Override
	public void setColor(Graphics2D render) {
		render.setColor(grey);
		
	}

}

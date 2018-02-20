package strategy;

import java.awt.Color;
import java.awt.Graphics2D;

public class DarkGreyStrategy implements IStratPrimaryColor {
	Color darkGrey = Color.DARK_GRAY;
	@Override
	public void setColor(Graphics2D render) {
		render.setColor(darkGrey);
		
	}

}

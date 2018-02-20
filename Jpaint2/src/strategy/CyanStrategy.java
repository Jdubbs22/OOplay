package strategy;

import java.awt.Color;
import java.awt.Graphics2D;

public class CyanStrategy implements IStratPrimaryColor {
	Color cyan = Color.CYAN;
	@Override
	public void setColor(Graphics2D render) {
		render.setColor(cyan);
	}

}

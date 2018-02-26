package strategy;

import java.awt.Color;
import java.awt.Graphics2D;

public class OutLineStrat implements IStratFilledIn {
	IStratPrimaryColor color;
	
	@Override
	public void setShadingType(Graphics2D render) {
		render.setColor((Color) color);
		
	}

}

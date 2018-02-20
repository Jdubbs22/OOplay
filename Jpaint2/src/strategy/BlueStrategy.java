package strategy;

import java.awt.Color;
import java.awt.Graphics2D;

public class BlueStrategy implements IStratPrimaryColor{
	Color blue = Color.blue;
	@Override
	public void setColor(Graphics2D render) {
		render.setColor(blue);
		
	}//end setcolor

	

}//end blueStrategy

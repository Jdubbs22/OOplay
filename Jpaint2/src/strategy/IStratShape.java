package strategy;

import java.awt.Color;
import java.awt.Graphics2D;

public interface IStratShape{
	
	void draw(int startX, int startY, int endX, int endY, Graphics2D render,Color color,Color secondColor, boolean fill);
	
}
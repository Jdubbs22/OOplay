package strategy;

import java.awt.Color;
import java.awt.Graphics2D;

import shapes.IShape;

public interface IStratShape{
	
	void draw(IShape shape, Graphics2D renderer);
	
}//end interface
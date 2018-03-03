package view;

import view.interfaces.IPaintCanvas;

import javax.swing.JComponent;
import java.awt.*;
import java.awt.geom.Ellipse2D;

public class PaintCanvas extends JComponent implements IPaintCanvas {

    public Graphics2D getGraphics2D() {
    	
    	
    	
        return (Graphics2D)getGraphics();
    }
    
    public void testDraw (){
    	Graphics2D graphics = (Graphics2D)getGraphics();
    
    	Ellipse2D.Double circle =
    			  new Ellipse2D.Double( 0,0, 200,200);
    			 graphics.fill(circle);		 
    }//end test draw
    
    public void wipeScreen(){
    	repaint();
    }
}

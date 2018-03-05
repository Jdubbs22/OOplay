package view;

import view.interfaces.IPaintCanvas;

import javax.swing.JComponent;

import controller.RenderControler;
import shapes.IShape;
import shapes.ShapesCollection;

import java.awt.*;
import java.awt.geom.Ellipse2D;

public class PaintCanvas extends JComponent implements IPaintCanvas {

    public Graphics2D getGraphics2D() {
    	
    	
    	
        return (Graphics2D)getGraphics();
        
    }
 
  /*  @Override
    
    public void paintComponent(Graphics g) {
    	super.paint(g);
    	for(IShape shape: ShapesCollection.getShapesCollectionInstance().getList()){
			
			RenderControler.getInstance().DrawShapeAtPoints(shape);
			
			System.out.println("test of drawshape at points");
		}//end for
    	this.validate();
    }//end paint
    */
 
    
    public void testDraw (){
    	Graphics2D graphics = (Graphics2D)getGraphics();
    
    	Ellipse2D.Double circle =
    			  new Ellipse2D.Double( 0,0, 200,200);
    			 graphics.fill(circle);		 
    }//end test draw
    
  
}

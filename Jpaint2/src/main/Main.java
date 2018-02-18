package main;
import javax.swing.JButton;

import controller.IJPaintController;
import controller.JPaintController;
import controller.MousePaintController;
import model.DialogProvider;
import model.IDialogProvider;
import model.ShapeColor;
import model.ApplicationState;
import view.EventName;
import view.Gui;
import view.GuiWindow;
import view.PaintCanvas;
import view.interfaces.IGuiWindow;
import view.interfaces.IUiModule;

public class Main {
	public static void main(String[] args){		
		PaintCanvas paintTest =new PaintCanvas();
		
		//gui window set up the JButton getButton(EventName eventName
        IGuiWindow guiWindow = new GuiWindow(paintTest);  //paintcanvas sets up the graphics2d
        
        IUiModule uiModule = new Gui(guiWindow);  //gui takes the getDialogResponse and addevent
        
        ApplicationState appState = new ApplicationState(uiModule);//gets and sets the responses ala colors
        
        IJPaintController controller = new JPaintController(uiModule, appState);  //sets up events ala  activePrimaryColor = ShapeColor.BLUE;Jpaint2/src/main/Main.java
        controller.setup();
        
      //  paintTest.testDraw();  
        
       MousePaintController testMouse = new MousePaintController(paintTest); 
       paintTest.addMouseListener(testMouse.getListener()); 
       paintTest.addMouseMotionListener(testMouse.getListener());
       
      
    }
	//test of git
}

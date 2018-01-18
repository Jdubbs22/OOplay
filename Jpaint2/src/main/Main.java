package main;
import javax.swing.JButton;

import controller.IJPaintController;
import controller.JPaintController;
import model.DialogProvider;
import model.IDialogProvider;
import model.ShapeColor;
import model.ApplicationState;
import view.EventName;
import view.gui.Gui;
import view.gui.GuiWindow;
import view.gui.PaintCanvas;
import view.interfaces.IGuiWindow;
import view.interfaces.IUiModule;

public class Main {
	public static void main(String[] args){						//gui window set up the JButton getButton(EventName eventName
        IGuiWindow guiWindow = new GuiWindow(new PaintCanvas());  //paintcanvas sets up the graphics2d
        
        IUiModule uiModule = new Gui(guiWindow);  //gui takes the getDialogResponse and addevent
        
        ApplicationState appState = new ApplicationState(uiModule);//gets and sets the responses ala colors
        
        IJPaintController controller = new JPaintController(uiModule, appState);  //sets up events ala  activePrimaryColor = ShapeColor.BLUE;
        controller.setup();
    }
	//test of git
}

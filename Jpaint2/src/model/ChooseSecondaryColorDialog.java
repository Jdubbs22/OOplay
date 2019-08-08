package model;

import model.ShapeColor;
import model.IApplicationState;
import view.interfaces.IDialogChoice;

public class ChooseSecondaryColorDialog implements IDialogChoice<ShapeColor> {

    private final IApplicationState applicationState;

    public ChooseSecondaryColorDialog(IApplicationState applicationState) {
        this.applicationState = applicationState;
    }//end constructor

    @Override
    public String getDialogTitle() {
        return "Secondary Color";
    }//end get

    @Override
    public String getDialogText() {
        return "Select a secondary color from the menu below:";
    }//end get

    @Override
    public ShapeColor[] getDialogOptions() {
        return ShapeColor.values();
    }//end get

    @Override
    public ShapeColor getCurrentSelection() {
        return applicationState.getActiveSecondaryColor();
    }//end get
}//end class

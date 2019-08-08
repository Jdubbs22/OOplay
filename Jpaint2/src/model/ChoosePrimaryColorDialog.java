package model;

import model.ShapeColor;
import model.IApplicationState;
import view.interfaces.IDialogChoice;

public class ChoosePrimaryColorDialog implements IDialogChoice<ShapeColor> {

    private final IApplicationState applicationState;

    public ChoosePrimaryColorDialog(IApplicationState applicationState) {
        this.applicationState = applicationState;
    }//end method

    @Override
    public String getDialogTitle() {
        return "Primary Color";
    }//end get

    @Override
    public String getDialogText() {
        return "Select a primary color from the menu below:";
    }//end get

    @Override
    public ShapeColor[] getDialogOptions() {
        return ShapeColor.values();
    }//end get

    @Override
    public ShapeColor getCurrentSelection() {
        return applicationState.getActivePrimaryColor();
    }//end get
} //end ChoosePrimaryColorDialog


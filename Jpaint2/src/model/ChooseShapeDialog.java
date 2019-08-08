package model;

import model.ShapeType;
import model.IApplicationState;
import view.interfaces.IDialogChoice;

public class ChooseShapeDialog implements IDialogChoice<ShapeType> {
    private final IApplicationState applicationState;

    public ChooseShapeDialog(IApplicationState applicationState) {

        this.applicationState = applicationState;
    }//end construct

    @Override
    public String getDialogTitle() {
        return "Shape";
    }//end get

    @Override
    public String getDialogText() {
        return "Select a shape from the menu below:";
    }//end get

    @Override
    public ShapeType[] getDialogOptions() {
        return ShapeType.values();
    }//end get

    @Override
    public ShapeType getCurrentSelection() {
        return applicationState.getActiveShapeType();
    }//end get
}//end class


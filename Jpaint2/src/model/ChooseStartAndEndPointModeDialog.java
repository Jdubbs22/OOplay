package  model;

import model.StartAndEndPointMode;
import model.IApplicationState;
import view.interfaces.IDialogChoice;

public class ChooseStartAndEndPointModeDialog implements IDialogChoice<StartAndEndPointMode> {
    private final IApplicationState applicationState;

    public ChooseStartAndEndPointModeDialog(IApplicationState applicationState) {

        this.applicationState = applicationState;
    }//end construct

    @Override
    public String getDialogTitle() {
        return "Start and End Point Mode";
    }//end get

    @Override
    public String getDialogText() {
        return "Select a shading type from the menu below:";
    }//end get

    @Override
    public StartAndEndPointMode[] getDialogOptions() {
        return StartAndEndPointMode.values();
    }//end get

    @Override
    public StartAndEndPointMode getCurrentSelection() {
        return applicationState.getActiveStartAndEndPointMode();
    }//end get
}//end class
package controller;

import model.IApplicationState;
import undo_redoCommand.DrawHistory;
import view.EventName;
import view.interfaces.IUiModule;

public class JPaintController implements IJPaintController {
    private final IUiModule uiModule;
    private final IApplicationState applicationState;

    public JPaintController(IUiModule uiModule, IApplicationState applicationState) {
        this.uiModule = uiModule;
        this.applicationState = applicationState;
        
    }//end construct

    @Override
    public void setup() {
        setupEvents();
    }//end method

    private void setupEvents() {
        uiModule.addEvent(EventName.CHOOSE_SHAPE, () -> applicationState.setActiveShape());
        uiModule.addEvent(EventName.CHOOSE_PRIMARY_COLOR, () -> applicationState.setActivePrimaryColor());
        uiModule.addEvent(EventName.CHOOSE_SECONDARY_COLOR, () -> applicationState.setActiveSecondaryColor());
        uiModule.addEvent(EventName.CHOOSE_SHADING_TYPE, () -> applicationState.setActiveShadingType());
        uiModule.addEvent(EventName.CHOOSE_START_POINT_ENDPOINT_MODE, () -> applicationState.setActiveStartAndEndPointMode());
        uiModule.addEvent(EventName.UNDO,() -> DrawHistory.undo());
        uiModule.addEvent(EventName.REDO, ()-> DrawHistory.redo());
      //  uiModule.addEvent(EventName.COPY, () ->  someClass);
      // uiModule.addEvent(EventName.PASTE, () ->   someclass); 
        
        
    }//end setupevents
    
    
}//end class


package model;

import model.ShapeColor;
import model.ShapeShadingType;
import model.ShapeType;
import model.StartAndEndPointMode;
import model.IApplicationState;
import model.IDialogProvider;
import view.interfaces.IDialogChoice;

public class DialogProvider implements IDialogProvider {
    private final IDialogChoice<ShapeType> chooseShapeDialog;
    private final IDialogChoice<ShapeColor> choosePrimaryColorDialog;
    private final IDialogChoice<ShapeColor> chooseSecondaryColorDialog;
    private final IDialogChoice<ShapeShadingType> chooseShadingTypeDialog;
    private final IDialogChoice<StartAndEndPointMode> chooseStartAndEndPointModeDialog;
    private final IApplicationState applicationState;

    public DialogProvider(IApplicationState applicationState) {
        this.applicationState = applicationState;
        chooseShapeDialog = new ChooseShapeDialog(this.applicationState);
        choosePrimaryColorDialog = new ChoosePrimaryColorDialog(this.applicationState);
        chooseSecondaryColorDialog = new ChooseSecondaryColorDialog(this.applicationState);
        chooseShadingTypeDialog = new ChooseShadingTypeDialog(this.applicationState);
        chooseStartAndEndPointModeDialog = new ChooseStartAndEndPointModeDialog(this.applicationState);
    }//end construct

    @Override
    public IDialogChoice<ShapeType> getChooseShapeDialog() {
        return chooseShapeDialog;
    }//end get

    @Override
    public IDialogChoice<ShapeColor> getChoosePrimaryColorDialog() {
        return choosePrimaryColorDialog;
    }//end get

    @Override
    public IDialogChoice<ShapeColor> getChooseSecondaryColorDialog() {
        return chooseSecondaryColorDialog;
    }//end get

    @Override
    public IDialogChoice<ShapeShadingType> getChooseShadingTypeDialog() {
        return chooseShadingTypeDialog;
    }//end get

    @Override
    public IDialogChoice<StartAndEndPointMode> getChooseStartAndEndPointModeDialog() {
        return chooseStartAndEndPointModeDialog;
    }//end get
}//end class

package model; //model.persistence

import model.ShapeColor;
import model.ShapeShadingType;
import model.ShapeType;
import model.StartAndEndPointMode;
import model.DialogProvider;
import model.IApplicationState;
import model.IDialogProvider;
import view.interfaces.IUiModule;

public class ApplicationState implements IApplicationState {
	private final IUiModule uiModule;
	private final IDialogProvider dialogProvider;

	private ShapeType activeShapeType;
	private ShapeColor activePrimaryColor;
	private ShapeColor activeSecondaryColor;
	private ShapeShadingType activeShapeShadingType;
	private StartAndEndPointMode activeStartAndEndPointMode;

	private ApplicationState(IUiModule uiModule) {
		this.uiModule = uiModule;
		this.dialogProvider = new DialogProvider(this);
		setDefaults();
	}// end construct

	public void setUiModule(IUiModule uiModule) {

	}// end method

	public static void initializeSingleton(IUiModule uiModule) {
		if (instance != null) {
			throw new RuntimeException("initialized called twice");
		}//end if
		instance = new ApplicationState(uiModule);

	}//end method

	private static ApplicationState instance;

	public static ApplicationState getInstance() {
		if (instance == null) {
			throw new RuntimeException(" initialization has not been called");
		}//end if
		return instance;
	}//end method

	@Override
	public void setActiveShape() {
		activeShapeType = uiModule.getDialogResponse(dialogProvider.getChooseShapeDialog());
	}//end set

	@Override
	public void setActivePrimaryColor() {
		activePrimaryColor = uiModule.getDialogResponse(dialogProvider.getChoosePrimaryColorDialog());
	}//end set

	@Override
	public void setActiveSecondaryColor() {
		activeSecondaryColor = uiModule.getDialogResponse(dialogProvider.getChooseSecondaryColorDialog());
	}//end set

	@Override
	public void setActiveShadingType() {
		activeShapeShadingType = uiModule.getDialogResponse(dialogProvider.getChooseShadingTypeDialog());
	}//end set

	@Override
	public void setActiveStartAndEndPointMode() {
		activeStartAndEndPointMode = uiModule.getDialogResponse(dialogProvider.getChooseStartAndEndPointModeDialog());
	}//end set

	@Override
	public ShapeType getActiveShapeType() {
		return activeShapeType;
	}//end get

	@Override
	public ShapeColor getActivePrimaryColor() {
		return activePrimaryColor;
	}//end get

	@Override
	public ShapeColor getActiveSecondaryColor() {
		return activeSecondaryColor;
	}//end get

	@Override
	public ShapeShadingType getActiveShapeShadingType() {
		return activeShapeShadingType;
	}//end get

	@Override
	public StartAndEndPointMode getActiveStartAndEndPointMode() {
		return activeStartAndEndPointMode;
	}//end get

	private void setDefaults() {
		activeShapeType = ShapeType.ELLIPSE;
		activePrimaryColor = ShapeColor.BLUE;
		activeSecondaryColor = ShapeColor.GREEN;
		activeShapeShadingType = ShapeShadingType.FILLED_IN;
		activeStartAndEndPointMode = StartAndEndPointMode.DRAW;
	}//end method
}//end class

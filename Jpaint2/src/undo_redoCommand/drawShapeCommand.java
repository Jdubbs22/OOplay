package undo_redoCommand;

import strategy.EllipseStrategy;
import strategy.IStratShape;

public class drawShapeCommand implements IUndoRedo, IRunCommand{

	@Override
	public void run() {
		//this goes to the strategy Factory (static) to create the shape with fields
		
		
		//DrawHistory.add(this);   //he put this in in the demo to make sure the IUndoRedo is added
									//adds to the command history
	}

	@Override
	public void undo() {
		//not sure how to undo a shape
		
	}

	@Override
	public void redo() {
		//probably just rerun the run commands
		
	}

}

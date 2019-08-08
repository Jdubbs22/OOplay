package undo_redoCommand;

public class UndoCommand implements IRunCommand {

	@Override
	public void run()  {
		DrawHistory.undo();
	}//end method

}//end class
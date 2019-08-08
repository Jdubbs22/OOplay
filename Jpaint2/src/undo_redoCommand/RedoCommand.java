package undo_redoCommand;

public class RedoCommand implements IRunCommand {

	@Override
	public void run()  {
		DrawHistory.redo();
	}//end method

}//end class

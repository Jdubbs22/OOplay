package undo_redoCommand;
import java.util.Stack;

class DrawHistory {
	private final Stack<IUndoRedo> undoStack = new Stack<IUndoRedo>();
	private  final Stack<IUndoRedo> redoStack = new Stack<IUndoRedo>();
//constructor that takes in appstate in a member variable
	
	public  void add(IUndoRedo cmd) {
		undoStack.push(cmd);
		redoStack.clear();
	}
	
	public  boolean undo() {
		boolean result = !undoStack.empty();
		if (result) {
			IUndoRedo c = undoStack.pop();
			redoStack.push(c);
			c.undo();
		}
		return result;
	}

	public  boolean redo() {
		boolean result = !redoStack.empty();
		if (result) {
			IUndoRedo c = redoStack.pop();
			undoStack.push(c);
			c.redo();
		}
		return result;
	}
}
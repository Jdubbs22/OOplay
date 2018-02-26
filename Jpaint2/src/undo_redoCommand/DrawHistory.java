package undo_redoCommand;
import java.util.Stack;

public class DrawHistory {
	private final static Stack<IUndoRedo> undoStack = new Stack<IUndoRedo>();
	private  final static Stack<IUndoRedo> redoStack = new Stack<IUndoRedo>();
//constructor that takes in appstate in a member variable
	
	public static void add(IUndoRedo cmd) {  //added static
		undoStack.push(cmd);
		redoStack.clear();
	}
	
	public static boolean undo() {
		boolean result = !undoStack.empty();
		if (result) {
			IUndoRedo c = undoStack.pop();
			redoStack.push(c);
			c.undo();
		}
		return result;
	}

	public   static boolean redo() {
		boolean result = !redoStack.empty();
		if (result) {
			IUndoRedo c = redoStack.pop();
			undoStack.push(c);
			c.redo();
		}
		return result;
	}
}
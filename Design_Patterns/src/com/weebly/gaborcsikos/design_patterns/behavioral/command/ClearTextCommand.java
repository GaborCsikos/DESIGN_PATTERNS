/**
 * 
 */
package com.weebly.gaborcsikos.design_patterns.behavioral.command;

/**
 * @author Gabor Csikos
 * 
 */
public class ClearTextCommand extends AbstractCommand {

	private String undoText = "";

	public ClearTextCommand(TextEditor editor) {
		super(editor);
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see
	 * com.weebly.gaborcsikos.design_patterns.behavioral.command.Command#action
	 * ()
	 */
	@Override
	public void action() {
		undoText = getEditor().getText(); // backup
		getEditor().setText("");

	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see
	 * com.weebly.gaborcsikos.design_patterns.behavioral.command.Command#undo()
	 */
	@Override
	public void undo() {
		getEditor().setText(undoText);
	}

}

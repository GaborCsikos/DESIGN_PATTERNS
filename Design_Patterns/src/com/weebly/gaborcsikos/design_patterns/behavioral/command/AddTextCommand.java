/**
 * 
 */
package com.weebly.gaborcsikos.design_patterns.behavioral.command;

/**
 * @author Gabor Csikos
 * 
 */
public class AddTextCommand extends AbstractCommand {
	private String undoText = "";
	private String textToBeAdded = "";

	public AddTextCommand(TextEditor editor, String textToBeAdded) {
		super(editor);
		this.textToBeAdded = textToBeAdded;
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
		getEditor().setText(getEditor().getText() + textToBeAdded);

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

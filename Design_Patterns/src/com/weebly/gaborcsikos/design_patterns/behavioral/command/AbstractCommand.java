/**
 * 
 */
package com.weebly.gaborcsikos.design_patterns.behavioral.command;

/**
 * Setting the commands (encapsulate the operations)
 * 
 * @author Gabor Csikos
 * 
 */
public abstract class AbstractCommand implements Command {

	private final TextEditor editor;

	public AbstractCommand(TextEditor editor) {
		super();
		this.editor = editor;
	}

	public TextEditor getEditor() {
		return editor;
	}

}

/**
 * 
 */
package com.weebly.gaborcsikos.design_patterns.behavioral.command;

import java.util.Stack;

/**
 * This is the text editor, here we want to apply the commands
 * 
 * @author Gabor Csikos
 * 
 */
public class TextEditor {

	private String text = "";

	private final Stack<Command> queue = new Stack<Command>();

	public void executeAction(Command command) {
		command.action();
		queue.push(command);
	}

	public void undo() {
		Command lastCommand = queue.pop();
		if (lastCommand != null) {
			lastCommand.undo();
		}
	}

	public void setText(String text) {
		this.text = text;
	}

	public String getText() {
		return text;
	}

}

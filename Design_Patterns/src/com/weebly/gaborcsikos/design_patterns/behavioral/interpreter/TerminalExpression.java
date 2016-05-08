/**
 * 
 */
package com.weebly.gaborcsikos.design_patterns.behavioral.interpreter;

/**
 * @author Gabor Csikos
 * 
 */
public class TerminalExpression implements Expression {

	private final String data;

	public TerminalExpression(String data) {
		this.data = data;
	}

	@Override
	public boolean interpret(String context) {

		if (context.contains(data)) {
			return true;
		}
		return false;
	}
}

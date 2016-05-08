/**
 * 
 */
package com.weebly.gaborcsikos.design_patterns.behavioral.interpreter;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import org.junit.Test;

/**
 * @author Gabor Csikos
 * 
 */
public class InterPreterTest {

	private final TerminalExpression expression1 = new TerminalExpression(
			"Aizhan");
	private final TerminalExpression expression2 = new TerminalExpression(
			"Szabina");
	private final TerminalExpression expression3 = new TerminalExpression(
			"Gabor");

	@Test
	public void testOrExpression() {
		Expression womanExpression = new OrExpression(expression1, expression2);
		assertTrue(womanExpression.interpret("Szabina is a woman"));
		assertTrue(womanExpression.interpret("Aizhan is a woman"));
		assertFalse(womanExpression.interpret("Gabor is a woman"));
	}

	@Test
	public void testAndExpression() {
		Expression marriedExpression = new AndExpression(expression1,
				expression3);
		assertTrue(marriedExpression.interpret("Gabor and Aizhan is married"));
		assertFalse(marriedExpression.interpret("Gabor is not married"));
	}

}

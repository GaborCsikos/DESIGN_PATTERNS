/**
 * 
 */
package com.weebly.gaborcsikos.design_patterns.behavioral.template;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

/**
 * @author Gabor Csikos
 * 
 */
public class TemaplateMethodTest {

	private final Calculator calculator = new CalculatorImpl();

	@Test
	public void test() {
		assertEquals(CalculatorImpl.MAGIC_NUMBER, calculator.calculate());
	}

}

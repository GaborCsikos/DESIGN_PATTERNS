/**
 * 
 */
package com.weebly.gaborcsikos.design_patterns.behavioral.template;

/**
 * @author Gabor Csikos
 * 
 */
public class CalculatorImpl extends Calculator {

	public static final int MAGIC_NUMBER = 4; // for unit testing only

	/*
	 * (non-Javadoc)
	 * 
	 * @see
	 * com.weebly.gaborcsikos.design_patterns.behavioral.template.Calculator
	 * #calculate()
	 */
	@Override
	int calculate() {
		return MAGIC_NUMBER;
	}

}

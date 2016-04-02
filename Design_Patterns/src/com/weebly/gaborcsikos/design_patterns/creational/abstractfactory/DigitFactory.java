/**
 * 
 */
package com.weebly.gaborcsikos.design_patterns.creational.abstractfactory;

/**
 * @author Gabor Csikos
 * 
 */
public class DigitFactory extends AbstractFactory {

	// for testing create constans
	public static final int ONE = 1;
	public static final int TEN = 10;

	@Override
	public Number createNumber(NumberType type) {
		if (NumberType.ONE_DIGIT.equals(type)) {
			return new Integer(ONE);
		} else if (NumberType.TWO_DIGIT.equals(type)) {
			return new Integer(TEN);
		}
		return null;
	}
}

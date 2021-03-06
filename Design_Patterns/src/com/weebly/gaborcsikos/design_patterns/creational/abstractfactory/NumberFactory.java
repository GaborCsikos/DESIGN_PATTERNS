/**
 * 
 */
package com.weebly.gaborcsikos.design_patterns.creational.abstractfactory;

/**
 * @author Gabor Csikos
 * 
 */
public class NumberFactory extends AbstractFactory {

	// for testing create constans
	public static final int ONE = 1;
	public static final int TWO = 1;

	@Override
	public Number createNumber(NumberType type) {
		if (NumberType.EVEN.equals(type)) {
			return new Integer(TWO);
		} else if (NumberType.ODD.equals(type)) {
			return new Integer(ONE);
		}
		return null;
	}
}

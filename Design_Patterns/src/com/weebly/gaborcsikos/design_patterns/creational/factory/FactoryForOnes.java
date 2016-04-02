/**
 * 
 */
package com.weebly.gaborcsikos.design_patterns.creational.factory;

/**
 * @author Gabor Csikos
 * 
 */
public class FactoryForOnes extends NumberFactory {

	public static final String ONE = "1";
	public static final String ONE_FOR_SHORT = "1";

	@Override
	Number createNumber(NumberType type) {
		if (type != null) {
			switch (type) {
			case INTEGER:
				return new Integer(ONE);
			case SHORT:
				return new Short(ONE_FOR_SHORT);
			}
		}
		// if no type was given return default
		return new Integer(ONE);
	}

}

/**
 * 
 */
package com.weebly.gaborcsikos.design_patterns.creational.factory;

/**
 * @author Gabor Csikos
 * 
 */
public class SimpleFactory {

	public static final String ZERO = "0";
	public static final String ZERO_FOR_SHORT = "0";

	// Simple encapsulation of creation
	public static String createNumberAsString() {
		return new String(ZERO);
	}

	// can also be static, as a utility
	public Number createNumber(NumberType type) {
		if (type != null) {
			switch (type) {
			case INTEGER:
				return new Integer(ZERO);
			case SHORT:
				return new Short(ZERO_FOR_SHORT);
			}
		}
		// if no type was given return default
		return new Integer(ZERO);
	}
}

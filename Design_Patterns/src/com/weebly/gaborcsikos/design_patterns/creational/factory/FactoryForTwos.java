package com.weebly.gaborcsikos.design_patterns.creational.factory;

public class FactoryForTwos extends NumberFactory {
	public static final String TWO = "2";
	public static final String TWO_FOR_SHORT = "2";

	@Override
	Number createNumber(NumberType type) {
		if (type != null) {
			switch (type) {
			case INTEGER:
				return new Integer(TWO);
			case SHORT:
				return new Short(TWO_FOR_SHORT);
			}
		}
		// if no type was given return default
		return new Integer(TWO);
	}

}

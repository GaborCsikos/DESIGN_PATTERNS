/**
 * 
 */
package com.weebly.gaborcsikos.design_patterns.creational.abstractfactory;

/**
 * @author Gabor Csikos
 * 
 */
public class AbstractFactory implements CreateNumber {

	AbstractFactory createFactorytory(FactoryType factoryType) {
		if (FactoryType.DIGIT.equals(factoryType)) {
			return new DigitFactory();
		} else {
			return new NumberFactory();
		}
	}

	// needed for testing, to have same type
	@Override
	public Number createNumber(NumberType type) {
		// TODO Auto-generated method stub
		return null;
	}

}

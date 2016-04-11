/**
 * 
 */
package com.weebly.gaborcsikos.design_patterns.structural.decorator;

/**
 * @author Gabor Csikos
 * 
 */
public class MargheritaPizza extends Pizza {

	public static int PRICE = 150; // For testing

	/*
	 * (non-Javadoc)
	 * 
	 * @see
	 * com.weebly.gaborcsikos.design_patterns.structural.decorator.PizzaSlice
	 * #price()
	 */
	@Override
	public int price() {
		return PRICE;
	}

}

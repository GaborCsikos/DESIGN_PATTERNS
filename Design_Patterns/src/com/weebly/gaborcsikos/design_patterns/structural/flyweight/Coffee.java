package com.weebly.gaborcsikos.design_patterns.structural.flyweight;

/**
 * 
 * @author Gabor Csikos
 * 
 */
public class Coffee extends Beverage {

	public static int counter = 0;

	public Coffee() {
		super("Coffee", 15);
		counter++;
	}

}

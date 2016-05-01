package com.weebly.gaborcsikos.design_patterns.structural.flyweight;

/**
 * 
 * @author Gabor Csikos
 * 
 */
public class Tee extends Beverage {

	public static int counter = 0;

	public Tee() {
		super("Tee", 10);
		counter++;
	}

}

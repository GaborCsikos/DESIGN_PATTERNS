package com.weebly.gaborcsikos.design_patterns.structural.flyweight;

/**
 * 
 * @author Gabor Csikos
 * 
 */
public class Coffee {

	public static int counter = 0;
	private final int price = 15;

	public Coffee() {
		counter++;
	}

	public int getPrice() {
		return price;
	}
}

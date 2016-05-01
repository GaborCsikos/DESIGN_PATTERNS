package com.weebly.gaborcsikos.design_patterns.structural.flyweight;

/**
 * 
 * @author Gabor Csikos
 * 
 */
public class Tee {

	public static int counter = 0;
	private int price = 10;

	public Tee() {
		counter++;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}
}

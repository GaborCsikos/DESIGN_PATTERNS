/**
 * 
 */
package com.weebly.gaborcsikos.design_patterns.structural.flyweight;

/**
 * @author Gabor Csikos
 * 
 */
public class BeverageFlyWeight {

	private Coffee coffee;
	private Tee tee;
	private int served = 0;

	public Coffee serveCoffee() {
		if (coffee == null) {
			coffee = new Coffee();
		}
		served++;
		return coffee;
	}

	public Tee serveTee() {
		if (tee == null) {
			tee = new Tee();
		}
		served++;
		return tee;
	}

	public int getServed() {
		return served;
	}

}

/**
 * 
 */
package com.weebly.gaborcsikos.design_patterns.structural.decorator;

/**
 * @author Gabor Csikos
 * 
 */
public class ExtraCheeseDecorator extends ToppingDecorator {

	public static int PRICE = 20; // For testing

	private final Pizza pizza;

	public ExtraCheeseDecorator(Pizza pizza) {
		super();
		this.pizza = pizza;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see
	 * com.weebly.gaborcsikos.design_patterns.structural.decorator.Pizza#price()
	 */
	@Override
	public int price() {
		return PRICE + pizza.price();
	}
}

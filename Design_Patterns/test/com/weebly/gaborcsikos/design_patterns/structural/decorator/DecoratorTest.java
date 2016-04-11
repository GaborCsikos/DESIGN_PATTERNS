package com.weebly.gaborcsikos.design_patterns.structural.decorator;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class DecoratorTest {

	private Pizza pizza;

	@Test
	public void testSimpleElement() {
		pizza = new MargheritaPizza();
		assertEquals(MargheritaPizza.PRICE, pizza.price());

		pizza = new FunghiPizza();
		assertEquals(FunghiPizza.PRICE, pizza.price());
	}

	@Test
	public void testDecorator() {
		pizza = new MargheritaPizza();
		pizza = new SalamiDecorator(pizza);
		assertEquals(MargheritaPizza.PRICE + SalamiDecorator.PRICE,
				pizza.price());
		pizza = new ExtraCheeseDecorator(pizza);
		assertEquals(MargheritaPizza.PRICE + SalamiDecorator.PRICE
				+ ExtraCheeseDecorator.PRICE, pizza.price());
	}

}

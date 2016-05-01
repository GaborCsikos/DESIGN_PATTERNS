/**
 * 
 */
package com.weebly.gaborcsikos.design_patterns.structural.flyweight;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

/**
 * 
 * Unit test of {@link BeverageFlyWeight}
 * 
 * @author Gabor Csikos
 * 
 */
public class BeverageFlyWeightTest {

	BeverageFlyWeight flyWeight = new BeverageFlyWeight();

	@Test
	public void testObjectCreated() {
		int totalPrice = 0;
		totalPrice += flyWeight.serveCoffee().getPrice();
		totalPrice += flyWeight.serveCoffee().getPrice();
		totalPrice += flyWeight.serveCoffee().getPrice();
		totalPrice += flyWeight.serveCoffee().getPrice();
		totalPrice += flyWeight.serveCoffee().getPrice();
		totalPrice += flyWeight.serveCoffee().getPrice();
		totalPrice += flyWeight.serveCoffee().getPrice();
		totalPrice += flyWeight.serveCoffee().getPrice();
		totalPrice += flyWeight.serveTee().getPrice();
		totalPrice += flyWeight.serveTee().getPrice();
		totalPrice += flyWeight.serveTee().getPrice();
		totalPrice += flyWeight.serveTee().getPrice();
		totalPrice += flyWeight.serveTee().getPrice();
		totalPrice += flyWeight.serveTee().getPrice();
		totalPrice += flyWeight.serveTee().getPrice();
		totalPrice += flyWeight.serveTee().getPrice();

		// served 16 times
		assertEquals(16, flyWeight.getServed());
		assertEquals(200, totalPrice);

		// But only 1-1 object created
		assertEquals(1, Coffee.counter);
		assertEquals(1, Tee.counter);
	}

}

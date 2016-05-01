/**
 * 
 */
package com.weebly.gaborcsikos.design_patterns.structural.flyweight;

import static com.weebly.gaborcsikos.design_patterns.structural.flyweight.BeverageType.COFEE;
import static com.weebly.gaborcsikos.design_patterns.structural.flyweight.BeverageType.TEE;
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
		totalPrice += flyWeight.serveBeverage(COFEE).getPrice();
		totalPrice += flyWeight.serveBeverage(COFEE).getPrice();
		totalPrice += flyWeight.serveBeverage(COFEE).getPrice();
		totalPrice += flyWeight.serveBeverage(COFEE).getPrice();
		totalPrice += flyWeight.serveBeverage(COFEE).getPrice();
		totalPrice += flyWeight.serveBeverage(COFEE).getPrice();
		totalPrice += flyWeight.serveBeverage(COFEE).getPrice();
		totalPrice += flyWeight.serveBeverage(COFEE).getPrice();
		totalPrice += flyWeight.serveBeverage(TEE).getPrice();
		totalPrice += flyWeight.serveBeverage(TEE).getPrice();
		totalPrice += flyWeight.serveBeverage(TEE).getPrice();
		totalPrice += flyWeight.serveBeverage(TEE).getPrice();
		totalPrice += flyWeight.serveBeverage(TEE).getPrice();
		totalPrice += flyWeight.serveBeverage(TEE).getPrice();
		totalPrice += flyWeight.serveBeverage(TEE).getPrice();
		totalPrice += flyWeight.serveBeverage(TEE).getPrice();

		// served 16 times
		assertEquals(16, flyWeight.getServed());
		assertEquals(200, totalPrice);

		// But only 1-1 object created
		assertEquals(1, Coffee.counter);
		assertEquals(1, Tee.counter);
	}

}

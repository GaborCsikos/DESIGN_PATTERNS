package com.weebly.gaborcsikos.design_patterns.creational.abstractfactory;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

/**
 * Unit test for {@link AbstractFactory}
 * 
 * @author Gabor Csikos
 * 
 */
public class AbstractFactoryTest {

	private final AbstractFactory abstractFactory = new AbstractFactory();

	@Test
	public void testDigitFactory() {
		AbstractFactory factory = abstractFactory
				.createFactorytory(FactoryType.DIGIT);
		Number one = factory.createNumber(NumberType.ONE_DIGIT);
		Number ten = factory.createNumber(NumberType.TWO_DIGIT);
		assertEquals(DigitFactory.ONE, one.intValue());
		assertEquals(DigitFactory.TEN, ten.intValue());
	}

	@Test
	public void testNumberFactory() {
		AbstractFactory factory = abstractFactory
				.createFactorytory(FactoryType.NUMBER);
		Number one = factory.createNumber(NumberType.EVEN);
		Number two = factory.createNumber(NumberType.ODD);
		assertEquals(NumberFactory.ONE, one.intValue());
		assertEquals(NumberFactory.TWO, two.intValue());
	}
}

/**
 * 
 */
package com.weebly.gaborcsikos.design_patterns.creational.factory;

import static org.junit.Assert.assertEquals;

import org.junit.Before;
import org.junit.Test;

/**
 * unit test for {@linkg Factory}
 * 
 * @author Gabor Csikos
 * 
 */
public class FactoryTest {

	private NumberFactory factory;

	/**
	 * @throws java.lang.Exception
	 */
	@Before
	public void setUp() throws Exception {
	}

	@Test
	public void testSimpleFactoryOne() {
		factory = new FactoryForOnes(); // Subclass decides the
		assertEquals(FactoryForOnes.ONE_FOR_SHORT,
				factory.createNumber(NumberType.SHORT).toString());
		assertEquals(FactoryForOnes.ONE,
				factory.createNumber(NumberType.INTEGER).toString());
		assertEquals(FactoryForOnes.ONE, factory.createNumber(null).toString());
	}

	@Test
	public void testSimpleFactoryTwo() {
		factory = new FactoryForTwos(); // Subclass decides the
		assertEquals(FactoryForTwos.TWO_FOR_SHORT,
				factory.createNumber(NumberType.SHORT).toString());
		assertEquals(FactoryForTwos.TWO,
				factory.createNumber(NumberType.INTEGER).toString());
		assertEquals(FactoryForTwos.TWO, factory.createNumber(null).toString());
	}

}

/**
 * 
 */
package com.weebly.gaborcsikos.design_patterns.creational.factory;

import static org.junit.Assert.assertEquals;

import org.junit.Before;
import org.junit.Test;

/**
 * Unit test fo {@link SimpleFactory}
 * 
 * @author Gabor Csikos
 * 
 */
public class SimpleFactoryTest {

	private SimpleFactory factory;

	/**
	 * @throws java.lang.Exception
	 */
	@Before
	public void setUp() throws Exception {
		factory = new SimpleFactory();
	}

	@Test
	public void testSimpleFactory() {
		assertEquals(SimpleFactory.ZERO, SimpleFactory.createNumberAsString());
	}

	@Test
	public void testSimpleFactoryTypes() {
		assertEquals(SimpleFactory.ZERO_FOR_SHORT,
				factory.createNumber(NumberType.SHORT).toString());
		assertEquals(SimpleFactory.ZERO,
				factory.createNumber(NumberType.INTEGER).toString());
		assertEquals(SimpleFactory.ZERO, factory.createNumber(null).toString());
	}

}

/**
 * 
 */
package com.weebly.gaborcsikos.design_patterns.creational.singleton;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

/**
 * Unit test for {@link SingletonEnum}
 * 
 * @author Gabor Csikos
 * 
 */
public class SingletonEnumTest {

	@Test
	public void testSingleton() {
		assertEquals(1, SingletonEnum.INSTANCE.getNumberOfInstance());
		assertEquals(1, SingletonEnum.INSTANCE.getNumberOfInstance());
		assertEquals(1, SingletonEnum.INSTANCE.getNumberOfInstance());
	}

}

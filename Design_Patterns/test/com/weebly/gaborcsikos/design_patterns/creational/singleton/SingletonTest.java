/**
 * 
 */
package com.weebly.gaborcsikos.design_patterns.creational.singleton;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

/**
 * Unit tests for {@link Singleton}
 * 
 * @author Gabor Csikos
 * 
 */
public class SingletonTest {

	@Test
	public void testSingleton() {
		assertEquals(1, Singleton.getInstance().getNumberOfInstance());
		assertEquals(1, Singleton.getInstance().getNumberOfInstance());
		assertEquals(1, Singleton.getInstance().getNumberOfInstance());
	}

}

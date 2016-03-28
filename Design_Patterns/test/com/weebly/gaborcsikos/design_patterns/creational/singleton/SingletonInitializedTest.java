/**
 * 
 */
package com.weebly.gaborcsikos.design_patterns.creational.singleton;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

/**
 * Unit test for {@link SingletonInitialized}
 * 
 * @author Gabor Csikos
 * 
 */
public class SingletonInitializedTest {

	@Test
	public void testSingleton() {
		assertEquals(1, SingletonInitialized.getInstance()
				.getNumberOfInstance());
		assertEquals(1, SingletonInitialized.getInstance()
				.getNumberOfInstance());
		assertEquals(1, SingletonInitialized.getInstance()
				.getNumberOfInstance());
	}

}

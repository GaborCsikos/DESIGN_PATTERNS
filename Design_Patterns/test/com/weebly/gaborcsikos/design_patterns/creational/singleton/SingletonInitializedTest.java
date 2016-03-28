/**
 * 
 */
package com.weebly.gaborcsikos.design_patterns.creational.singleton;

import org.junit.Assert;
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
		Assert.assertEquals(1, SingletonInitialized.getInstance()
				.getNumberOfInstance());
		Assert.assertEquals(1, SingletonInitialized.getInstance()
				.getNumberOfInstance());
		Assert.assertEquals(1, SingletonInitialized.getInstance()
				.getNumberOfInstance());
	}

}

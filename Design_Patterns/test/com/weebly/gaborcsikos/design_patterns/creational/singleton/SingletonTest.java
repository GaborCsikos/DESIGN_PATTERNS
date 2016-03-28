/**
 * 
 */
package com.weebly.gaborcsikos.design_patterns.creational.singleton;

import org.junit.Assert;
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
		Assert.assertEquals(1, Singleton.getInstance().getNumberOfInstance());
		Assert.assertEquals(1, Singleton.getInstance().getNumberOfInstance());
		Assert.assertEquals(1, Singleton.getInstance().getNumberOfInstance());
	}

}

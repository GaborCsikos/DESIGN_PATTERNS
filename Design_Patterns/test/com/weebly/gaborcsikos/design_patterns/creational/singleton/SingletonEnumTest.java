/**
 * 
 */
package com.weebly.gaborcsikos.design_patterns.creational.singleton;

import org.junit.Assert;
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
		Assert.assertEquals(1, SingletonEnum.INSTANCE.getNumberOfInstance());
		Assert.assertEquals(1, SingletonEnum.INSTANCE.getNumberOfInstance());
		Assert.assertEquals(1, SingletonEnum.INSTANCE.getNumberOfInstance());
	}

}

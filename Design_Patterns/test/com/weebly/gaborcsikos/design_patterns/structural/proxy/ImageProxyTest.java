/**
 * 
 */
package com.weebly.gaborcsikos.design_patterns.structural.proxy;

import org.junit.Assert;
import org.junit.Test;

/**
 * @author Gabor Csikos
 * 
 */
public class ImageProxyTest {

	private final ImageProxy proxy = new ImageProxy();

	@Test
	public void test() {
		Image result = null;
		for (int i = 0; i < 10; i++) {
			result = proxy.getImage();
		}
		Assert.assertEquals(Image.LOADING_TIME, result.getLoaded());
	}

}

/**
 * 
 */
package com.weebly.gaborcsikos.design_patterns.structural.adapter;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

/**
 * @author Gabor Csikos
 * 
 */
public class AdapterTest {

	@Test
	public void testOldImplementation() {
		Target client = new Client();
		assertEquals(client.reguest(), 0);

	}

	@Test
	public void testAdapter() {
		Target client = new Adapter();
		assertEquals(client.reguest(), Adaptee.SECRET_NUMBER);
	}
}

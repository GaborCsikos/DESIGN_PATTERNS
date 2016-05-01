package com.weebly.gaborcsikos.design_patterns.behavioral.chanofresponsibility;

import static org.junit.Assert.assertTrue;

import org.junit.Test;

/**
 * 
 * @author Gabor Csikos
 * 
 */
public class ChainOfResponsibilityTest {

	private final ChainOfResponsibility cor = new ChainOfResponsibility();

	@Test
	public void test() {
		assertTrue(cor.handleCheckout());
	}

}

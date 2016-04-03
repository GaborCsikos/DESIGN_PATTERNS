/**
 * 
 */
package com.weebly.gaborcsikos.design_patterns;

import static org.junit.Assert.assertEquals;

import org.junit.Before;
import org.junit.Test;

/**
 * @author Gabor Csikos
 * 
 */
public class MVCTest {

	private final View view = new View();
	private final Model model = new Model();
	private Controller controller;

	/**
	 * @throws java.lang.Exception
	 */
	@Before
	public void setUp() throws Exception {
		controller = new Controller(model, view);
	}

	@Test
	public void test() {
		assertEquals("0", view.getShowCounter());
		controller.increaseCounder();
		assertEquals("1", view.getShowCounter());
	}

}

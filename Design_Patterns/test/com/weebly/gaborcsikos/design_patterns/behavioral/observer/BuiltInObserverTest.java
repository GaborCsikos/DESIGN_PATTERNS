/**
 * 
 */
package com.weebly.gaborcsikos.design_patterns.behavioral.observer;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

/**
 * @author Gabor Csikos
 * 
 */
public class BuiltInObserverTest {

	private final WithBuildInObserver magicNumber = new WithBuildInObserver();
	private final BuiltInObserverDisplay firstObserver = new BuiltInObserverDisplay(
			magicNumber);
	private final BuiltInObserverDisplay secondObserver = new BuiltInObserverDisplay(
			magicNumber);

	@Test
	public void test() {

		magicNumber.addObserver(firstObserver);
		magicNumber.addObserver(secondObserver);

		magicNumber.setMagicNumber(10);
		assertEquals(10, firstObserver.displayMagicNumber());
		assertEquals(10, secondObserver.displayMagicNumber());

		// update both
		magicNumber.setMagicNumber(11);
		assertEquals(11, firstObserver.displayMagicNumber());
		assertEquals(11, secondObserver.displayMagicNumber());

		// removing sets it to 0
		magicNumber.deleteObserver(secondObserver);

		// update again
		magicNumber.setMagicNumber(12);
		assertEquals(12, firstObserver.displayMagicNumber());
		assertEquals(11, secondObserver.displayMagicNumber());
	}

}

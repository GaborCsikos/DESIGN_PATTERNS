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
public class ObserverTest {

	private final MagicNumberSubject magicNumber = new MagicNumberSubject();
	private final MagicNumberDisplayer firstObserver = new MagicNumberDisplayer();
	private final MagicNumberDisplayer secondObserver = new MagicNumberDisplayer();

	@Test
	public void test() {
		magicNumber.setMagicNumber(10);
		magicNumber.addObserver(firstObserver);
		magicNumber.addObserver(secondObserver);

		// after adding the previus magic number should been added
		assertEquals(10, firstObserver.displayMagicNumber());
		assertEquals(10, secondObserver.displayMagicNumber());

		// update both
		magicNumber.setMagicNumber(11);
		assertEquals(11, firstObserver.displayMagicNumber());
		assertEquals(11, secondObserver.displayMagicNumber());

		// removing sets it to 0
		magicNumber.removeObserver(secondObserver);
		assertEquals(0, secondObserver.displayMagicNumber());

		// update again
		magicNumber.setMagicNumber(12);
		assertEquals(12, firstObserver.displayMagicNumber());
		assertEquals(0, secondObserver.displayMagicNumber());
	}

}

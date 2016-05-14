/**
 * 
 */
package com.weebly.gaborcsikos.design_patterns.behavioral.Iterator;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

/**
 * @author Gabor Csikos
 * 
 */
public class IteratorTest {

	private final NameIterator iterator = new NameIterator();

	/**
	 * @throws java.lang.Exception
	 */
	@Test
	public void test() {
		int index = 0;
		for (Name name : iterator.getNames()) {
			switch (index) {
			case 0:
				assertEquals("Aizhan", name.getFirstName());
				assertEquals("Csikos", name.getLastName());
				break;
			case 1:
				assertEquals("Szabina", name.getFirstName());
				assertEquals("Csikos", name.getLastName());
				break;
			case 2:
				assertEquals("Gabor", name.getFirstName());
				assertEquals("Csikos", name.getLastName());
				break;
			default:
			}
			index++;
		}
	}

}

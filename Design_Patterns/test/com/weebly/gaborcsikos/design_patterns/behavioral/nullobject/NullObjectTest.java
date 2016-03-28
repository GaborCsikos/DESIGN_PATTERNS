/**
 * 
 */
package com.weebly.gaborcsikos.design_patterns.behavioral.nullobject;

import static java.lang.Boolean.FALSE;
import static java.lang.Boolean.TRUE;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

import org.junit.Before;
import org.junit.Test;

/**
 * Unit test for {@link NullObject}
 * 
 * @author Gabor Csikos
 * 
 */
public class NullObjectTest {

	private PersonService sevice;

	/**
	 * @throws java.lang.Exception
	 */
	@Before
	public void setUp() throws Exception {
		sevice = new PersonService();
	}

	@Test
	public void testNotNullObject() {
		sevice.setFound(TRUE);
		assertEquals(PersonService.NAME, sevice.getPerson().getName());
	}

	@Test
	public void testNullObject() {
		sevice.setFound(FALSE);
		assertNotNull(sevice.getPerson());
		assertEquals(NullObject.NOT_FOUND, sevice.getPerson().getName());
	}
}

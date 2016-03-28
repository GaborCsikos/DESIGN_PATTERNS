package com.weebly.gaborcsikos.design_patterns.creational.prototype;

import static org.junit.Assert.assertEquals;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class PrototypeTest {

	private static final long ID = 1l;
	private static final String NAME = "Aizhan";

	private static final String ADDRESS_CARD_ID = "1234";
	private static final String HOUSE_NUMBER = "12";
	private static final String STREET = "street";
	private static final String CITY = "city";

	@Before
	public void setUp() throws Exception {
	}

	@Test
	public void testPersonPrototype() throws CloneNotSupportedException {
		PrototypeForPerson person = new PrototypeForPerson(NAME, ID);
		PrototypeForPerson clone = person.clone();
		assertEquals(NAME, clone.getName());
		assertEquals(ID, clone.getId());
	}

	@Test
	public void testAddressPrototype() {
		PrototypeForAddress address = new PrototypeForAddress(CITY, STREET,
				HOUSE_NUMBER, ADDRESS_CARD_ID);
		PrototypeForAddress clone = address.clone();
		assertEquals(CITY, clone.getCity());
		assertEquals(STREET, clone.getStreet());
		assertEquals(HOUSE_NUMBER, clone.getHouseNumber());

		// we didn't want to copy this
		Assert.assertNotEquals(ADDRESS_CARD_ID, clone.getAddressCardId());
	}
}

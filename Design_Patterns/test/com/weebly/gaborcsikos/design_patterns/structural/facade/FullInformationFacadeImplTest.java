package com.weebly.gaborcsikos.design_patterns.structural.facade;

import static org.junit.Assert.assertEquals;

import org.junit.Before;
import org.junit.Test;

public class FullInformationFacadeImplTest {

	private FullInformationFacade facade;
	private final AddressService addressService = new AddressService();
	private final PersonService personService = new PersonService();

	@Before
	public void setUp() throws Exception {
		facade = new FullInformationFacadeImpl(personService, addressService);
	}

	@Test
	public void test() {
		String fullInformation = facade.loadNameAndAddressById(1l, 1l);
		assertEquals(PersonService.FULL_NAME + AddressService.ADDRESS,
				fullInformation);
	}

}

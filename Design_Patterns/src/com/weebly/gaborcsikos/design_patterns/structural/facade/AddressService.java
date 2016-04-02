package com.weebly.gaborcsikos.design_patterns.structural.facade;

/**
 * 
 * @author Gabor Csikos
 * 
 */
public class AddressService {

	// for testing
	public static final String ADDRESS = "Sample Address";
	public static final String CITY = "City";

	// Dummy methods, returning the same information
	public String loadFullAddressById(long id) {
		return ADDRESS;
	}

	public String loadCityByPosCode(long postCode) {
		return CITY;
	}

}

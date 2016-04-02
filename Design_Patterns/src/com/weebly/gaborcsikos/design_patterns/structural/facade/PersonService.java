/**
 * 
 */
package com.weebly.gaborcsikos.design_patterns.structural.facade;

/**
 * @author Gabor Csikos
 * 
 */
public class PersonService {

	// test data
	public static final String FULL_NAME = "Gabor Csikos";
	public static final String WIFE_NAME = "Aizhan Csikos";
	public static final String CHILD_NAME = "Szabina Csikos";

	// Dummy methods, returning the same information
	public String loadFullnameByPersonId(long id) {
		return FULL_NAME;
	}

	public String loadWifeByPersonId(long id) {
		return WIFE_NAME;

	}

	public String loadChildByPersonId(long id) {
		return CHILD_NAME;
	}
}

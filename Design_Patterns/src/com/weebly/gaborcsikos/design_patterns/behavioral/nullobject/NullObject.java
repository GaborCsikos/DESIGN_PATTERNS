/**
 * 
 */
package com.weebly.gaborcsikos.design_patterns.behavioral.nullobject;

/**
 * @author Gabor Csikos
 * 
 */
public class NullObject extends Person {

	// for test
	public static final String NOT_FOUND = "NOT_FOUND";

	// Give the name not found
	public NullObject() {
		super(NOT_FOUND);
	}

}

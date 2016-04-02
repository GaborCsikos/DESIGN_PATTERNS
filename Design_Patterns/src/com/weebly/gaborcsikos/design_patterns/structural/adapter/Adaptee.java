/**
 * 
 */
package com.weebly.gaborcsikos.design_patterns.structural.adapter;

/**
 * This class is what we need
 * 
 * @author Gabor Csikos
 * 
 */
public class Adaptee {

	// for testing
	public static final int SECRET_NUMBER = 42;

	// this is what we need
	public int getSecretNumber() {
		return SECRET_NUMBER;
	}

}

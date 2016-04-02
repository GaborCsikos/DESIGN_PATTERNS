/**
 * 
 */
package com.weebly.gaborcsikos.design_patterns.structural.adapter;

/**
 * @author Gabor Csikos
 * 
 */
public class Client implements Target {

	// The client can only return one, but we need a secret number
	@Override
	public int reguest() {
		return 0;
	}

}

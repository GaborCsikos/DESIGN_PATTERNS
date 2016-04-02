/**
 * 
 */
package com.weebly.gaborcsikos.design_patterns.structural.adapter;

/**
 * @author Gabor Csikos
 * 
 */
public class Adapter implements Target {

	private final Adaptee adaptee = new Adaptee();

	@Override
	public int reguest() {
		return adaptee.getSecretNumber();
	}

}

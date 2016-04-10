/**
 * 
 */
package com.weebly.gaborcsikos.design_patterns.structural.composite;

/**
 * @author Gabor Csikos
 * 
 */
public class Rectangle implements Graphic {

	public static final String RECTANGLE = "RECTANGLE"; // for testing only

	/*
	 * (non-Javadoc)
	 * 
	 * @see
	 * com.weebly.gaborcsikos.design_patterns.structural.composite.Graphic#draw
	 * ()
	 */
	@Override
	public String draw() {
		return RECTANGLE;
	}

}

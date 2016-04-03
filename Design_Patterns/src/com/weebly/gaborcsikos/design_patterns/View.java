/**
 * 
 */
package com.weebly.gaborcsikos.design_patterns;

/**
 * @author Gabor Csikos
 * 
 */
public class View {

	private String showCounter = "0";

	public void updateCounder(String update) {
		showCounter = update;

	}

	// for testing
	public String getShowCounter() {
		return showCounter;
	}

}

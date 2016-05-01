/**
 * 
 */
package com.weebly.gaborcsikos.design_patterns.behavioral.chanofresponsibility;

/**
 * @author Gabor Csikos
 * 
 */
public class AddressHandler extends Handler {

	/*
	 * (non-Javadoc)
	 * 
	 * @see
	 * com.weebly.gaborcsikos.design_patterns.behavioral.chanofresponsibility
	 * .Handler#handleCheckout()
	 */
	@Override
	boolean handleCheckout() {
		if (nextHandler != null) {
			return nextHandler.handleCheckout();
		}
		return false;
	}

}

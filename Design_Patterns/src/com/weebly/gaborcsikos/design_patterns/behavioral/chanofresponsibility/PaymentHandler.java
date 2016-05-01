/**
 * 
 */
package com.weebly.gaborcsikos.design_patterns.behavioral.chanofresponsibility;

/**
 * @author Gabor Csikos
 * 
 */
public class PaymentHandler extends Handler {

	/*
	 * (non-Javadoc)
	 * 
	 * @see
	 * com.weebly.gaborcsikos.design_patterns.behavioral.chanofresponsibility
	 * .Handler#handleCheckout()
	 */
	@Override
	boolean handleCheckout() {
		return Boolean.TRUE;
	}

}

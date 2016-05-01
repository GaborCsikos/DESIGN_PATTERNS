/**
 * 
 */
package com.weebly.gaborcsikos.design_patterns.behavioral.chanofresponsibility;

/**
 * @author Gabor Csikos
 * 
 */
public abstract class Handler {
	protected Handler nextHandler;

	abstract boolean handleCheckout();

	public void setNextHandler(Handler nextHandler) {
		this.nextHandler = nextHandler;
	}

}

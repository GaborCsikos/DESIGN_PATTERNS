/**
 * 
 */
package com.weebly.gaborcsikos.design_patterns.behavioral.chanofresponsibility;

/**
 * @author Gabor Csikos
 * 
 */
public class ChainOfResponsibility {

	private final Handler customerInfoHandler = new CustomerInformationHandler();
	private final Handler addressHandler = new AddressHandler();
	private final PaymentHandler paymentHandler = new PaymentHandler();

	public boolean handleCheckout() {
		// set chains
		customerInfoHandler.setNextHandler(addressHandler);
		addressHandler.setNextHandler(paymentHandler);

		return customerInfoHandler.handleCheckout();
	}

}

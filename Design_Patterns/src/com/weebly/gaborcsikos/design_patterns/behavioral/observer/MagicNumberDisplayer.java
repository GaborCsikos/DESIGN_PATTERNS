/**
 * 
 */
package com.weebly.gaborcsikos.design_patterns.behavioral.observer;

/**
 * @author Gabor Csikos
 * 
 */
public class MagicNumberDisplayer implements Observer, Display {

	private int magicNumber;

	/*
	 * (non-Javadoc)
	 * 
	 * @see
	 * com.weebly.gaborcsikos.design_patterns.behavioral.observer.Observer#update
	 * (int)
	 */
	@Override
	public void update(int magicNumber) {
		this.magicNumber = magicNumber;

	}

	@Override
	public int displayMagicNumber() {
		return magicNumber;
	}

}

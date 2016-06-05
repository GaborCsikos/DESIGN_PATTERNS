/**
 * 
 */
package com.weebly.gaborcsikos.design_patterns.behavioral.observer;

import java.util.Observable;

/**
 * @author Gabor Csikos Built in version of Observer
 */
public class WithBuildInObserver extends Observable {

	private int magicNumber;

	public void magicNumberChanged() {
		setChanged();
		notifyObservers();
	}

	public int getMagicNumber() {
		return magicNumber;
	}

	public void setMagicNumber(int magicNumber) {
		this.magicNumber = magicNumber;
		magicNumberChanged();

	}

}

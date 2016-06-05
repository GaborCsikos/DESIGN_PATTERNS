/**
 * 
 */
package com.weebly.gaborcsikos.design_patterns.behavioral.observer;

import java.util.Observable;
import java.util.Observer;

/**
 * @author Gabor Csikos Built in Displayer
 */
public class BuiltInObserverDisplay implements Observer, Display {

	private int magicNumber;

	public BuiltInObserverDisplay(Observable observable) {
		observable.addObserver(this);
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see com.weebly.gaborcsikos.design_patterns.behavioral.observer.Display#
	 * displayMagicNumber()
	 */
	@Override
	public int displayMagicNumber() {
		return magicNumber;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see java.util.Observer#update(java.util.Observable, java.lang.Object)
	 */
	@Override
	public void update(Observable o, Object arg) {
		if (o instanceof WithBuildInObserver) {
			this.magicNumber = ((WithBuildInObserver) o).getMagicNumber();
		}
	}

}

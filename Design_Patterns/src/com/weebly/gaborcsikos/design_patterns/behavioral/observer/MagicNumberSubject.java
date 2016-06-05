/**
 * 
 */
package com.weebly.gaborcsikos.design_patterns.behavioral.observer;

import java.util.LinkedList;
import java.util.List;

/**
 * @author Gabor Csikos
 * 
 */
public class MagicNumberSubject implements Subject {

	private final List<Observer> observers = new LinkedList<Observer>();
	private int magicNumber;

	@Override
	public void addObserver(Observer o) {
		o.update(magicNumber);
		observers.add(o);

	}

	@Override
	public void removeObserver(Observer o) {
		o.update(0);
		observers.remove(o);

	}

	@Override
	public void notifyObservers() {
		for (Observer observer : observers) {
			observer.update(magicNumber);
		}

	}

	public int getMagicNumber() {
		return magicNumber;
	}

	public void setMagicNumber(int magicNumber) {
		this.magicNumber = magicNumber;
		notifyObservers();
	}
}

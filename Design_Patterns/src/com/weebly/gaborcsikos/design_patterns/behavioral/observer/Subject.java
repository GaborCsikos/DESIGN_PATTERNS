package com.weebly.gaborcsikos.design_patterns.behavioral.observer;

/**
 * 
 * @author Gabor Csikos
 * 
 */
public interface Subject {
	void addObserver(Observer o);

	void removeObserver(Observer o);

	void notifyObservers();
}

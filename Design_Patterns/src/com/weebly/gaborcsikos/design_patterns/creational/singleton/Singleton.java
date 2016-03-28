/**
 * 
 */
package com.weebly.gaborcsikos.design_patterns.creational.singleton;

/**
 * @author Gabor Csikos
 * 
 */
public class Singleton {

	private volatile static Singleton instance = null;

	// For testing
	private int numberOfInstance = 0;

	// to prevent creating another instance of Singleton
	private Singleton() {
		numberOfInstance++;
	}

	// create singleton
	public static Singleton getInstance() {
		if (instance == null) {
			createInstance();
		}
		return instance;
	}

	// ensures only one thread can create an isntance
	private synchronized static void createInstance() {
		if (instance == null) { // double checking
			instance = new Singleton();
		}

	}

	public int getNumberOfInstance() {
		return numberOfInstance;
	}

}

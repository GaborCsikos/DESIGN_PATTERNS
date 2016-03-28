/**
 * 
 */
package com.weebly.gaborcsikos.design_patterns.creational.singleton;

/**
 * Singleton what is initialized at class loading Thread Safe
 * 
 * @author Gabor Csikos
 * 
 */
public class SingletonInitialized {

	// For testing
	private int numberOfInstance = 0;

	// initailized during class loading
	private static final SingletonInitialized INSTANCE = new SingletonInitialized();

	// to prevent creating another instance of Singleton
	private SingletonInitialized() {
		numberOfInstance++;
	}

	public static SingletonInitialized getInstance() {
		return INSTANCE;
	}

	public int getNumberOfInstance() {
		return numberOfInstance;
	}

}

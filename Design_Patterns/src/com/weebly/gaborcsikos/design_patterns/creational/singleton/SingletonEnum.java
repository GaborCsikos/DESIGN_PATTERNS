/**
 * 
 */
package com.weebly.gaborcsikos.design_patterns.creational.singleton;

/**
 * Singleton as enum
 * 
 * @author Gabor Csikos
 * 
 */
public enum SingletonEnum {

	INSTANCE;

	SingletonEnum() {
		numberOfInstance++;
	}

	private int numberOfInstance = 0;

	public int getNumberOfInstance() {
		return numberOfInstance;
	}

}

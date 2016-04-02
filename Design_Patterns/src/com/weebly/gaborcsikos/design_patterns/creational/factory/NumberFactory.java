/**
 * 
 */
package com.weebly.gaborcsikos.design_patterns.creational.factory;


/**
 * @author Gabor Csikos
 * 
 */
public abstract class NumberFactory {

	// subclass decides the the number
	abstract Number createNumber(NumberType type);
}

/**
 * 
 */
package com.weebly.gaborcsikos.design_patterns.structural.proxy;

/**
 * @author Gabor Csikos
 * 
 */
public class Image {

	public static int LOADING_TIME = 1000; // public for testing

	private int loaded = 0;

	public Image() {
		loaded += LOADING_TIME;
	}

	public int getLoaded() {
		return loaded;
	}

}

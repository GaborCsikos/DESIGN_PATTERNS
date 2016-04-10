/**
 * 
 */
package com.weebly.gaborcsikos.design_patterns.structural.bridge;

/**
 * @author Gabor Csikos
 * 
 */
public class Window {

	private WindowImpl window;

	public String draw() {
		return window.draw();
	}

	public void setWindow(WindowImpl window) {
		this.window = window;
	}
}

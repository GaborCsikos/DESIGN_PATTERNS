/**
 * 
 */
package com.weebly.gaborcsikos.design_patterns.behavioral.memento;

/**
 * @author Gabor Csikos
 * 
 */
public class Coordinate {

	private final double x;
	private final double y;

	public Coordinate(double x, double y) {
		this.x = x;
		this.y = y;
	}

	public double getX() {
		return x;
	}

	public double getY() {
		return y;
	}
}

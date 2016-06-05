package com.weebly.gaborcsikos.design_patterns.behavioral.memento;

/**
 * 
 * @author Gabor Csikos
 * 
 */
public class SolverMemento {

	private Coordinate first;
	private Coordinate second;

	public SolverMemento(Coordinate first, Coordinate second) {
		super();
		this.first = first;
		this.second = second;
	}

	public Coordinate getFirst() {
		return first;
	}

	public void setFirst(Coordinate first) {
		this.first = first;
	}

	public Coordinate getSecond() {
		return second;
	}

	public void setSecond(Coordinate second) {
		this.second = second;
	}

}

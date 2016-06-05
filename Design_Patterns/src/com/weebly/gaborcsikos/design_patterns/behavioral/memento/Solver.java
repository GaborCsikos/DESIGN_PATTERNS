package com.weebly.gaborcsikos.design_patterns.behavioral.memento;

/**
 * 
 * @author Gabor Csikos
 * 
 */
public class Solver {

	private Coordinate one;

	private Coordinate two;

	public Coordinate getResult() {
		if (one != null && two != null) {
			return new Coordinate(one.getX() + two.getX(), one.getY()
					+ two.getY());
		}
		return null;
	}

	public Coordinate getOne() {
		return one;
	}

	public void setOne(Coordinate one) {
		this.one = one;
	}

	public Coordinate getTwo() {
		return two;
	}

	public void setTwo(Coordinate two) {
		this.two = two;
	}

	public SolverMemento createMemento() {
		return new SolverMemento(one, two);
	}

	public void setMemento(SolverMemento memento) {
		one = memento.getFirst();
		two = memento.getSecond();
	}

}

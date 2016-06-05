package com.weebly.gaborcsikos.design_patterns.behavioral.memento;

public class SolverCaretaker {

	private SolverMemento memento;

	public void saveState(Solver solver) {
		memento = solver.createMemento();
	}

	public void restoreState(Solver solver) {
		solver.setMemento(memento);
	}

}

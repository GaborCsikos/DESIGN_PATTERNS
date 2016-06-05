package com.weebly.gaborcsikos.design_patterns.behavioral.memento;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class MementoTest {

	private final SolverCaretaker caretaker = new SolverCaretaker();
	private final Solver solver = new Solver();
	private final Coordinate first = new Coordinate(1.1, 2.2);
	private final Coordinate second = new Coordinate(2.2, 1.1);

	@Test
	public void test() {
		solver.setOne(first);
		solver.setTwo(second);
		Coordinate result = solver.getResult();
		assertEquals(result.getX(), 3.3, 0.01);
		assertEquals(result.getY(), 3.3, 0.01);

		// now save
		caretaker.saveState(solver);

		// change things
		Coordinate changed = new Coordinate(5.0, 5.0);
		solver.setOne(changed);
		solver.setTwo(changed);
		Coordinate resultFromChanged = solver.getResult();
		assertEquals(resultFromChanged.getX(), 10.0, 0.01);
		assertEquals(resultFromChanged.getY(), 10.0, 0.01);

		caretaker.restoreState(solver);
		Coordinate restored = solver.getResult();
		assertEquals(restored.getX(), 3.3, 0.01);
		assertEquals(restored.getY(), 3.3, 0.01);
	}

}

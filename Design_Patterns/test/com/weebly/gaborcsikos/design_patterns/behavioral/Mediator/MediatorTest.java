package com.weebly.gaborcsikos.design_patterns.behavioral.Mediator;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

/**
 * 
 * @author Gabor Csikos
 * 
 */
public class MediatorTest {

	private final SelectedItemOnScreen screenOne = new FirstScreen();
	private final SelectedItemOnScreen screenTwo = new SecondScreen();
	private final Mediator mediator = new Mediator();

	@Test
	public void test() {
		mediator.setScreen(screenOne);
		mediator.setItem(0);
		assertEquals(ItemsForSelection.ONE.name(), screenOne.getInputText());
		mediator.setItem(1);
		assertEquals(ItemsForSelection.TWO.name(), screenOne.getInputText());
		mediator.setItem(2);
		assertEquals(ItemsForSelection.THREE.name(), screenOne.getInputText());

		mediator.setScreen(screenTwo);
		mediator.setItem(0);
		assertEquals(ItemsForSelection.ONE.name(), screenTwo.getInputText());
		mediator.setItem(1);
		assertEquals(ItemsForSelection.TWO.name(), screenTwo.getInputText());
		mediator.setItem(2);
		assertEquals(ItemsForSelection.THREE.name(), screenTwo.getInputText());

		// sceen one has the last selceted text
		assertEquals(ItemsForSelection.THREE.name(), screenOne.getInputText());
	}

}

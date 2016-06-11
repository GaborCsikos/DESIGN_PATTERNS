/**
 * 
 */
package com.weebly.gaborcsikos.design_patterns.behavioral.state;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

/**
 * @author Gabor Csikos
 * 
 */
public class StateTest {

	private final GamingSystem system = new GamingSystem();

	@Test
	public void test() {
		assertEquals(StatesForTesting.EMULATOR_STOPPED, system.getActualState());
		system.emulatorStarted();
		assertEquals(StatesForTesting.EMULATOR_STARTED, system.getActualState());
		system.gameStarted();
		assertEquals(StatesForTesting.GAME_STARTED, system.getActualState());

		system.gameStopped();
		assertEquals(StatesForTesting.GAME_STOPPED, system.getActualState());

		system.gameStarted();
		assertEquals(StatesForTesting.GAME_STARTED, system.getActualState());

		system.gameStopped();
		assertEquals(StatesForTesting.GAME_STOPPED, system.getActualState());

		system.emulatorStopped();
		assertEquals(StatesForTesting.EMULATOR_STOPPED, system.getActualState());

	}

}

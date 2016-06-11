/**
 * 
 */
package com.weebly.gaborcsikos.design_patterns.behavioral.state;

/**
 * @author Gabor Csikos
 * 
 */
public class GamingSystem {

	private StatesForTesting actualState = StatesForTesting.EMULATOR_STOPPED;

	// states with getters
	private State emulatorStartedState;
	private State gameStartedState;
	private State gameStoppedState;
	private State emulatorStoppedState;

	private State state = emulatorStoppedState;

	public GamingSystem() {
		emulatorStartedState = new EmulatorStartState(this);
		gameStartedState = new GameStartState(this);
		gameStoppedState = new GameStopState(this);
		emulatorStoppedState = new EmulatorStopState(this);
		state = emulatorStoppedState;
	}

	public void gameStarted() {
		actualState = StatesForTesting.GAME_STARTED;
		state.startGame();
	}

	public void emulatorStarted() {
		actualState = StatesForTesting.EMULATOR_STARTED;
		state.startEmulator();
	}

	public void gameStopped() {
		actualState = StatesForTesting.GAME_STOPPED;
		state.stopGame();
	}

	public void emulatorStopped() {
		actualState = StatesForTesting.EMULATOR_STOPPED;
		state.stopEmulator();
	}

	public StatesForTesting getActualState() {
		return actualState;
	}

	public void setActualState(StatesForTesting actualState) {
		this.actualState = actualState;
	}

	public void setState(State state) {
		this.state = state;
	}

	public State getEmulatorStartedState() {
		return emulatorStartedState;
	}

	public void setEmulatorStartedState(State emulatorStartedState) {
		this.emulatorStartedState = emulatorStartedState;
	}

	public State getGameStartedState() {
		return gameStartedState;
	}

	public void setGameStartedState(State gameStartedState) {
		this.gameStartedState = gameStartedState;
	}

	public State getGameStoppedState() {
		return gameStoppedState;
	}

	public void setGameStoppedState(State gameStoppedState) {
		this.gameStoppedState = gameStoppedState;
	}

	public State getEmulatorStoppedState() {
		return emulatorStoppedState;
	}

	public void setEmulatorStoppedState(State emulatorStoppedState) {
		this.emulatorStoppedState = emulatorStoppedState;
	}

}

/**
 * 
 */
package com.weebly.gaborcsikos.design_patterns.behavioral.state;

/**
 * @author Gabor Csikos
 * 
 */
public class GameStartState implements State {
	private final GamingSystem system;

	public GameStartState(GamingSystem system) {
		this.system = system;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see
	 * com.weebly.gaborcsikos.design_patterns.behavioral.state.State#startEmulator
	 * ()
	 */
	@Override
	public void startEmulator() {
		// TODO Auto-generated method stub

	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see
	 * com.weebly.gaborcsikos.design_patterns.behavioral.state.State#startGame()
	 */
	@Override
	public void startGame() {
		system.setState(system.getGameStartedState());

	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see
	 * com.weebly.gaborcsikos.design_patterns.behavioral.state.State#stopGame()
	 */
	@Override
	public void stopGame() {
		system.setState(system.getEmulatorStoppedState());

	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see
	 * com.weebly.gaborcsikos.design_patterns.behavioral.state.State#stopEmulator
	 * ()
	 */
	@Override
	public void stopEmulator() {

	}

}

/**
 * 
 */
package com.weebly.gaborcsikos.design_patterns.behavioral.state;

/**
 * @author Gabor Csikos
 * 
 */
public class EmulatorStopState implements State {
	private final GamingSystem system;

	public EmulatorStopState(GamingSystem system) {
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
		system.setState(system.getEmulatorStartedState());

	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see
	 * com.weebly.gaborcsikos.design_patterns.behavioral.state.State#startGame()
	 */
	@Override
	public void startGame() {

	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see
	 * com.weebly.gaborcsikos.design_patterns.behavioral.state.State#stopGame()
	 */
	@Override
	public void stopGame() {

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

/**
 * 
 */
package com.weebly.gaborcsikos.design_patterns.behavioral.state;

/**
 * @author Gabor Csikos
 * 
 */
public interface State {

	void startEmulator();

	void startGame();

	void stopGame();

	void stopEmulator();
}

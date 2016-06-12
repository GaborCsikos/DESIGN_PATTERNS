/**
 * 
 */
package com.weebly.gaborcsikos.design_patterns.behavioral.statregy;

/**
 * @author Gabor Csikos
 * 
 */
public class GameWithSteps {

	private NextStep step = new NormalGame();

	public void setStep(NextStep step) {
		this.step = step;
	}

	public StepDifficultyForTesting calculateNextStep() {
		return step.calculateNextStep();
	}

}

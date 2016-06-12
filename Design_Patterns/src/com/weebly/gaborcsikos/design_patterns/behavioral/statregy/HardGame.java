/**
 * 
 */
package com.weebly.gaborcsikos.design_patterns.behavioral.statregy;

/**
 * @author Gabor Csikos
 * 
 */
public class HardGame implements NextStep {

	/*
	 * (non-Javadoc)
	 * 
	 * @see com.weebly.gaborcsikos.design_patterns.behavioral.statregy.NextStep#
	 * calculateNextStep()
	 */
	@Override
	public StepDifficultyForTesting calculateNextStep() {
		return StepDifficultyForTesting.HARD_STEP;
	}

}

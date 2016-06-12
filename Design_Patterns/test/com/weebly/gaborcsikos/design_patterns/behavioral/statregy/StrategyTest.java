/**
 * 
 */
package com.weebly.gaborcsikos.design_patterns.behavioral.statregy;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

/**
 * @author Gabor Csikos
 * 
 */
public class StrategyTest {

	private final GameWithSteps game = new GameWithSteps();

	@Test
	public void test() {
		assertEquals(StepDifficultyForTesting.NORMAL_STEP,
				game.calculateNextStep());

		game.setStep(new HardGame());
		assertEquals(StepDifficultyForTesting.HARD_STEP,
				game.calculateNextStep());

		game.setStep(new NormalGame());
		assertEquals(StepDifficultyForTesting.NORMAL_STEP,
				game.calculateNextStep());
	}

}

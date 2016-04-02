/**
 * 
 */
package com.weebly.gaborcsikos.design_patterns.creational.builder;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

/**
 * @author Gabor Csikos
 * 
 */
public class BuilderForNutritionTest {

	@Test
	public void testRequired() {
		BuilderForNutrition builder = new BuilderForNutrition.Builder(10, 20,
				30).build();

		assertEquals(10, builder.getProtein());
		assertEquals(20, builder.getCarbohydrate());
		assertEquals(30, builder.getFat());
	}

	@Test
	public void testOptional() {
		BuilderForNutrition builder = new BuilderForNutrition.Builder(10, 20,
				30).calories(500).build();

		assertEquals(10, builder.getProtein());
		assertEquals(20, builder.getCarbohydrate());
		assertEquals(30, builder.getFat());
		assertEquals(500, builder.getCalories());
		assertEquals(0, builder.getSodium());
		assertEquals(0, builder.getWeightInGramm());
	}
}

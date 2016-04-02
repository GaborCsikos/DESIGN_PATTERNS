/**
 * 
 */
package com.weebly.gaborcsikos.design_patterns.creational.builder;

/**
 * @author Gabor Csikos
 * 
 */
public class BuilderForNutrition {

	// parameters
	private final int protein;
	private final int carbohydrate;
	private final int fat;
	private final int calories;
	private final int sodium;
	private final int weightInGramm;

	public static class Builder {
		// Required parameters
		private final int protein;
		private final int carbohydrate;
		private final int fat;

		// Optional parameters - initialized to default values
		private int calories = 0;
		private int sodium = 0;
		private int weightInGramm;

		public Builder(int protein, int carbohydrate, int fat) {
			this.protein = protein;
			this.carbohydrate = carbohydrate;
			this.fat = fat;
		}

		public Builder calories(int caloriesParam) {
			calories = caloriesParam;
			return this;
		}

		public Builder sodium(int sodiumParam) {
			sodium = sodiumParam;
			return this;
		}

		public Builder weightInGramm(int weightInGrammParam) {
			weightInGramm = weightInGrammParam;
			return this;
		}

		public BuilderForNutrition build() {
			return new BuilderForNutrition(this);
		}
	}

	private BuilderForNutrition(Builder builder) {
		protein = builder.protein;
		carbohydrate = builder.carbohydrate;
		fat = builder.fat;
		calories = builder.calories;
		sodium = builder.sodium;
		weightInGramm = builder.weightInGramm;
	}

	// just getters
	public int getProtein() {
		return protein;
	}

	public int getCarbohydrate() {
		return carbohydrate;
	}

	public int getFat() {
		return fat;
	}

	public int getCalories() {
		return calories;
	}

	public int getSodium() {
		return sodium;
	}

	public int getWeightInGramm() {
		return weightInGramm;
	}
}

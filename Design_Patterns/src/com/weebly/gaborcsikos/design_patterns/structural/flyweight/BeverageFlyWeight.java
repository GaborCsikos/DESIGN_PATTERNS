/**
 * 
 */
package com.weebly.gaborcsikos.design_patterns.structural.flyweight;

import java.util.HashMap;
import java.util.Map;

/**
 * @author Gabor Csikos
 * 
 */
public class BeverageFlyWeight {

	private final Map<BeverageType, Beverage> beverages = new HashMap<BeverageType, Beverage>();
	private int served = 0;

	public Beverage serveBeverage(BeverageType type) {
		Beverage beverage = beverages.get(type);
		if (beverage == null) {
			beverage = createBeverage(type);
			beverages.put(type, beverage);
		}
		served++;
		return beverage;
	}

	public int getServed() {
		return served;
	}

	// basically this is a factory
	private Beverage createBeverage(BeverageType type) {
		if (BeverageType.TEE.equals(type)) {
			return new Tee();
		} else if (BeverageType.COFEE.equals(type)) {
			return new Coffee();
		}
		return null;
	}

}

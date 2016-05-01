package com.weebly.gaborcsikos.design_patterns.structural.flyweight;

public abstract class Beverage {

	private final String name;
	private final int price;

	public Beverage(String name, int price) {
		this.name = name;
		this.price = price;
	}

	public String getName() {
		return name;
	}

	public int getPrice() {
		return price;
	}

}

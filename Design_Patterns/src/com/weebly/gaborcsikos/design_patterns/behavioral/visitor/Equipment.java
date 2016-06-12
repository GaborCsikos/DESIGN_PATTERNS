package com.weebly.gaborcsikos.design_patterns.behavioral.visitor;

public class Equipment {

	public static final int MAX_LEVEL = 10; // for testing

	private int level = 1;

	public int getLevel() {
		return level;
	}

	public void upgrade() {
		level++;
	}

	public void upgradeTomax() {
		level = MAX_LEVEL;
	}

}

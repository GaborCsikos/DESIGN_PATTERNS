/**
 * 
 */
package com.weebly.gaborcsikos.design_patterns.behavioral.visitor;

/**
 * @author Gabor Csikos
 * 
 */
public class Armor extends Equipment implements EquipmentVisitor {

	private int defense = 1;

	public int getDefense() {
		return defense;
	}

	@Override
	public void upgrade(Equipment e) {
		e.upgrade();
		defense++;
	}

	@Override
	public void upgradeMax(Equipment e) {
		e.upgradeTomax();
		defense = Equipment.MAX_LEVEL;
	}

}

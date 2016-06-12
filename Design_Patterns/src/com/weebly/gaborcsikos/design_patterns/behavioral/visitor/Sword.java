/**
 * 
 */
package com.weebly.gaborcsikos.design_patterns.behavioral.visitor;

/**
 * @author Gabor Csikos
 * 
 */
public class Sword extends Equipment implements EquipmentVisitor {

	private int attack = 1;

	public int getAttack() {
		return attack;
	}

	@Override
	public void upgrade(Equipment e) {
		e.upgrade();
		attack++;

	}

	@Override
	public void upgradeMax(Equipment e) {
		e.upgradeTomax();
		attack = Equipment.MAX_LEVEL;

	}

}

/**
 * 
 */
package com.weebly.gaborcsikos.design_patterns.behavioral.visitor;

/**
 * @author Gabor Csikos
 * 
 */
public class Shield extends Equipment implements EquipmentVisitor {

	private int block = 1;

	public int getBlock() {
		return block;
	}

	@Override
	public void upgrade(Equipment e) {
		e.upgrade();
		block++;

	}

	@Override
	public void upgradeMax(Equipment e) {
		e.upgradeTomax();
		block = Equipment.MAX_LEVEL;
	}

}

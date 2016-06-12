/**
 * 
 */
package com.weebly.gaborcsikos.design_patterns.behavioral.visitor;

/**
 * @author Gabor Csikos
 * 
 */
public class EquipmentVisitorUpgrade implements EquipmentVisitor {

	@Override
	public void upgrade(Equipment e) {
		e.upgrade();

	}

	@Override
	public void upgradeMax(Equipment e) {
		e.upgradeTomax();
	}

}

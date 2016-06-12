/**
 * 
 */
package com.weebly.gaborcsikos.design_patterns.behavioral.visitor;

import java.util.ArrayList;
import java.util.List;

/**
 * @author Gabor Csikos
 * 
 */
public class Hero {

	private final List<Equipment> equipments = new ArrayList<Equipment>();
	private final EquipmentVisitor visitor = new EquipmentVisitorUpgrade();

	public List<Equipment> getEquipments() {
		return equipments;
	}

	public void upgrade() {
		for (Equipment e : equipments) {
			visitor.upgrade(e);
		}
	}

	public void upgradeToMax() {
		for (Equipment e : equipments) {
			visitor.upgradeMax(e);
		}
	}
}

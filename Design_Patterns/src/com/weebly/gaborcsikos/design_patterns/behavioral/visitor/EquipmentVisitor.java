/**
 * 
 */
package com.weebly.gaborcsikos.design_patterns.behavioral.visitor;

/**
 * @author Gabor Csikos
 * 
 */
public interface EquipmentVisitor {

	void upgrade(Equipment e);

	void upgradeMax(Equipment e);
}

/**
 * 
 */
package com.weebly.gaborcsikos.design_patterns.behavioral.visitor;

import static com.weebly.gaborcsikos.design_patterns.behavioral.visitor.Equipment.MAX_LEVEL;
import static org.junit.Assert.assertEquals;

import org.junit.Test;

/**
 * @author Gabor Csikos
 * 
 */
public class VisitorTest {

	private final Hero hero = new Hero();

	@Test
	public void test() {
		for (Equipment e : hero.getEquipments()) {
			if (e instanceof Armor) {
				assertEquals(1, (((Armor) e).getDefense()));
			} else if (e instanceof Sword) {
				assertEquals(1, (((Sword) e).getAttack()));
			} else if (e instanceof Shield) {
				assertEquals(1, (((Shield) e).getBlock()));
			}
			assertEquals(1, e.getLevel());
		}

		hero.upgrade();

		for (Equipment e : hero.getEquipments()) {
			if (e instanceof Armor) {
				assertEquals(2, (((Armor) e).getDefense()));
			} else if (e instanceof Sword) {
				assertEquals(2, (((Sword) e).getAttack()));
			} else if (e instanceof Shield) {
				assertEquals(2, (((Shield) e).getBlock()));
			}
			assertEquals(2, e.getLevel());
		}

		hero.upgradeToMax();

		for (Equipment e : hero.getEquipments()) {
			if (e instanceof Armor) {
				assertEquals(MAX_LEVEL, (((Armor) e).getDefense()));
			} else if (e instanceof Sword) {
				assertEquals(MAX_LEVEL, (((Sword) e).getAttack()));
			} else if (e instanceof Shield) {
				assertEquals(MAX_LEVEL, (((Shield) e).getBlock()));
			}
			assertEquals(MAX_LEVEL, e.getLevel());
		}
	}
}

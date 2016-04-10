/**
 * 
 */
package com.weebly.gaborcsikos.design_patterns.structural.composite;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

/**
 * @author Gabor Csikos
 * 
 */
public class CompositeTest {

	@Test
	public void test() {
		Graphic line = new Line();
		assertEquals(Line.LINE, line.draw());

		Graphic rectangle = new Rectangle();
		assertEquals(Rectangle.RECTANGLE, rectangle.draw());

		GraphicItemGroup group = new GraphicItemGroup();
		group.getElements().add(line);
		group.getElements().add(rectangle);

		// The group is treated like a component, the power of composite
		Graphic graphic = group;
		assertEquals(Line.LINE + Rectangle.RECTANGLE, graphic.draw());
		assertEquals(2, ((GraphicItemGroup) graphic).getElements().size());
	}

}

/**
 * 
 */
package com.weebly.gaborcsikos.design_patterns.structural.composite;

import java.util.ArrayList;
import java.util.List;

/**
 * @author Gabor Csikos
 * 
 */
public class GraphicItemGroup implements Graphic {

	private final List<Graphic> elements = new ArrayList<Graphic>();

	/*
	 * (non-Javadoc)
	 * 
	 * @see
	 * com.weebly.gaborcsikos.design_patterns.structural.composite.Graphic#draw
	 * ()
	 */
	@Override
	public String draw() {
		StringBuilder sb = new StringBuilder();
		for (Graphic element : elements) {
			sb.append(element.draw());
		}
		return sb.toString();
	}

	public List<Graphic> getElements() {
		return elements;
	}
}

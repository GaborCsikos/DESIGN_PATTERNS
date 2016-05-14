/**
 * 
 */
package com.weebly.gaborcsikos.design_patterns.behavioral.Iterator;

import java.util.Iterator;

/**
 * @author Gabor Csikos
 * 
 */
public class NameIterator implements Iterator<Name> {

	private static final Name[] names = { new Name("Aizhan", "Csikos"),
			new Name("Szabina", "Csikos"), new Name("Gabor", "Csikos") };
	private int index;

	@Override
	public boolean hasNext() {
		if (index < names.length) {
			return true;
		}
		return false;
	}

	@Override
	public Name next() {
		if (this.hasNext()) {
			return names[index++];
		}
		return null;
	}

	public Name[] getNames() {
		return names;
	}
}

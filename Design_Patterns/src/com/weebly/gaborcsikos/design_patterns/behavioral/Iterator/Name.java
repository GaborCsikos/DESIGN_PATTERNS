/**
 * 
 */
package com.weebly.gaborcsikos.design_patterns.behavioral.Iterator;

import java.util.Iterator;

/**
 * @author Gabor Csikos
 * 
 */
public class Name implements Iterable<Name> {

	private final String firstName;
	private final String lastName;

	public Name(String firstName, String lastName) {
		super();
		this.firstName = firstName;
		this.lastName = lastName;
	}

	public String getFirstName() {
		return firstName;
	}

	public String getLastName() {
		return lastName;
	}

	@Override
	public Iterator<Name> iterator() {
		return new NameIterator();
	}
}

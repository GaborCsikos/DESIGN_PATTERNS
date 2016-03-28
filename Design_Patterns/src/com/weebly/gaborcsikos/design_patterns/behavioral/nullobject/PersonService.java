/**
 * 
 */
package com.weebly.gaborcsikos.design_patterns.behavioral.nullobject;

/**
 * @author Gabor Csikos
 * 
 */
public class PersonService {

	// For testing
	public static final String NAME = "Szabina";
	private boolean found = true;

	public Person getPerson() {
		if (found) {
			return new Person(NAME);
		}
		// here instead of return null use Null Object pattern
		return new NullObject();
	}

	public boolean isFound() {
		return found;
	}

	public void setFound(boolean found) {
		this.found = found;
	}
}

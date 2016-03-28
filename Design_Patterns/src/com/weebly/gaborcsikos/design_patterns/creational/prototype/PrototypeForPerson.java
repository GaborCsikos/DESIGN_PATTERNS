/**
 * 
 */
package com.weebly.gaborcsikos.design_patterns.creational.prototype;

/**
 * Object implements the {@link Cloneable} interface
 * 
 * @author Gabor Csikos
 * 
 */
public class PrototypeForPerson {

	private String name;
	private long id;

	public PrototypeForPerson(String name, long id) {
		super();
		this.name = name;
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	// the heart of the prototype pattern
	// use the default cloning
	@Override
	protected PrototypeForPerson clone() throws CloneNotSupportedException {
		return (PrototypeForPerson) super.clone();
	}
}

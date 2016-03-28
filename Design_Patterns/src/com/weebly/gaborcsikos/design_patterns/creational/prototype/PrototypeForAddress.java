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
public class PrototypeForAddress {

	private String city;
	private String street;
	private String houseNumber;

	// We don't want to clone this
	private String addressCardId;

	public PrototypeForAddress(String city, String street, String houseNumber,
			String addressCardId) {
		super();
		this.city = city;
		this.street = street;
		this.houseNumber = houseNumber;
		this.addressCardId = addressCardId;
	}

	// the heart of the prototype pattern
	@Override
	public PrototypeForAddress clone() {
		return new PrototypeForAddress(this.city, this.street,
				this.houseNumber, null);
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public String getStreet() {
		return street;
	}

	public void setStreet(String street) {
		this.street = street;
	}

	public String getHouseNumber() {
		return houseNumber;
	}

	public void setHouseNumber(String houseNumber) {
		this.houseNumber = houseNumber;
	}

	public String getAddressCardId() {
		return addressCardId;
	}

	public void setAddressCardId(String addressCardId) {
		this.addressCardId = addressCardId;
	}

}

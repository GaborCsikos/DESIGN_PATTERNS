/**
 * 
 */
package com.weebly.gaborcsikos.design_patterns.structural.facade;

/**
 * @author Gabor Csikos
 * 
 */
public class FullInformationFacadeImpl implements FullInformationFacade {

	private final PersonService personService;
	private final AddressService addressService;

	public FullInformationFacadeImpl(PersonService personService,
			AddressService addressService) {
		super();
		this.personService = personService;
		this.addressService = addressService;
	}

	@Override
	public String loadNameAndAddressById(long personId, long AddressId) {
		String first = personService.loadFullnameByPersonId(personId);
		String second = addressService.loadFullAddressById(AddressId);
		return first + second;
	}

}

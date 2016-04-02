/**
 * 
 */
package com.weebly.gaborcsikos.design_patterns.structural.facade;

/**
 * @author Gabor Csikos
 * 
 */
public interface FullInformationFacade {

	String loadNameAndAddressById(long personId, long AddressId);
}

/**
 * 
 */
package com.weebly.gaborcsikos.design_patterns.structural.bridge;

/**
 * @author Gabor Csikos This is one implementation, but instead of extending
 *         {@link Window} directly, use the bridge. Now {@link Window} can be
 *         modified as we want. This class is only dependent from
 *         {@link WindowImpl}
 */
public class LinuxWindow extends WindowImpl {

	public static final String LINUX = "Linux"; // for testing only

	@Override
	String draw() {
		return LINUX;
	}

}

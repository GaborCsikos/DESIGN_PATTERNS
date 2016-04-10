/**
 * 
 */
package com.weebly.gaborcsikos.design_patterns.structural.bridge;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

/**
 * @author Gabor Csikos
 * 
 */
public class BridgeTest {

	private final IconWindow window = new IconWindow();;
	private final WindowImpl windows = new WindowsWindow();
	private final WindowImpl linux = new LinuxWindow();

	@Test
	public void testBridgeAtRuntime() {
		window.setWindow(windows);
		assertEquals(WindowsWindow.WINDOWS, window.draw());

		// change the window at runtime
		window.setWindow(linux);
		assertEquals(LinuxWindow.LINUX, window.draw());

		// this implementation is independent
		assertEquals(IconWindow.ICON, window.drawIcon());
	}

}

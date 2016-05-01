/**
 * 
 */
package com.weebly.gaborcsikos.design_patterns.structural.proxy;

/**
 * @author Gabor Csikos
 * 
 */
public class ImageProxy {

	private Image image;

	public Image getImage() {
		if (image == null) {
			image = new Image();
		}
		return image;
	}
}

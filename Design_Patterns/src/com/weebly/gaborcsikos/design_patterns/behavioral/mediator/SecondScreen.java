/**
 * 
 */
package com.weebly.gaborcsikos.design_patterns.behavioral.mediator;

/**
 * @author Gabor Csikos
 * 
 */
public class SecondScreen implements SelectedItemOnScreen {

	private String inputText;

	@Override
	public void itemSelected(String item) {
		inputText = item;

	}

	public String getInputText() {
		return inputText;
	}

}

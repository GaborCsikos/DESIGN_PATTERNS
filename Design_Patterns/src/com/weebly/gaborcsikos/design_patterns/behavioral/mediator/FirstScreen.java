/**
 * 
 */
package com.weebly.gaborcsikos.design_patterns.behavioral.mediator;

/**
 * @author Gabor Csikos
 * 
 */
public class FirstScreen implements SelectedItemOnScreen {

	private String inputText;

	@Override
	public void itemSelected(String item) {
		inputText = item;
	}

	@Override
	public String getInputText() {
		return inputText;
	}

}

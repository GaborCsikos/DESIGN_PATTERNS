/**
 * 
 */
package com.weebly.gaborcsikos.design_patterns;

/**
 * @author Gabor Csikos
 * 
 */
public class Controller {

	private final Model model;
	private final View view;

	public Controller(Model model, View view) {
		super();
		this.model = model;
		this.view = view;
	}

	public void increaseCounder() {
		model.setCounter(model.getCounter() + 1);
		updateCounter();
	}

	private void updateCounter() {
		view.updateCounder(String.valueOf(model.getCounter()));
	}

}

package com.weebly.gaborcsikos.design_patterns.behavioral.mediator;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * 
 * @author Gabor Csikos
 * 
 */
public class Mediator {

	private String selectedItem;
	private final List<String> selectebleItems = new ArrayList<String>(
			Arrays.asList(ItemsForSelection.ONE.name(),
					ItemsForSelection.TWO.name(),
					ItemsForSelection.THREE.name()));

	private SelectedItemOnScreen screen;

	public String getSelectedItem() {
		return selectedItem;
	}

	public void setItem(int itemNumber) {
		String item = selectebleItems.get(itemNumber);
		if (item != null) {
			screen.itemSelected(item);
		}
	}

	public void setScreen(SelectedItemOnScreen screen) {
		this.screen = screen;
	}

}

/**
 * 
 */
package com.weebly.gaborcsikos.design_patterns.behavioral.command;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

/**
 * Unit tests of {@link Command}
 * 
 * @author Gabor Csikos
 * 
 */
public class CommandTest {

	private static final String SAMPLE_1 = "Sample 1";
	private static final String SAMPLE_2 = "Sample 2";
	private static final String CLEARED = "";

	private final TextEditor editor = new TextEditor();

	@Test
	public void testUndo() {
		editor.setText(SAMPLE_1);
		editor.executeAction(new ClearTextCommand(editor));
		assertEquals(CLEARED, editor.getText());
		editor.undo();
		assertEquals(SAMPLE_1, editor.getText());
		editor.executeAction(new ClearTextCommand(editor));
		assertEquals(CLEARED, editor.getText());
		editor.undo();
		assertEquals(SAMPLE_1, editor.getText());
	}

	@Test
	public void testAdd() {
		editor.setText(SAMPLE_1);
		editor.executeAction(new AddTextCommand(editor, SAMPLE_2));
		assertEquals(SAMPLE_1 + SAMPLE_2, editor.getText());
		editor.undo();
		assertEquals(SAMPLE_1, editor.getText());
		editor.executeAction(new AddTextCommand(editor, SAMPLE_2));
		assertEquals(SAMPLE_1 + SAMPLE_2, editor.getText());
		editor.executeAction(new AddTextCommand(editor, SAMPLE_2));
		assertEquals(SAMPLE_1 + SAMPLE_2 + SAMPLE_2, editor.getText());
		editor.undo();
		assertEquals(SAMPLE_1 + SAMPLE_2, editor.getText());
		editor.undo();
		assertEquals(SAMPLE_1, editor.getText());
	}

	@Test
	public void testAddAndUndo() {
		editor.setText(SAMPLE_1);
		editor.executeAction(new AddTextCommand(editor, SAMPLE_2));
		assertEquals(SAMPLE_1 + SAMPLE_2, editor.getText());
		editor.executeAction(new ClearTextCommand(editor));
		assertEquals(CLEARED, editor.getText());
		editor.undo();
		assertEquals(SAMPLE_1 + SAMPLE_2, editor.getText());
		editor.undo();
		assertEquals(SAMPLE_1, editor.getText());
	}
}

/**
 * 
 */
package com.weebly.gaborcsikos.design_patterns.behavioral.command;

/**
 * The Commands what we want to apply
 * 
 * @author Gabor Csikos
 * 
 */
public interface Command {

	void action();

	void undo();
}

package model.element.motionlessElement;

import common.Permeability;
import model.element.Element;

public class MotionlessElement extends Element {
	public MotionlessElement(char c, String name, Permeability penetrable) {
		super( c,name, penetrable );
	}
}

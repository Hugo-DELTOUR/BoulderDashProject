package model.element.motionlessElement;

import common.Permeability;
import common.Sprite;

public class Dirt extends MotionlessElement{
	
	

	public static final Sprite sprite = new Sprite('+', null);

	public Dirt() {
		super(sprite, Permeability.PENETRABLE);
	}
}

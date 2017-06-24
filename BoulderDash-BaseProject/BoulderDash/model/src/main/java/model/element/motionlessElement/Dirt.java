package model.element.motionlessElement;

import common.Permeability;
import common.Sprite;

public class Dirt extends MotionlessElement{
	
	

	public static final Sprite sprite = new Sprite('+', null/*TODO*/);

	public Dirt() {
		super(sprite, Permeability.PENETRABLE);
		// TODO Auto-generated constructor stub
	}
}

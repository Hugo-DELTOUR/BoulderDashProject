package model.element.motionlessElement;

import common.Permeability;
import common.Sprite;

public class Door extends MotionlessElement {


	public static final Sprite sprite = new Sprite('E', null/*TODO*/);


	public Door() {
		super(sprite, Permeability.PENETRABLE);
		// TODO Auto-generated constructor stub
	}

}

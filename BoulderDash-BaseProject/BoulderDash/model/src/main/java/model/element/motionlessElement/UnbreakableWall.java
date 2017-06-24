package model.element.motionlessElement;

import common.Permeability;
import common.Sprite;

public class UnbreakableWall extends MotionlessElement{

	

	public static final Sprite sprite = new Sprite('#', null/*TODO*/);
	
	public UnbreakableWall() {
		super(sprite, Permeability.IMMUNITY);
		// TODO Auto-generated constructor stub
	}
	
}

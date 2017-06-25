package model.element.motionlessElement;

import common.Permeability;
import common.Sprite;

public class UnbreakableWall extends MotionlessElement{

	

	public static final Sprite sprite = new Sprite('#', null);
	
	public UnbreakableWall() {
		super(sprite, Permeability.BLOCKING);
	}
	
}

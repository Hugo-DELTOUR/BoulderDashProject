package model.element.motionlessElement;

import common.Permeability;
import common.Sprite;

public class SpecialStoneBlock extends MotionlessElement{

	public static final Sprite sprite = new Sprite('W', null);
	
	public SpecialStoneBlock() {
		super(sprite, Permeability.BLOCKING);

	}



	
}

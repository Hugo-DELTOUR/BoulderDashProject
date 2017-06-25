package model.element.motionlessElement;

import common.Permeability;
import common.Sprite;

public class Wall extends MotionlessElement {

	

	public static final Sprite sprite = new Sprite('H', null);

	public Wall() {
		super(sprite, Permeability.BLOCKING);

	}
}

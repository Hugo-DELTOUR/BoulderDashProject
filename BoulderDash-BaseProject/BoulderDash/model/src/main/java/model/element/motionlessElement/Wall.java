package model.element.motionlessElement;

import common.Sprite;
import fr.exia.insanevehicles.shared.Permeability;

public class Wall extends MotionlessElement {

	

	public static final Sprite sprite = new Sprite('H', /*TODO*/);

	public Wall(Sprite sprite, common.Permeability permeability) {
		super(sprite, permeability);
		// TODO Auto-generated constructor stub
	}
}

package model.element.motionlessElement;

import common.Sprite;
import fr.exia.insanevehicles.shared.Permeability;

public class UnbreakableWall extends MotionlessElement{

	

	public static final Sprite sprite = new Sprite('#', /*TODO*/);
	
	public UnbreakableWall(Sprite sprite, common.Permeability permeability) {
		super(sprite, permeability);
		// TODO Auto-generated constructor stub
	}
	
}

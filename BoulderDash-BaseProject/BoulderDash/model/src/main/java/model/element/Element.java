package model.element;

import common.Permeability;
import common.Sprite;
import model.BoulderDashModel;
import model.IElement;

public class Element extends BoulderDashModel implements IElement{
	
	private Sprite sprite;
	private Permeability permeability;
	
	public Sprite getSprite() {
		return sprite;
	}
	public void setSprite(Sprite sprite) {
		this.sprite = sprite;
	}
	public Permeability getPermeability() {
		return permeability;
	}
	public void setPermeability(Permeability permeability) {
		this.permeability = permeability;
	}
	
}

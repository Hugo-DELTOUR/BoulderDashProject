package model;

import java.awt.Image;

import common.Permeability;
import common.Sprite;

public interface IElement {
	public Sprite getSprite();
	public Permeability getPermeability();
	public Image getImage();

}

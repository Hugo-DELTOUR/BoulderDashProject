package model;

import java.awt.Image;

import common.Permeability;
import common.Sprite;

public interface IElement {
	public Sprite getSprite();
	public Permeability getPermeability();
	public Image getImage();
	public void moveRight();
	public void moveUp();
	public void moveLeft();
	public void moveDown();
}

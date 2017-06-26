package model;

import java.awt.Image;

import common.Permeability;
import common.Sprite;

public interface IElement {
	public Sprite getSprite();
	public Permeability getPermeability();
	public Image getImage();
	public boolean isFalling();
	public void die();
	public void setFalling(boolean b);
	public boolean isAirEverywhere();
	public int getDirection();
	public void moveUp();
	public void moveLeft();
	public void moveDown();
	public void moveRight();

}

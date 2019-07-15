package Shared;

import java.awt.Image;

import fr.exia.showboard.ISquare;

public interface IElement extends ISquare{
	public Sprite getSprite();
	public Permeability getPermeability();
	public Image getImage();
}

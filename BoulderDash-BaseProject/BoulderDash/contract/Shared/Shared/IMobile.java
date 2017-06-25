package Shared;

import java.awt.Point;

import fr.exia.showboard.IPawn;

public interface IMobile extends IElement,IPawn {
	public void moveUp();
	public void moveDown();
	public void moveRight();
	public void moveLeft();
	public void doNothing();
	public int getX();
	public int getY();
	public Boolean isAlive();
	public Boolean isCrashed();
	public Point getPosition();
}

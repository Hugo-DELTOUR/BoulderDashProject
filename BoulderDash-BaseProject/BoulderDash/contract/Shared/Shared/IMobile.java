package Shared;

import java.awt.Point;

public interface IMobile extends IElement{
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

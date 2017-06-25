package model.element.mobileElement;

import common.Sprite;
import java.io.IOException;

import common.Permeability;

public class Rockford extends Mobile {

	private static Sprite spriteGoLeft;
	private static Sprite spriteGoRight;
	private static Sprite spriteGoUp;
	private static Sprite spriteGoDown;
	private static Sprite spriteExplode;
	final static int width = 16;
	final static int height = 16;

	
	
	public Rockford(int x, int y, Character character, String name, Permeability permeability) throws IOException {
		super(x, y, character, name, permeability);
		spriteGoUp.loadImage();//.getSubimage(5 * width, 2 * height, width, height);
		spriteGoDown.loadImage();//.getSubimage(5 * width, 0 * height, width, height);
		spriteGoLeft.loadImage();//.getSubimage(1 * width, 0 * height, width, height);
		spriteGoRight.loadImage();//.getSubimage(3 * width, 2 * height, width, height);
		spriteExplode.loadImage();//.getSubimage(0 * width, 3 * height, width, height);
	
		/**
		 * This is the constructor from "Rockford".
		 * It defines this as two int "x" and "y", as a character, as a name and as a permeability.
		 * Moreover it load the differents sprites for rockford.
		 */
	
	}

	public Rockford(){
		super();
	}
	

	public void doNothing(){
		this.getMap().setMobileHasChanged();
		/** 
		 * This method notifies the map that Rockford is not moving.
		 */
	}
	
	public void die(){
		this.setAlive(false);
		this.getMap().setMobileHasChanged();
		
		/** 
		 * This method sets the variable "alive" to false and notifies the map of the changement.
		 */
	}
	
	public void moveDown(){
		 this.setY(this.getY() + 1);
	     this.getMap().setMobileHasChanged();
		 this.setSprite(spriteGoDown);
		 
			/** 
			 * This method increments Y, 
			 * changes the sprite and notifies the map of the changement.
			 */

	}
	
	public void moveLeft(){
		this.setX(this.getX() - 1);
		this.getMap().setMobileHasChanged();
		this.setSprite(spriteGoLeft);
		
		/** 
		 * This method decrementsX, 
		 * changes the sprite and notifies the map of the changement.
		 */
	}
	
	public void moveRight(){
		 this.setX(this.getX() + 1);
		 this.getMap().setMobileHasChanged();
		 this.setSprite(spriteGoRight);

			/** 
			 * This method increments X, 
			 * changes the sprite and notifies the map of the changement.
			 */
	}
	
	public void moveUp(){
		this.setY(this.getY() - 1);
		this.getMap().setMobileHasChanged();
		this.setSprite(spriteGoUp);
		/** 
		 * This method decrements Y, 
		 * changes the sprite and notifies the map of the changement.
		 */

	}
	
}

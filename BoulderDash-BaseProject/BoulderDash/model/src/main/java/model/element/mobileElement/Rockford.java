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
	final static int rows = 5;
	final static int cols = 5;
	
	
	public Rockford(int x, int y, Character character, String name, Permeability permeability) throws IOException {
		super(x, y, character, name, permeability);
		spriteGoUp.loadImage();
		spriteGoDown.loadImage();
		spriteGoLeft.loadImage();
		spriteGoRight.loadImage();
		spriteExplode.loadImage();
	
		/**
		 * This is the constructor from "Rockford".
		 * It define this as two int "x" and "y", as a character, as a name and as a permeability.
		 * Moreover it load the differents sprites for rockford.
		 */
	
	}

	

	public void doNothing(){
		this.getMap().setMobileHasChanged();
		/** 
		 * This method notify the map that Rockford is not moving.
		 */
	}
	
	public void die(){
		this.setAlive(false);
		this.getMap().setMobileHasChanged();
		
		/** 
		 * This method set the variable "alive" to false and notify the map of the changement.
		 */
	}
	
	public void moveDown(){
		 this.setY(this.getY() + 1);
	     this.getMap().setMobileHasChanged();
		 this.setSprite(spriteGoDown);
		 
			/** 
			 * This method set increment Y, 
			 * change the sprite and notify the map of the changement.
			 */

	}
	
	public void moveLeft(){
		this.setX(this.getX() - 1);
		this.getMap().setMobileHasChanged();
		this.setSprite(spriteGoLeft);
		
		/** 
		 * This method set decrement X, 
		 * change the sprite and notify the map of the changement.
		 */
	}
	
	public void moveRight(){
		 this.setX(this.getX() + 1);
		 this.getMap().setMobileHasChanged();
		 this.setSprite(spriteGoRight);

			/** 
			 * This method set increment X, 
			 * change the sprite and notify the map of the changement.
			 */
	}
	
	public void moveUp(){
		this.setY(this.getY() - 1);
		this.getMap().setMobileHasChanged();
		this.setSprite(spriteGoUp);
		/** 
		 * This method set decrement Y, 
		 * change the sprite and notify the map of the changement.
		 */

	}
	
}

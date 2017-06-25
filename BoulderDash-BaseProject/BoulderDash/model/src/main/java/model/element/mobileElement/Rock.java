package model.element.mobileElement;

import java.io.IOException;

import common.Permeability;
import common.Sprite;

public class Rock extends Mobile {

	


	private static Sprite spriteAnim1;
	private static Sprite spriteAnim2;
	private static Sprite spriteAnim3;
	private static Sprite spriteAnim4;
	final static int width = 16;
	final static int height = 16;
	final static int rows = 5;
	final static int cols = 5;
	
	public Rock(int x, int y, Character character, String name, Permeability permeability) throws IOException {
		super(x, y, character, name, permeability);
		spriteAnim1.loadImage();
		spriteAnim2.loadImage();
		spriteAnim3.loadImage();
		spriteAnim4.loadImage();
		
		/**
		 * This is the constructor from "Rock".
		 * It define this as two int "x" and "y", as a character, as a name and as a permeability.
		 * Moreover it load the differents sprites for the rock.
		 */
	}
	

	
	
	public void doNothing(){
		this.getMap().setMobileHasChanged();
		/** 
		 * This method notify the map that the Rock is not moving.
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
		 this.setSprite(spriteAnim2);
		 
			/** 
			 * This method set increment Y, 
			 * change the sprite and notify the map of the changement.
			 */

	}
	
	public void moveLeft(){
		this.setX(this.getX() - 1);
		this.getMap().setMobileHasChanged();
	    this.setSprite(spriteAnim3);
		/** 
		 * This method set decrement X, 
		 * change the sprite and notify the map of the changement.
		 */
	}
	
	public void moveRight(){
		 this.setX(this.getX() + 1);
		 this.getMap().setMobileHasChanged();
		 this.setSprite(spriteAnim4);
			/** 
			 * This method set increment X, 
			 * change the sprite and notify the map of the changement.
			 */
	}
	

}

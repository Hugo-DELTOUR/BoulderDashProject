package model.element.mobileElement;

import java.io.IOException;

import common.Permeability;
import common.Sprite;

public class Diamond extends Mobile {
	
	
	private Sprite spriteAnim1;
	private Sprite spriteAnim2;
	private Sprite spriteAnim3;
	private Sprite spriteAnim4;
	final static int width = 16;
	final static int height = 16;
	final static int cols = 4;


		
	
	public Diamond(int x, int y, Character character, String name, Permeability permeability) throws IOException {
		super(x, y, character, name, permeability);
		spriteAnim1.loadImage();//.getSubimage(0 * width, cols * height, width, height);
		spriteAnim2.loadImage();//.getSubimage(1 * width, cols * height, width, height);
		spriteAnim3.loadImage();//.getSubimage(2 * width, cols * height, width, height);
		spriteAnim4.loadImage();//.getSubimage(3 * width, cols * height, width, height);
		
		/**
		 * This is the constructor from "Diamond".
		 * It defines this as two int "x" and "y", as a character, as a name and as a permeability.
		 * Moreover it load the differents sprites for the diamond.
		 */

		
	}
	
	public void doNothing(){
		this.getMap().setMobileHasChanged();

		
		/** 
		 * This method notifies the map that the Diamond is not moving.
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
		 * This method increments Y ,
		 * changes the sprite and notifies the map of the changement.
		 */

	}
	
	public void moveLeft(){
		 this.setX(this.getX() - 1);
		 this.getMap().setMobileHasChanged();
	     this.setSprite(spriteAnim3);
	     
			/** 
			 * This method decrements X ,
			 * changes the sprite and notifies the map of the changement.
			 */

	     
	}
	
	public void moveRight(){
		this.setX(this.getX() + 1);
		this.getMap().setMobileHasChanged();
        this.setSprite(spriteAnim4);
        
		/** 
		 * This method increments X ,
		 * changes the sprite and notifies the map of the changement.
		 */


	}
}

package model.element.mobileElement;

import java.io.IOException;

import common.Permeability;
import common.Sprite;
import common.UserOrder;

public class Ennemy extends Mobile {



	private static Sprite spriteAnim1;
	private static Sprite spriteAnim2;
	private static Sprite spriteAnim3;
	private static Sprite spriteAnim4;
	private static Sprite spriteExplode;


	private UserOrder direction;

	
	public Ennemy(int x, int y, Character character, String name, Permeability permeability) throws IOException {
		super(x, y, character, name, permeability);

	
		/**
		 * This is the constructor from "Ennemy".
		 * It defines this as two int "x" and "y", as a character, as a name and as a permeability.
		 * Moreover it load the differents sprites for the Ennemy.
		 */
	
	
	} 
	

	public Ennemy(){
		
	}
	
	
	public void doNothing(){
		this.getMap().setMobileHasChanged();
		/** 
		 * This method notifies the map that the Ennemy is not moving.
		 */
	}
	
	public void die(){
	    this.setSprite(spriteExplode);
	    this.setAlive(false);
	    this.getMap().setMobileHasChanged();
	    
		/** 
		 * This method sets the variable "alive" to false and notifies the map of the changement.
		 * It also changes the Sprite of the Ennemy.
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
	
	public void moveUp(){
		 this.setY(this.getY() - 1);
		 this.getMap().setMobileHasChanged();
	     this.setSprite(spriteAnim1);
	     
			/** 
			 * This method decrements Y ,
			 * changes the sprite and notifies the map of the changement.
			 */

	     
	}
	
	


	public UserOrder getDirection() {
		return direction;
		
		/** 
		 * This is the getter of the variable "direction".
		 */
	}


	public void setDirection(UserOrder direction) {
		this.direction = direction;
		/** 
		 * This is the setter of the variable "direction".
		 */
	}

	
	
}

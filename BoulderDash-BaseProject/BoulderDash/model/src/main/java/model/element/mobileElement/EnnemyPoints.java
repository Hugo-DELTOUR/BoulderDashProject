package model.element.mobileElement;

import java.io.IOException;

import common.Permeability;
import common.Sprite;
import common.UserOrder;

public class EnnemyPoints extends Ennemy{
	


	private static Sprite spriteAnim1;
	private static Sprite spriteAnim2;
	private static Sprite spriteAnim3;
	private static Sprite spriteAnim4;
	private UserOrder direction;
	
	
	public EnnemyPoints(int x, int y, Character character, String name, Permeability permeability) throws IOException {
		super(x, y, character, name, permeability);
		spriteAnim1.loadImage();
		spriteAnim2.loadImage();
		spriteAnim3.loadImage();
		spriteAnim4.loadImage();	
		
		/**
		 * This is the constructor from "EnnemyPoints".
		 * It define this as two int "x" and "y", as a character, as a name and as a permeability.
		 * Moreover it load the differents sprites for the EnnemyPoints.
		 */
		
		}
	
	
	public void loot(){
		
	}
	
	public void doNothing(){
		this.getMap().setMobileHasChanged();
		/** 
		 * This method notify the map that the EnnemyPoints is not moving.
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
			 * This method sets increment Y ,
			 * changes the sprite and notifies the map of the changement.
			 */


	}
	
	public void moveLeft(){
		this.setX(this.getX() - 1);
		this.getMap().setMobileHasChanged();
	    this.setSprite(spriteAnim3);
		/** 
		 * This method sets decrement X ,
		 * changes the sprite and notifies the map of the changement.
		 */

	}
	
	public void moveRight(){
		 this.setX(this.getX() + 1);
		 this.getMap().setMobileHasChanged();
		 this.setSprite(spriteAnim4);
		 
			/** 
			 * This method sets incrementcrement X ,
			 * changes the sprite and notifies the map of the changement.
			 */

	}
	
	public void moveUp(){
		this.setY(this.getY() - 1);
		this.getMap().setMobileHasChanged();
	    this.setSprite(spriteAnim1);
	    
		/** 
		 * This method sets decrement Y ,
		 * changes the sprite and notifies the map of the changement.
		 */

	}
	
	public UserOrder getDirection() {
		return direction;
	}


	public void setDirection(UserOrder direction) {
		this.direction = direction;
	}
	
}

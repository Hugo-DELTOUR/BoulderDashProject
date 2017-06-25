package model.element.mobileElement;

import java.awt.Image;
import common.Permeability;
import model.IMap;
import model.IMobile;
import model.element.Element;

public class Mobile extends Element  implements IMobile{


	private Boolean alive;
	private IMap map;
	private char consoleImage;
	private Image image;

	public Mobile(int x, int y , final Character character, final String name , final Permeability permeability) {
		super(character, name, permeability);
		this.setX(x);
		this.setY(y);	
		
		/**
		 * This is the constructor from "Diamond".
		 * It defines this as two int "x" and "y", as a character, as a name and as a permeability.
		 * Moreover it sets the two coordinates "x" and "y".
		 */
	}
	
	public char getConsoleImage() {
		return consoleImage;
		
		/** 
		 * This is the getter of the variable "consoleImage".
		 */
	}

	public void setConsoleImage(char consoleImage) {
		this.consoleImage = consoleImage;
		
		/** 
		 * This is the setter of the variable "consoleImage".
		 */
	}

	public IMap getMap() {
		return map;
		/** 
		 * This is the getter of the variable "map".
		 */
	}
	public void setMap(IMap map) {
		this.map = map;
		/** 
		 * This is the setter of the variable "map".
		 */
	}
	
	public void doNothing(){
        this.getMap().setMobileHasChanged();
        
		/** 
		 * This method notifies the map that the Mobile is not moving.
		 */
	}
	
	public Boolean isAlive(){
		return this.alive;
		/** 
		 * This is the setter of the variable "alive".
		 */
	}
	
	public Boolean setAlive(Boolean alive){
		return this.alive = alive;
		
		/** 
		 * This is the getter of the variable "alive".
		 */
	}
	
	public void die(){
		this.setAlive(false);
        this.getMap().setMobileHasChanged();
        
		/** 
		 * This method sets the variable "alive" to false and notifies the map of the changement.
		 */
	}
	
	public Boolean isCrashed(){
		return this.getMap().getOnTheMapXY(this.getX(), this.getY()).getPermeability() == Permeability.BLOCKING;
	}
	
	public void moveUp(){
        this.setY(this.getY() - 1);
        this.getMap().setMobileHasChanged();
		/** 
		 * This method increments X and notifies the map of the changement.
		 */
	}
	
	public void moveDown(){
        this.setY(this.getY() + 1);
        this.getMap().setMobileHasChanged();
		/** 
		 * This method increments Y and notifies the map of the changement.
		 */
        
	}
	
	public void moveLeft(){
        this.setX(this.getX() - 1);
        this.getMap().setMobileHasChanged();
		/** 
		 * This method decrements Y and notifies the map of the changement.
		 */
	}
	
	public void moveRight(){
        this.setX(this.getX() + 1);
        this.getMap().setMobileHasChanged();
		/** 
		 * This method increments X and notifies the map of the changement.
		 */
	}
	
	
	@Override
	public Image getImage() {
		return this.image;	
		/** 
		 * This is the getter of the variable "image".
		 */
	}
	

	
}

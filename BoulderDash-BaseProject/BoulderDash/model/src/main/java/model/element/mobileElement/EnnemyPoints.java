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
		spriteAnim4.loadImage();	}
	
	
	public void loot(){
		
	}
	
	public void doNothing(){
		this.getMap().setMobileHasChanged();
	}
	
	public void die(){
		this.setAlive(false);
		this.getMap().setMobileHasChanged();
	}
	
	public void moveDown(){
		 this.setY(this.getY() + 1);
		 this.getMap().setMobileHasChanged();
		 this.setSprite(spriteAnim2);

	}
	
	public void moveLeft(){
		this.setX(this.getX() - 1);
		this.getMap().setMobileHasChanged();
	    this.setSprite(spriteAnim3);

	}
	
	public void moveRight(){
		 this.setX(this.getX() + 1);
		 this.getMap().setMobileHasChanged();
		 this.setSprite(spriteAnim4);

	}
	
	public void moveUp(){
		this.setY(this.getY() - 1);
		this.getMap().setMobileHasChanged();
	    this.setSprite(spriteAnim1);

	}
	
	public UserOrder getDirection() {
		return direction;
	}


	public void setDirection(UserOrder direction) {
		this.direction = direction;
	}
	
}

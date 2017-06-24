package model.element.mobileElement;

import java.io.IOException;

import javax.swing.text.Position;

import common.Permeability;
import common.Sprite;
import common.UserOrder;
import model.IMap;

public class EnnemyDiamonds extends Ennemy  {
	
	private static Sprite spriteAnim1;
	private static Sprite spriteAnim2;
	private static Sprite spriteAnim3;
	private static Sprite spriteAnim4;
	private UserOrder direction;
	
	
	public EnnemyDiamonds(int x, int y, IMap map) throws IOException{
		super(x,y, spriteAnim2, map);
		spriteAnim1.loadImage();
		spriteAnim2.loadImage();
		spriteAnim3.loadImage();
		spriteAnim4.loadImage();
		
	}
	
	
	public void loot(){
		if (this.isAlive() == false){
			//Diamond();
		}
	}
	
	public void doNothing(){
		this.getMap().setMobileHasChanged();
	    this.setSprite(spriteAnim1);		// Becareful, conflict with spriteAnim1

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

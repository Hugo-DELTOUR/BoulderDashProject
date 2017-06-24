package model.element.mobileElement;

import java.io.File;
import java.io.IOException;

import javax.imageio.ImageIO;
import javax.swing.text.Position;

import common.Permeability;
import common.Sprite;
import common.UserOrder;
import model.IMap;

public class Ennemy extends Mobile {

	private static Sprite spriteAnim1;
	private static Sprite spriteAnim2;
	private static Sprite spriteAnim3;
	private static Sprite spriteAnim4;
	private static Sprite spriteExplode;
	final static int width = 16;
	final static int height = 16;
	final static int rows = 5;
	final static int cols = 5;
	private UserOrder direction;
	
	public Ennemy(int x, int y, Sprite sprite, IMap map) throws IOException{
		super(x,y, new Sprite('@', ImageIO.read(new File("ress/74359.png")).getSubimage(cols * width, rows *height ,width,height)), map, Permeability.BLOCKING);
		this.setX(x);
		this.setY(y);
	}
	
	
	public void doNothing(){
		this.getMap().setMobileHasChanged();
	}
	
	public void die(){
	    this.setSprite(spriteExplode);
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

package model.element.mobileElement;

import java.awt.Point;

import common.Permeability;
import common.Sprite;
import model.IMap;

public class Ennemy extends Mobile {

	public static final Sprite sprite = new Sprite('@', null);
	private static Sprite spriteAnim1;
	private static Sprite spriteAnim2;
	private static Sprite spriteAnim3;
	private static Sprite spriteAnim4;
	private static Sprite spriteExplode;
	
	
	public Ennemy(int x, int y, Sprite sprite, IMap map){
		super(x,y, sprite, map, Permeability.BLOCKING);
	}
	
	
	public void doNothing(){
		 this.setMobileHasChanged();
	}
	
	public void die(){
	    this.setSprite(spriteExplode);
	    this.setAlive(false);
        this.setMobileHasChanged();
	}
	
	public void moveDown(){
		 this.setY(this.getY() + 1);
	     this.setMobileHasChanged();
		 this.setSprite(spriteAnim2);

	}
	
	public void moveLeft(){
		this.setX(this.getX() - 1);
        this.setMobileHasChanged();
	    this.setSprite(spriteAnim3);

	}
	
	public void moveRight(){
		this.setX(this.getX() + 1);
        this.setMobileHasChanged();
	    this.setSprite(spriteAnim4);

	}
	
	public void moveUp(){
		 this.setY(this.getY() - 1);
	     this.setMobileHasChanged();
	     this.setSprite(spriteAnim1);
	     
	}
	
	public void direction(){
		
	}
	
	public Point position(){
		return null;
		
	}

	
	
}

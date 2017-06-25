package model.element.mobileElement;

import javax.swing.text.Position;

import common.Sprite;
import model.IMap;

public class EnnemyPoints extends Ennemy{
	
	private static Sprite spriteAnim1;
	private static Sprite spriteAnim2;
	private static Sprite spriteAnim3;
	private static Sprite spriteAnim4;
	
	
	public EnnemyPoints(int x, int y, IMap map){
		super(x,y, spriteAnim2, map);
		spriteAnim1.getImage();
		spriteAnim2.getImage();
		spriteAnim3.getImage();
		spriteAnim4.getImage();

	}
	
	
	public EnnemyPoints() {
		super();
	}


	public void loot(){
		
	}
	
	public void doNothing(){
		this.setMobileHasChanged();
	}
	
	public void die(){
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
	
	public Position position(){
		return null;

	}
	
}

package model.element.mobileElement;

import common.Permeability;
import common.Sprite;
import model.IMap;

public class Diamond extends Mobile {
	
	public static final Sprite sprite = new Sprite('X',null);
	private Sprite spriteAnim1;
	private Sprite spriteAnim2;
	private Sprite spriteAnim3;
	private Sprite spriteAnim4;

	
	public Diamond(int x, int y, Sprite sprite, IMap map, Permeability permeability) {
		super(x, y, sprite, map, Permeability.BLOCKING);
		this.setX(x);
		this.setY(y);	}
	
	public void doNothing(){
		this.setMobileHasChanged();
		this.setSprite(spriteAnim1);
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
}

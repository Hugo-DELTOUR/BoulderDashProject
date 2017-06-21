package model.element.mobileElement;

import common.Permeability;
import common.Sprite;
import model.IMap;

public class Rock extends Mobile {

	

	private static Sprite spriteAnim1;
	private static Sprite spriteAnim2;
	private static Sprite spriteAnim3;
	private static Sprite spriteAnim4;
	public static final Sprite sprite = new Sprite('O', /*TODO*/);
	
	
	
	public Rock(int x, int y, IMap map) {
		super(x, y, spriteAnim2, map, Permeability.BLOCKING);
		
		spriteAnim1.getImage();
		spriteAnim2.getImage();
		spriteAnim3.getImage();
		spriteAnim4.getImage();

        }
	
	
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

package model.element.mobileElement;

import common.Sprite;
import model.IMap;
import common.Permeability;

public class Rockford extends Mobile {

	public static final Sprite sprite = new Sprite('R', /*TODO*/);
	private static Sprite spriteGoLeft;
	private static Sprite spriteGoRight;
	private static Sprite spriteGoUp;
	private static Sprite spriteGoDown;
	private static Sprite spriteExplode;

	
	
	public Rockford(int x, int y, IMap map){
		super(x,y, spriteGoDown, map, Permeability.BLOCKING);
		spriteGoUp.getImage();
		spriteGoDown.getImage();
		spriteGoLeft.getImage();
		spriteGoRight.getImage();
		spriteExplode.getImage();
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
		 this.setSprite(spriteGoDown);

	}
	
	public void moveLeft(){
		this.setX(this.getX() - 1);
        this.setMobileHasChanged();
		this.setSprite(spriteGoLeft);

	}
	
	public void moveRight(){
		 this.setX(this.getX() + 1);
	     this.setMobileHasChanged();
		 this.setSprite(spriteGoRight);

	}
	
	public void moveUp(){
		this.setY(this.getY() - 1);
        this.setMobileHasChanged();
		this.setSprite(spriteGoUp);

	}
	
}

package model.element.mobileElement;

import common.Sprite;
import model.IMap;

import java.io.File;
import java.io.IOException;

import javax.imageio.ImageIO;

import common.Permeability;

public class Rockford extends Mobile {

	private static Sprite spriteGoLeft;
	private static Sprite spriteGoRight;
	private static Sprite spriteGoUp;
	private static Sprite spriteGoDown;
	private static Sprite spriteExplode;
	final static int width = 16;
	final static int height = 16;
	final static int rows = 5;
	final static int cols = 5;
	
	
	public Rockford(int x, int y, IMap map) throws IOException{
		super(x,y, new Sprite('R', ImageIO.read(new File("ress/74359.png")).getSubimage(cols * width, rows *height ,width,height)), map, Permeability.BLOCKING);
		spriteGoUp.loadImage();
		spriteGoDown.loadImage();
		spriteGoLeft.loadImage();
		spriteGoRight.loadImage();
		spriteExplode.loadImage();
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
		 this.setSprite(spriteGoDown);

	}
	
	public void moveLeft(){
		this.setX(this.getX() - 1);
		this.getMap().setMobileHasChanged();
		this.setSprite(spriteGoLeft);

	}
	
	public void moveRight(){
		 this.setX(this.getX() + 1);
		 this.getMap().setMobileHasChanged();
		 this.setSprite(spriteGoRight);

	}
	
	public void moveUp(){
		this.setY(this.getY() - 1);
		this.getMap().setMobileHasChanged();
		this.setSprite(spriteGoUp);

	}
	
}

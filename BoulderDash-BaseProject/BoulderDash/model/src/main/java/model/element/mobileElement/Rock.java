package model.element.mobileElement;

import java.io.File;
import java.io.IOException;

import javax.imageio.ImageIO;

import common.Permeability;
import common.Sprite;
import model.IMap;

public class Rock extends Mobile {

	

	private static Sprite spriteAnim1;
	private static Sprite spriteAnim2;
	private static Sprite spriteAnim3;
	private static Sprite spriteAnim4;
	final static int width = 16;
	final static int height = 16;
	final static int rows = 5;
	final static int cols = 5;
	
	
	public Rock(int x, int y, IMap map) throws IOException {
		super(x, y, new Sprite('O', ImageIO.read(new File("ress/74359.png")).getSubimage(cols * width, rows *height ,width,height))	, map, Permeability.BLOCKING);
		
		spriteAnim1.loadImage();
		spriteAnim2.loadImage();
		spriteAnim3.loadImage();
		spriteAnim4.loadImage();

        }
	
	
	public void doNothing(){
		this.getMap().setMobileHasChanged();
		this.setSprite(spriteAnim1);
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
	

}

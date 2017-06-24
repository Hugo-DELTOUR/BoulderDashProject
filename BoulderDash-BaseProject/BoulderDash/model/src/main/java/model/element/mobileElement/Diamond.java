package model.element.mobileElement;

import java.io.File;
import java.io.IOException;

import javax.imageio.ImageIO;

import common.Permeability;
import common.Sprite;
import model.IMap;

public class Diamond extends Mobile {
	
	private Sprite spriteAnim1;
	private Sprite spriteAnim2;
	private Sprite spriteAnim3;
	private Sprite spriteAnim4;
	final static int width = 16;
	final static int height = 16;
	final static int rows = 5;
	final static int cols = 5;
		
	public Diamond(int x, int y, Sprite sprite, IMap map, Permeability permeability) throws IOException {
		super(x, y, new Sprite('X', ImageIO.read(new File("ress/74359.png")).getSubimage(cols * width, rows *height ,width,height)), map, Permeability.BLOCKING);
		this.setX(x);
		this.setY(y);	}
	
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

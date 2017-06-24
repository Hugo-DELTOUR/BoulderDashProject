package model.element.mobileElement;

import java.awt.Image;
import java.awt.Point;
import common.Permeability;
import common.Sprite;
import model.IMap;
import model.IMobile;
import model.element.Element;

public class Mobile extends Element  implements IMobile{


	private Boolean alive;
	private IMap map;
	private char consoleImage;
	private Image image;

	
	public char getConsoleImage() {
		return consoleImage;
	}

	public void setConsoleImage(char consoleImage) {
		this.consoleImage = consoleImage;
	}

	public IMap getMap() {
		return map;
	}
	public void setMap(IMap map) {
		this.map = map;
	}
	
	public void doNothing(){
        this.getMap().setMobileHasChanged();
	}
	
	public Boolean isAlive(){
		return this.alive;
	}
	
	public Boolean setAlive(Boolean alive){
		return this.alive = alive;
	}
	
	public void die(){
		this.alive = false;
        this.getMap().setMobileHasChanged();
	}
	
	public Boolean isCrashed(){
		return this.getMap().getOnTheMapXY(this.getX(), this.getY()).getPermeability() == Permeability.BLOCKING;
	}
	
	public void moveUp(){
        this.setY(this.getY() - 1);
        this.getMap().setMobileHasChanged();
	}
	
	public void moveDown(){
        this.setY(this.getY() + 1);
        this.getMap().setMobileHasChanged();
	}
	
	public void moveLeft(){
        this.setX(this.getX() - 1);
        this.getMap().setMobileHasChanged();
	}
	
	public void moveRight(){
        this.setX(this.getX() + 1);
        this.getMap().setMobileHasChanged();
	}
	
    public Mobile(int x, int y , final Character character, final String name , final Permeability permeability) {
        super(character, name, permeability);
        this.setX(x);
        this.setY(y);	
    }
	
	@Override
	public Image getImage() {
		return this.image;		
	}
	

	
}

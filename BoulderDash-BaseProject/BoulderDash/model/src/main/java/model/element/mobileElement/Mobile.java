package model.element.mobileElement;

import java.awt.Point;

import common.Permeability;
import common.Sprite;
import model.IMap;
import model.IMobile;
import model.element.Element;

public class Mobile extends Element  implements IMobile, IMap{


	private Boolean alive;
	private IMap map;
	private Point position;
	private char consoleImage;
	
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
		this.setMobileHasChanged();
	}
	
	public Boolean isAlive(){
		return this.alive;
	}
	
	public Boolean setAlive(Boolean alive){
		return this.alive = alive;
	}
	
	public void die(){
		this.alive = false;
        this.setMobileHasChanged();
	}
	
	public Boolean isCrashed(){
		return this.getMap().getOnTheMapXY(this.getX(), this.getY()).getPermeability() == Permeability.BLOCKING;
	}
	
	public void moveUp(){
        this.setY(this.getY() - 1);
        this.setMobileHasChanged();
	}
	
	public void moveDown(){
        this.setY(this.getY() + 1);
        this.setMobileHasChanged();
	}
	
	public void moveLeft(){
        this.setX(this.getX() - 1);
        this.setMobileHasChanged();
	}
	
	public void moveRight(){
        this.setX(this.getX() + 1);
        this.setMobileHasChanged();
	}
	
	public Mobile (Sprite sprite, IMap map, Permeability permeability){
        super(sprite, permeability);
        this.setMap(map);
        this.position = new Point();
	}
	
	public Mobile (int x, int y, Sprite sprite, IMap map, Permeability permeability){
        this(sprite, map, permeability);
        this.setX(x);
        this.setY(y);
        
	}
	
	public Mobile(){
		super();
	}
	@Override
	public void getImage() {
		return this.image;		
	}
	@Override
	public int getWidth() {
        return this.width;

	}
	@Override
	public int getHeight() {
        return this.height;
	}
	
	
}

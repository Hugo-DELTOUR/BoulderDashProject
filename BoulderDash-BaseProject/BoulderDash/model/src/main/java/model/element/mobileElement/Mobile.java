package model.element.mobileElement;

import java.awt.Point;

import model.IMap;
import model.Permeability;
import model.Sprite;
import model.element.Element;

public class Mobile extends Element implements IMobile{

	private Point position;
	private Boolean alive;
	private Imap map;
	
	public Point getPosition() {
		return position;
	}
	public void setPosition(Point position) {
		this.position = position;
	}
	public Imap getMap() {
		return map;
	}
	public void setMap(Imap map) {
		this.map = map;
	}
	
	public int getX(){
		
	}
	
	public int getY(){
		
	}
	
	public void setX(){
		
	}
	
	public void setY(){
		
	}
	
	public void doNothing(){
		
	}
	
	public Boolean isAlive(){
		
	}
	
	public void die(){
		
	}
	
	public Boolean isCrashed(){
		
	}
	
	public void moveUp(){
		
	}
	
	public void moveDown(){
		
	}
	
	public void moveLeft(){
		
	}
	
	public void moveRight(){
		
	}
	
	public Mobile (Sprite sprite, IMap map, Permeability permeability){
		
	}
	
	public Mobile (int x, int y, Sprite sprite, IMap map, Permeability permeability){
		
	}
	
}

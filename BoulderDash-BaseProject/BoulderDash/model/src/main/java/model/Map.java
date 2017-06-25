package model;

import java.util.Observable;
import model.BoulderDashModel;
import model.element.mobileElement.Rockford;

public class Map extends Observable implements IMap  {

	private int width;
	private int height;
	private IElement[][] onTheMap;
	
	public int getWidth() {
		return width;
		/** 
		 * This is the getter of the variable "width".
		 */
	}
	public void setWidth(int width) {
		this.width = width;
		/** 
		 * This is the setter of the variable "width".
		 */
	}
	public int getHeight() {
		return height;
		/** 
		 * This is the getter of the variable "height".
		 */
	}
	public void setHeight(int height) {
		this.height = height;
		/** 
		 * This is the setter of the variable "height".
		 */
	}
	public IElement[][] getOnTheMapXY() {
		return onTheMap;
		
		/** 
		 * This is the getter of the variable "onTheMap".
		 */
	}
	public void setOnTheMapXY(IElement[][] onTheMap) {
		this.onTheMap = onTheMap;
		/** 
		 * This is the setter of the variable "onTheMap".
		 */
	}
	
	public Map (String fileName){  
		super();
        this.loadFile(fileName ,1,1);
        
		/** 
		 * This is the constructor of the map.
		 * It defines the map as fileName and two coordinates.
		 * The coordinates are the location where the heroe spawn.
		 */
	}
	
	public void loadFile (String fileName,  final int RockfordStartX, final int RockfordStartY){
		
		//TODO Use Cad and table[][], make a switch case and instantiate each objet
	}
	
	public Observable getObservable(){
		return this;
		
	}
	
//	@Override
//	public IElement getOnTheMapXY(int x, int y) {
//		return this.onTheRoad[x][y];
//
//	}
	
	@Override
	public void setMobileHasChanged() {
		this.setChanged();
        this.notifyObservers();		
        
		/** 
		 * This method allow to notifiy someone that something has changed.
		 */
	}
	
}

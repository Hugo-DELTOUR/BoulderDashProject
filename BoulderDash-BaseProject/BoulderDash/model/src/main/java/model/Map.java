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
	}
	public void setWidth(int width) {
		this.width = width;
	}
	public int getHeight() {
		return height;
	}
	public void setHeight(int height) {
		this.height = height;
	}
	public IElement[][] getOnTheMapXY() {
		return onTheMap;
	}
	public void setOnTheMapXY(IElement[][] onTheMap) {
		this.onTheMap = onTheMap;
	}
	
	public Map (String fileName){  
		super();
        this.loadFile(fileName ,1,1);
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
	}
	
}

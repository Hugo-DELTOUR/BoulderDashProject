package model;

import java.util.Observable;



public class Map extends Observable  {

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
	
	public IMap Map (String fileName){   // TODO vérifier UML
		
	}
	
	public void loadFile (String fileName){
		
	}
	
	public void setMobileAsChanged(){
		
	}
	
	public Observable getObservable(){
		
	}
}

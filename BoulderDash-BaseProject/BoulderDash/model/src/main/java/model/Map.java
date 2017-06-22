package model;

import java.util.Observable;
import model.BoulderDashModel;
import model.element.mobileElement.Rockford;
import model.BoulderDashModel;

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
	
	public Map (String fileName){  
		super();
        this.loadFile(fileName ,1,1);
	}
	
	public void loadFile (String fileName,  final int RockfordStartX, final int RockfordStartY){
		this.setMap(new Map(fileName));
		this.setRockford(new Rockford(RockfordStartX, RockfordStartY ) this.getMap);
	}
	
	public void setMobileAsChanged(){
		this.getMap().setMobileHasChanged();
	}
	
	public Observable getObservable(){
		return this;
	}
}

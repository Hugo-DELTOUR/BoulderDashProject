package model;

import java.util.Observable;

import model.element.mobileElement.Rockford;
import model.element.motionlessElement.Air;
import model.element.motionlessElement.MotionlessElementFactory;

public class Map extends Observable implements IMap  {

	private int width;
	private int height;
	private IElement[][] map;
	
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
	public IElement getOnTheMapXY(int x, int y) {
		return map[x][y];
	}
	public void setOnTheMapXY(IElement element, int x, int y) {
		map[x][y] = element;
	}
	public void setAirOnTheMapXY(int x, int y){
		this.setOnTheMapXY(MotionlessElementFactory.createAir(), x, y);
	}
	
	public Map (String fileName){  
		super();
        this.loadFile(fileName ,1,1);
	}
	
	public void loadFile (String fileName,  final int RockfordStartX, final int RockfordStartY){
		this.setMap(new Map(fileName));
		this.setRockford(new Rockford(RockfordStartX, RockfordStartY ) this.getMap);
	}
	
	public Observable getObservable(){
		return this;
	}
	@Override
	public IElement getOnTheRoad(int x, int y) {
		// TODO Auto-generated method stub
		return null;
	}
	@Override
	public void setMobileHasChanged() {
		// TODO Auto-generated method stub
		
	}
	@Override
	public void updateMap() {
		// TODO Auto-generated method stub
		
	}
}

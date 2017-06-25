package model;

import java.util.Observable;

import model.element.mobileElement.Diamond;
import model.element.mobileElement.Ennemy;
import model.element.mobileElement.EnnemyDiamonds;
import model.element.mobileElement.MobileElementFactory;
import model.element.mobileElement.Rock;
import model.element.mobileElement.Rockford;
import model.element.motionlessElement.Air;
import model.element.motionlessElement.MotionlessElementFactory;

public class Map extends Observable implements IMap {

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

	public Map(String fileName) {
		super();
		this.loadFile(fileName, 1, 1);
	}

	public void loadFile (String fileName,  final int RockfordStartX, final int RockfordStartY){
		this.setMap(new Map(fileName));
		this.setRockford(new Rockford(RockfordStartX, RockfordStartY ) this.getMap);
	}

	public Observable getObservable() {
		return this;
	}

	@Override
	public void setMobileHasChanged() {
		// TODO Auto-generated method stub

	}


}

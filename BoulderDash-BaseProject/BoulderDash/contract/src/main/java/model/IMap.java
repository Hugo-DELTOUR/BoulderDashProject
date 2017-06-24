package model;

import java.util.Observable;

public interface IMap {
	public int getWidth();
	public int getHeight();
	public IElement getOnTheMapXY(int x, int y);
	public IElement setOnTheMapXY(IElement element, int x, int y);
	public IElement setAirOnTheMapXY(int x, int y);
	public void setMobileHasChanged();
	public Observable getObservable();
	public void updateMap();
}

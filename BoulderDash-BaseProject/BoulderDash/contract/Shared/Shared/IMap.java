package Shared;

import java.util.Observable;

public interface IMap {
	public int getWidth();
	public int getHeight();
	public IElement getOnTheRoad(int x, int y);
	public void setMobileHasChanged();
	public Observable getObservable();
}

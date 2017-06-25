package Shared;

import java.util.Observable;

import fr.exia.showboard.IPawn;
import fr.exia.showboard.ISquare;

public interface IMap extends ISquare,IPawn{
	public int getWidth();
	public int getHeight();
	public IElement getOnTheMapXY(int x, int y);
	public void setMobileHasChanged();
	public Observable getObservable();
}

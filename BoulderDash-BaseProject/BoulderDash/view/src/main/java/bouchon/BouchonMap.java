package bouchon;

import java.awt.Graphics;
import java.awt.Image;
import java.awt.Point;
import java.awt.image.ImageObserver;
import java.awt.image.ImageProducer;
import java.util.Observable;

import Shared.IElement;
import Shared.IMap;
import Shared.Permeability;
import Shared.Sprite;

public class BouchonMap implements IMap,IElement {
	
	@Override
	public int getWidth() {
		// TODO Auto-generated method stub
		return 40;
	}
	
	@Override
	public int getHeight() {

		// TODO Auto-generated method stub
		return 20;
	}
	
	@Override
	public IElement getOnTheMapXY(int x, int y) {
		// TODO Auto-generated method stub
		IElement test = new IElement() {
			
			@Override
			public Sprite getSprite() {
				// TODO Auto-generated method stub
				return new Sprite(' ', "74336.png");
			}
			
			@Override
			public Permeability getPermeability() {
				// TODO Auto-generated method stub
				return Permeability.PENETRABLE;
			}
			
			@Override
			public Image getImage() {
				// TODO Auto-generated method stub
				return new Image() {
					
					@Override
					public int getWidth(ImageObserver observer) {
						// TODO Auto-generated method stub
						return 40;
					}
					
					@Override
					public ImageProducer getSource() {
						// TODO Auto-generated method stub
						return null;
					}
					
					@Override
					public Object getProperty(String name, ImageObserver observer) {
						// TODO Auto-generated method stub
						return null;
					}
					
					@Override
					public int getHeight(ImageObserver observer) {
						// TODO Auto-generated method stub
						return 20;
					}
					
					@Override
					public Graphics getGraphics() {
						// TODO Auto-generated method stub
						return null;
					}
				};
			}
		};
		return test;
	}
	
	@Override
	public void setMobileHasChanged() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public Observable getObservable() {
		// TODO Auto-generated method stub
		return new Observable();
	}

	@Override
	public Sprite getSprite() {
		// TODO Auto-generated method stub
		return new Sprite(' ', "74336.png");
	}

	@Override
	public Permeability getPermeability() {
		// TODO Auto-generated method stub
		return Permeability.PENETRABLE;
	}

	@Override
	public Image getImage() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public int getX() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int getY() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public Point getPosition() {
		// TODO Auto-generated method stub
		return null;
	}
}

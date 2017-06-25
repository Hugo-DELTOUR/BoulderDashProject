package bouchon;

import java.awt.Graphics;
import java.awt.Image;
import java.awt.Point;
import java.awt.image.ImageObserver;
import java.awt.image.ImageProducer;

import Shared.IElement;
import Shared.IMobile;
import Shared.Permeability;
import Shared.Sprite;
import fr.exia.showboard.ISquare;

public class BouchonRockford implements IMobile,ISquare,IElement{

	@Override
	public void moveUp() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void moveDown() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void moveRight() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void moveLeft() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void doNothing() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public int getX() {
		// TODO Auto-generated method stub
		return 3;
	}

	@Override
	public int getY() {
		// TODO Auto-generated method stub
		return 3;
	}

	@Override
	public Boolean isAlive() {
		// TODO Auto-generated method stub
		return true;
	}

	@Override
	public Boolean isCrashed() {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public Point getPosition() {
		// TODO Auto-generated method stub
		return null;
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

	@Override
	public Sprite getSprite() {
		// TODO Auto-generated method stub
		return new Sprite(' ',"74336.png");
	}

	@Override
	public Permeability getPermeability() {
		// TODO Auto-generated method stub
		return Permeability.PENETRABLE;
	}

}

package bouchon;

import java.awt.Graphics;
import java.awt.Image;
import java.awt.image.ImageObserver;
import java.awt.image.ImageProducer;

import fr.exia.showboard.ISquare;

public class BouchonSquare implements ISquare{

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
	
	public ISquare getOnTheMapXY(){
		return new ISquare() {
			
			@Override
			public Image getImage() {
				// TODO Auto-generated method stub
				return new Image() {
					
					@Override
					public int getWidth(ImageObserver observer) {
						// TODO Auto-generated method stub
						return 0;
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
						return 0;
					}
					
					@Override
					public Graphics getGraphics() {
						// TODO Auto-generated method stub
						return null;
					}
				};
			}
		};
		
	}
	
}

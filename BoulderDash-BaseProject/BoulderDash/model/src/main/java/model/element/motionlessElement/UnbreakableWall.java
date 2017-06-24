package model.element.motionlessElement;

import java.io.IOException;

import common.Permeability;

public class UnbreakableWall extends MotionlessElement{

	
	final static int width = 16;
	final static int height = 16;
	final static int rows = 5;
	final static int cols = 5;
	
	
	public UnbreakableWall()  {
		super('#', "74359.png" , Permeability.PENETRABLE);
		try {
			this.getSprite().loadImage();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	
}

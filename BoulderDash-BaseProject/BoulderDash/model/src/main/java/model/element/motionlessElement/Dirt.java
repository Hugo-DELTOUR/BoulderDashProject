package model.element.motionlessElement;

import java.io.IOException;

import common.Permeability;

public class Dirt extends MotionlessElement{
	
	

	final static int width = 16;
	final static int height = 16;
	final static int rows = 5;
	final static int cols = 5;
	
	
	public Dirt() {
		super('+', "74359.png" , Permeability.PENETRABLE);
		try {
			this.getSprite().loadImage();
		} catch (IOException e) {
			e.printStackTrace();
		}
		/**
		 * This is the constructor from "Dirt".
		 * It define this as a char -> '+', as a sprite and it also set his permeability to Penetrable.
		 */
	}
}

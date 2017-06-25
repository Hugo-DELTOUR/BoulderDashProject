package model.element.motionlessElement;

import java.io.IOException;

import common.Permeability;

public class Dirt extends MotionlessElement{
	
	

	final static int width = 16;
	final static int height = 16;
	final static int rows = 1;
	final static int cols = 1;
	
	
	public Dirt() {
		super('+', "74359.png" , Permeability.PENETRABLE);
		try {
			this.getSprite().loadImage();//.getSubimage(rows * width, cols * height, width, height);
		} catch (IOException e) {
			e.printStackTrace();
		}
		/**
		 * This is the constructor from "Dirt".
		 * It defines this as a char -> '+', as a sprite and it also sets his permeability to Penetrable.
		 */
	}
}

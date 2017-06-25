package model.element.motionlessElement;

import java.io.IOException;

import common.Permeability;

public class Door extends MotionlessElement {


	final static int width = 16;
	final static int height = 16;
	final static int rows = 0;
	final static int cols = 6;
	
	
	public Door() {
		super('E', "74359.png" , Permeability.PENETRABLE);
		try {
			this.getSprite().loadImage();//.getSubimage(rows * width, cols * height, width, height);
		} catch (IOException e) {
			e.printStackTrace();
		}
		/**
		 * This is the constructor from "Door".
		 * It defines this as a char -> 'E', as a sprite and it also sets his permeability to penetrable.
		 */
	}

}

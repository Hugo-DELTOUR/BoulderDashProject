package model.element.motionlessElement;

import java.io.IOException;

import common.Permeability;

public class Wall extends MotionlessElement {


	final static int width = 16;
	final static int height = 16;
	final static int rows = 0;
	final static int cols = 0;
	
	
	public Wall() {
		super('H', "74359.png" , Permeability.BLOCKING);
		try {
			this.getSprite().loadImage();//.getSubimage(rows * width, cols * height, width, height);
		} catch (IOException e) {
			e.printStackTrace();
		}
		/**
		 * This is the constructor from "Wall".
		 * It defines this as a char -> 'H', as a sprite and it also sets his permeability to blocking.
		 */
	}
	
	
}

package model.element.motionlessElement;

import java.io.IOException;

import common.Permeability;

public class Air extends MotionlessElement {

	final static int width = 16;
	final static int height = 16;
	final static int rows = 0;
	final static int cols = 2;

	
	
	public Air()  {
		super(' ', "74359.png" , Permeability.PENETRABLE);
		try {
			 this.getSprite().loadImage();//.getSubimage(rows * width, cols * height, width, height);
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		
		/**
		 * This is the constructor from "Air".
		 * It defines this as a char -> ' ', as a sprite and it also sets his permeability to penetrable.
		 */
		
		
	}
  
}

package model.element.motionlessElement;

import java.io.IOException;

import common.Permeability;

public class SpecialStoneBlock extends MotionlessElement{

	final static int width = 16;
	final static int height = 16;
	final static int rows = 5;
	final static int cols = 5;
	
	
	public SpecialStoneBlock()  {
		super('W', "74359.png" , Permeability.PENETRABLE);
		try {
			this.getSprite().loadImage();
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		/**
		 * This is the constructor from "SpecialStoneBlock".
		 * It define this as a char -> 'W', as a sprite and it also set his permeability to penetrable
		 */
		
	}

	
}

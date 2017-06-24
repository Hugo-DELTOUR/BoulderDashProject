package model.element.motionlessElement;
import java.io.File;
import java.io.IOException;

import javax.imageio.ImageIO;

import common.Permeability;
import common.Sprite;

public class Air extends MotionlessElement {

	final static int width = 16;
	final static int height = 16;
	final static int rows = 5;
	final static int cols = 5;
	
	
	public Air() throws IOException {
		super(' ', "74359.png" , Permeability.PENETRABLE);
		this.getSprite().loadImage();
	}

}

package model.element.motionlessElement;

import java.io.File;
import java.io.IOException;

import javax.imageio.ImageIO;

import common.Sprite;

public class Wall extends MotionlessElement {


	final static int width = 16;
	final static int height = 16;
	final static int rows = 5;
	final static int cols = 5;
	
	
	public Wall() throws IOException {
		super(new Sprite(' ', ImageIO.read(new File("ress/74359.png")).getSubimage(cols * width, rows *height ,width,height)), common.Permeability.BLOCKING);		
	}
}

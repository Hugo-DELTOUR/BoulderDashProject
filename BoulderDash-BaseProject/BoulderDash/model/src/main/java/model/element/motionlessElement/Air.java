package model.element.motionlessElement;

import java.awt.image.BufferedImage;
import java.io.File;

import javax.imageio.ImageIO;

import common.Permeability;
import common.Sprite;

public class Air extends MotionlessElement {

	static BufferedImage bigImg = ImageIO.read(new File("ress/74359.png"));
	
	final static int width = 16;
	final static int height = 16;
	final static int rows = 5;
	final static int cols = 5;
	
	public static final Sprite sprite = new Sprite(' ', bigImg.getSubimage(cols * width, rows *height ,width,height));

	
	public Air(Sprite sprite, Permeability permeability) {
		super(sprite, permeability);
		// TODO Auto-generated constructor stub
	}

}

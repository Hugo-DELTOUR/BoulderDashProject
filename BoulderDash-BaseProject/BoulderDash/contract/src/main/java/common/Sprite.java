package common;

import java.awt.Image;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

import javax.imageio.ImageIO;


public class Sprite {
	
	private Image image;
	private String imageName;
	private char consoleImage;
	private Boolean imageLoaded;
	
	public Sprite(Character character, String name) {
		this.consoleImage = character;
		this.imageName = name;

	}

	public Image getImage() {
		return image;
	}

	public void setImage(Image image) {
		this.image = image;
	}

	public String getImageName() {
		return imageName;
	}

	public void setImageName(String imageName) {
		this.imageName = imageName;
	}

	public char getConsoleImage() {
		return consoleImage;
	}

	public void setConsoleImage(char consoleImage) {
		this.consoleImage = consoleImage;
	}

	public void setImageLoaded(Boolean imageLoaded) {
		this.imageLoaded = imageLoaded;
	}
	
	public Boolean isNameLoaded(){
		return true;
	}
	
	 public final void loadImage() throws IOException {
	        this.setImage(ImageIO.read(new File("ress" + this.getImageName())));
	    }
	
	public void loadedImage(){
		
	}
	
	
	
}

package Shared;

import java.awt.Image;
import java.io.File;
import java.io.IOException;

import javax.imageio.ImageIO;

public class Sprite {
	
	private Image image;
	private String imageName;
	private char consoleImage;
	private Boolean imageLoaded;
		
	public Sprite(char character, String imageName){
		this.consoleImage = character;
		this.imageName = imageName;
	}
	
	public Image getImage() {
		return image;
	}

	public void setImage(Image image) {
		this.image = image;
	}

	public String getImageName() {
		return this.imageName;
	}

	public void setImageName(String imageName) {
		this.imageName = imageName;
	}

	public char getConsoleImage() {
		return this.consoleImage;
	}

	public void setConsoleImage(char consoleImage) {
		this.consoleImage = consoleImage;
	}

	public void setImageLoaded(Boolean imageLoaded) {
		this.imageLoaded = imageLoaded;
	}
	
	public Boolean isNameLoaded(){
		return this.imageLoaded;
	}
	
	public void loadedImage() throws IOException{
		this.setImage(ImageIO.read(new File("ress/" + this.getImageName())));
	}
}

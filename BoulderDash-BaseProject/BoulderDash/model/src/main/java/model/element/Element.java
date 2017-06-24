package model.element;

import java.awt.Image;
import java.awt.Point;
import java.io.IOException;

import common.Permeability;
import common.Sprite;
import model.BoulderDashModel;
import model.IElement;

public class Element extends BoulderDashModel implements IElement{
	
	protected Point position;
	protected Sprite sprite;
	private Permeability permeability;
	private Image image;
	
	public Element(final Character character, final String name , final Permeability permeability) {
		this.sprite = new Sprite(character, name );
        this.setPermeability(permeability);
    }

	public Sprite getSprite() {
		return sprite;
	}
	public void setSprite(Sprite sprite) {
		this.sprite = sprite;
	}
	public Permeability getPermeability() {
		return permeability;
	}
	public void setPermeability(Permeability permeability) {
		this.permeability = permeability;
	}

	@Override
	public Image getImage() {
		return this.image;		
	}
	
	public Point getPosition() {
		return position;
	}
	
	public void setPosition(Point position) {
		this.position = position;
	}
	
	public int getX(){
		return this.getPosition().x;
	}
	
	public int getY(){
	       return this.getPosition().y;	
	}
	
	public void setX(int x){

		this.getPosition().x =x;
//		if (this.isCrashed()){
//			this.die();
//		}
	}
	
	public void setY(int y){
        this.getPosition().y = (y + this.getMap().getHeight()) % this.getMap().getHeight();
//        if (this.isCrashed()) {
//            this.die();
//        }	
	}
}

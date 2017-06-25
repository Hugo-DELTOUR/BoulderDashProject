package model.element;

import java.awt.Image;
import java.awt.Point;
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
        
		/** 
		 * This is the constructor of the "Element".
		 * It defines this as a char, as a name and as a permeability.
		 */
    }

	public Sprite getSprite() {
		return sprite;
		/** 
		 * This is the getter of the variable "sprite".
		 */
	}
	public void setSprite(Sprite sprite) {
		this.sprite = sprite;
		/** 
		 * This is the setter of the variable "sprite".
		 */
	}
	public Permeability getPermeability() {
		return permeability;
		
		/** 
		 * This is the getter of the variable "permeability".
		 */
	}
	public void setPermeability(Permeability permeability) {
		this.permeability = permeability;
		/** 
		 * This is the setter of the variable "permeability".
		 */
		
	}

	@Override
	public Image getImage() {
		return this.image;		
		
		/** 
		 * This is the getter of the variable "image".
		 */
	}
	
	public Point getPosition() {
		return position;
		
		/** 
		 * This is the getter of the variable "position".
		 */
	}
	
	public void setPosition(Point position) {
		this.position = position;
		/** 
		 * This is the setter of the variable "position".
		 */
	}
	
	public int getX(){
		return this.getPosition().x;
		
		/** 
		 * This is the getter of the variable "x".
		 */
	}
	
	public int getY(){
	       return this.getPosition().y;	
			/** 
			 * This is the getter of the variable "y".
			 */
	}
	
	public void setX(int x){

		this.getPosition().x =x;
//		if (this.isCrashed()){
//			this.die();
//		}
		
		
		/** 
		 * This is the setter of the variable "x".
		 */
	}
	
	public void setY(int y){
        this.getPosition().y = (y + this.getMap().getHeight()) % this.getMap().getHeight();
//        if (this.isCrashed()) {
//            this.die();
//        }	
        
		/** 
		 * This is the setter of the variable "y".
		 */
	}
}

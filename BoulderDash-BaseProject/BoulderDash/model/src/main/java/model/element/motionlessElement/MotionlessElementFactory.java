package model.element.motionlessElement;

import common.Permeability;
import model.element.Element;

public class MotionlessElementFactory extends Element {
	

			public MotionlessElementFactory(Character character, String name, Permeability permeability) {
		super(character, name, permeability);
	}

			private static Wall wall = new Wall();
			private static UnbreakableWall unbreakableWall = new UnbreakableWall();
			private static Dirt dirt = new Dirt();
			private static Air air = new Air();
			private static Door door = new Door();
			private static SpecialStoneBlock specialStoneBlock = new SpecialStoneBlock();
			private static MotionlessElement[] motionlessElement = {wall,unbreakableWall,dirt,air,door,specialStoneBlock};


			/**
			 * This is the Factory from the Dp factory.
			 * It Defines an interface for creating an object, 
			 * but lets subclasses decide which class to instantiate. 
			 * The Factory method lets a class defer instantiation it uses to subclasses.
			 */
	
	
	
	
	
	public static MotionlessElement createWall(){
		return wall;
		
		/**
		 * This is the factory from the wall.
		 * It allows the the user to create a wall with the method "createWall". 
		 */
	}
	public static MotionlessElement createUnbreakable(){
		return unbreakableWall;
		/**
		 * This is the factory from the unbreakableWall.
		 * It allowsthe the user to create a wall with the method "createUnbreakable". 
		 */
	}
	public static MotionlessElement createDirt(){
		return dirt;
		/**
		 * This is the factory from the dirt.
		 * It allows the the user to create a wall with the method "createDirt". 
		 */
	}
	public static MotionlessElement createAir(){
		return air;
		
		/**
		 * This is the factory from the air.
		 * It allows the the user to create a wall with the method "createAir". 
		 */
	}
	public static MotionlessElement createDoor(){
		return door;
		/**
		 * This is the factory from the wall.
		 * It allows the the user to create a wall with the method "createWall". 
		 */
	}
	public static MotionlessElement createSpecialStoneBlock(){
		return specialStoneBlock;
		/**
		 * This is the factory from the wall.
		 * It allows the the user to create a wall with the method "createWall". 
		 */
	}
	
	public MotionlessElement getFromFileSymbol(final char fileSymbol){
	       for (final MotionlessElement motionlessElement : motionlessElement) {
	            if (motionlessElement.getSprite().getConsoleImage() == fileSymbol) {
	                return motionlessElement;
	            }
	        }
	        return air;
	        
	        /**
			 * This method allows the user to identify a motionless element with his symbol.
			 */
	        
	 }
	
	
	
}

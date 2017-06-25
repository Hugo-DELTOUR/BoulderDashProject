package model.element.motionlessElement;

import common.Permeability;
import common.Sprite;
import model.element.Element;

public class MotionlessElementFactory extends Element {
	
	public MotionlessElementFactory(int x, int y, Sprite sprite, Permeability permeability) {
		super(x, y, sprite, permeability);
	}

	private static Wall wall = new Wall();
	private static UnbreakableWall unbreakableWall = new UnbreakableWall();
	private static Dirt dirt = new Dirt();
	private static Air air = new Air();
	private static Door door = new Door();
	private static SpecialStoneBlock specialStoneBlock = new SpecialStoneBlock();
	private static MotionlessElement[] motionlessElement = {wall,unbreakableWall,dirt,air,door,specialStoneBlock};
			
	
	public static MotionlessElement createWall(){
		return wall;
	}
	public static MotionlessElement createUnbreakable(){
		return unbreakableWall;
	}
	public static MotionlessElement createDirt(){
		return dirt;
	}
	public static MotionlessElement createAir(){
		return air;
	}
	public static MotionlessElement createDoor(){
		return door;
	}
	public static MotionlessElement createSpecialStoneBlock(){
		return specialStoneBlock;
	}
	
	public MotionlessElement getFromFileSymbol(final char fileSymbol){
	       for (final MotionlessElement motionlessElement : motionlessElement) {
	            if (motionlessElement.getSprite().getConsoleImage() == fileSymbol) {
	                return motionlessElement;
	            }
	        }
	        return air;
	 }
	
	
	
}

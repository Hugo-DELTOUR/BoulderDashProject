package model;

import java.io.IOException;
import java.util.Observable;

import model.element.mobileElement.Diamond;
import model.element.mobileElement.Ennemy;
import model.element.mobileElement.EnnemyDiamonds;
import model.element.mobileElement.MobileElementFactory;
import model.element.mobileElement.Rock;
import model.element.mobileElement.Rockford;
import model.element.motionlessElement.Air;
import model.element.motionlessElement.MotionlessElementFactory;

public class Map extends Observable implements IMap, ICAD  {

	private static final Object[][] SpriteMap = null;
	private int width;
	private int height;
	private IElement[][] onTheMap;
	
	public int getWidth() {
		return width;
		/** 
		 * This is the getter of the variable "width".
		 */
	}
	public void setWidth(int width) {
		this.width = width;
		/** 
		 * This is the setter of the variable "width".
		 */
	}
	public int getHeight() {
		return height;
		/** 
		 * This is the getter of the variable "height".
		 */
	}
	public void setHeight(int height) {
		this.height = height;
		/** 
		 * This is the setter of the variable "height".
		 */
	}
	public IElement[][] getOnTheMapXY() {
		return onTheMap;
		
		/** 
		 * This is the getter of the variable "onTheMap".
		 */
	}
	public void setOnTheMapXY(IElement[][] onTheMap) {
		this.onTheMap = onTheMap;
		/** 
		 * This is the setter of the variable "onTheMap".
		 * @throws Exception 
		 */
	}
	
	public Map (String fileName) throws Exception{  
		super();
        this.loadFile(fileName ,1,1);
        
		/** 
		 * This is the constructor of the map.
		 * It defines the map as fileName and two coordinates.
		 * The coordinates are the location where the heroe spawn.
		 */
	}
	
	public void loadFile (String fileName,  final int RockfordStartX, final int RockfordStartY) throws Exception{

//		Connect();
//		char tableMap[][]= this.getMapSQL("MAP1", 1);
//		MotionlessElement SpriteMap[40][20];
//		for (int y=0; y<20; y++){
//			for (int x=0; x<40; x++){
//				 switch (tableMap[x][y]) {
//		            case 1:  tableMap[x][y] = 'H';
//		            		 spriteMap[x][y] = createWall();
//		                     break;
//		            case 2:  tableMap[x][y] = 'X';
//		            		 spriteMap[x][y] = createDiamond();
//		                     break;
//		            case 3:  tableMap[x][y] = '#';
//		            		 spriteMap[x][y] = createUnbreakableWall();
//
//		                     break;
//		            case 4:  tableMap[x][y] = '°';
//		            		 spriteMap[x][y] = createRock();
//
//		                     break;
//		            case 5:  tableMap[x][y] = '@';
//		            		 spriteMap[x][y] = createEnnemy();
//
//		                     break;
//		            case 6:  tableMap[x][y] = '+';
//		             		 spriteMap[x][y] = createDirt();
//
//		                     break;
//		            case 7:  tableMap[x][y] = 'E';
//			           		 spriteMap[x][y] = createDoor();
//
//		                     break;
//		            case 8:  tableMap[x][y] = 'W';
//		            		 spriteMap[x][y] = createSpecialWall();
//
//		                     break;
//		            case 9:  tableMap[x][y] = ' ';
//		            		 spriteMap[x][y] = createAir();
//
//		            		 break;
//		            default: tableMap[x][y] = ' ';
//           		 			 spriteMap[x][y] = createAir();
//		                     break;
//			}
//		}
//	}
		
		/**
		 * This method transforms each character of the tableMap array into sprite in the spriteMap array.
		 */
}
	
	public Observable getObservable(){
		return this;
		
	}
	
//	@Override
//	public IElement getOnTheMapXY(int x, int y) {
//		return this.onTheRoad[x][y];
//
//	}
	
	@Override
	public void setMobileHasChanged() {
		this.setChanged();
        this.notifyObservers();		
        
		/** 
		 * This method allow to notifiy someone that something has changed.
		 */
	}
	@Override
	public void Connect() throws Exception {
		// TODO Auto-generated method stub
		
	}
	@Override
	public void Close() throws Exception {
		// TODO Auto-generated method stub
		
	}
	@Override
	public char[][] getMapSQL(String identifiant, int idMap) throws IOException {
		// TODO Auto-generated method stub
		return null;
	}
	
	@Override
	public IElement getOnTheMapXY(int x, int y) {
		return onTheMap[x][y];
	}

	public void setOnTheMapXY(IElement element, int x, int y) {
		onTheMap[x][y] = element;
	}

	public void setAirOnTheMapXY(int x, int y) {
		this.setOnTheMapXY(MotionlessElementFactory.createAir(), x, y);
	}
	
	@Override
	public void updateMap() {
		for (int y = this.getHeight() - 2; y >= 0; y--) {
			for (int x = 0; x < this.getWidth(); x++) {

				if (isDiamondOrRock(y, x)) {
					if (this.getOnTheMapXY(x, y).isFalling()) {
						if (this.getOnTheMapXY(x, y + 1).getClass().isInstance(Air.class)) {
							this.setOnTheMapXY(this.getOnTheMapXY(x, y), x, y + 1);
							this.setOnTheMapXY(MotionlessElementFactory.createAir(), x, y);
						} else if (this.getOnTheMapXY(x, y + 1).getClass().isInstance(Rockford.class)) {
							this.setOnTheMapXY(this.getOnTheMapXY(x, y), x, y + 1);
							this.setOnTheMapXY(MobileElementFactory.createRockford(), x, y + 1);
							this.getOnTheMapXY(x, y + 1).die();
						} else if (this.getOnTheMapXY(x, y + 1).getClass().isInstance(Ennemy.class)) {
							if (this.getOnTheMapXY(x, y + 1).getClass().isInstance(EnnemyDiamonds.class)) {
								for (int i = x - 1; i < x + 2; i++) {
									for (int j = y - 1; j < y + 2; j++) {
										this.setOnTheMapXY(MobileElementFactory.createDiamond(), i, j);
									}
								}
							} else {
								for (int i = x - 1; i < x + 2; i++) {
									for (int j = y - 1; j < y + 2; j++) {
										this.setAirOnTheMapXY(i, j);
										this.scoreAugmentation(100);
									}
								}
							}
						} else {
							this.getOnTheMapXY(x, y).setFalling(false);
						}
					} else {
						if (this.getOnTheMapXY(x, y + 1).getClass().isInstance(Air.class)) {
							this.setOnTheMapXY(this.getOnTheMapXY(x, y), x, y + 1);
							this.setOnTheMapXY(MotionlessElementFactory.createAir(), x, y);
							this.getOnTheMapXY(x, y + 1).setFalling(true);
						}
					}
				} else if (this.getOnTheMapXY(x, y).getClass().isInstance(Ennemy.class)) {
					if (this.getOnTheMapXY(x, y).isAirEverywhere()) {
						/**In direction :
						 *  1 is Up
						 *  2 is down
						 *  3 is left
						 *  4 is right
						 */
						switch (this.getOnTheMapXY(x, y).getDirection()) {
						case 1:
							this.getOnTheMapXY(x, y).moveUp();
							this.setAirOnTheMapXY(x, y);
							break;
						case 2:
							this.getOnTheMapXY(x, y).moveDown();
							this.setAirOnTheMapXY(x, y);
							break;
						case 4:
							this.getOnTheMapXY(x, y).moveRight();
							this.setAirOnTheMapXY(x, y);
							break;
						case 3:
							this.getOnTheMapXY(x, y).moveLeft();
							this.setAirOnTheMapXY(x, y);
							break;
						default:
							this.getOnTheMapXY(x, y).moveRight();
							this.setAirOnTheMapXY(x, y);
							break;
						}
					} else {
						switch (this.getOnTheMapXY(x, y).getDirection()) {
						case 1:
							if (this.getOnTheMapXY(x + 1, y).getClass().isInstance(Air.class)) {
								this.getOnTheMapXY(x, y).moveRight();
								this.setAirOnTheMapXY(x, y);
							} else if (this.getOnTheMapXY(x, y - 1).getClass().isInstance(Air.class)) {
								this.getOnTheMapXY(x, y).moveUp();
								this.setAirOnTheMapXY(x, y);
							} else if (this.getOnTheMapXY(x - 1, y).getClass().isInstance(Air.class)) {
								this.getOnTheMapXY(x, y).moveLeft();
								this.setAirOnTheMapXY(x, y);
							} else if (this.getOnTheMapXY(x, y + 1).getClass().isInstance(Air.class)) {
								this.getOnTheMapXY(x, y).moveDown();
								this.setAirOnTheMapXY(x, y);
							}
							break;
						case 3:
							if (this.getOnTheMapXY(x, y - 1).getClass().isInstance(Air.class)) {
								this.getOnTheMapXY(x, y).moveUp();
								this.setAirOnTheMapXY(x, y);
							} else if (this.getOnTheMapXY(x - 1, y).getClass().isInstance(Air.class)) {
								this.getOnTheMapXY(x, y).moveLeft();
								this.setAirOnTheMapXY(x, y);
							} else if (this.getOnTheMapXY(x, y + 1).getClass().isInstance(Air.class)) {
								this.getOnTheMapXY(x, y).moveDown();
								this.setAirOnTheMapXY(x, y);
							} else if (this.getOnTheMapXY(x + 1, y).getClass().isInstance(Air.class)) {
								this.getOnTheMapXY(x, y).moveRight();
								this.setAirOnTheMapXY(x, y);
							}
							break;
						case 2:
							if (this.getOnTheMapXY(x - 1, y).getClass().isInstance(Air.class)) {
								this.getOnTheMapXY(x, y).moveLeft();
								this.setAirOnTheMapXY(x, y);
							} else if (this.getOnTheMapXY(x, y + 1).getClass().isInstance(Air.class)) {
								this.getOnTheMapXY(x, y).moveDown();
								this.setAirOnTheMapXY(x, y);
							} else if (this.getOnTheMapXY(x + 1, y).getClass().isInstance(Air.class)) {
								this.getOnTheMapXY(x, y).moveRight();
								this.setAirOnTheMapXY(x, y);
							} else if (this.getOnTheMapXY(x, y - 1).getClass().isInstance(Air.class)) {
								this.getOnTheMapXY(x, y).moveUp();
								this.setAirOnTheMapXY(x, y);
							}
							break;
						case 4:
							if (this.getOnTheMapXY(x, y + 1).getClass().isInstance(Air.class)) {
								this.getOnTheMapXY(x, y).moveDown();
								this.setAirOnTheMapXY(x, y);
							} else if (this.getOnTheMapXY(x + 1, y).getClass().isInstance(Air.class)) {
								this.getOnTheMapXY(x, y).moveRight();
								this.setAirOnTheMapXY(x, y);
							} else if (this.getOnTheMapXY(x, y - 1).getClass().isInstance(Air.class)) {
								this.getOnTheMapXY(x, y).moveUp();
								this.setAirOnTheMapXY(x, y);
							} else if (this.getOnTheMapXY(x - 1, y).getClass().isInstance(Air.class)) {
								this.getOnTheMapXY(x, y).moveLeft();
								this.setAirOnTheMapXY(x, y);
							}
							break;
						default:
							if (this.getOnTheMapXY(x + 1, y).getClass().isInstance(Air.class)) {
								this.getOnTheMapXY(x, y).moveRight();
								this.setAirOnTheMapXY(x, y);
							} else if (this.getOnTheMapXY(x, y - 1).getClass().isInstance(Air.class)) {
								this.getOnTheMapXY(x, y).moveUp();
								this.setAirOnTheMapXY(x, y);
							} else if (this.getOnTheMapXY(x - 1, y).getClass().isInstance(Air.class)) {
								this.getOnTheMapXY(x, y).moveLeft();
								this.setAirOnTheMapXY(x, y);
							} else if (this.getOnTheMapXY(x, y + 1).getClass().isInstance(Air.class)) {
								this.getOnTheMapXY(x, y).moveDown();
								this.setAirOnTheMapXY(x, y);
							}
							break;
						}

					}
				}
			}
		}

	}
	private boolean isDiamondOrRock(int y, int x) {
		return this.getOnTheMapXY(x, y).getClass().isInstance(Diamond.class)
				|| this.getOnTheMapXY(x, y).getClass().isInstance(Rock.class);
	}
	private void scoreAugmentation(int i) {
		// TODO Auto-generated method stub
		
	}
	
}

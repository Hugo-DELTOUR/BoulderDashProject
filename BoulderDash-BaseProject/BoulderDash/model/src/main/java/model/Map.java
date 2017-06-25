package model;

import java.io.IOException;
import java.util.Observable;

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
		return null;
	}
	
	@Override
	public void updateMap() {
		// TODO Auto-generated method stub
		
	}
	@Override
	public void setOnTheMapXY(IElement element, int x, int y) {
		// TODO Auto-generated method stub
		
	}
	@Override
	public void setAirOnTheMapXY(IElement element, int x, int y) {
		// TODO Auto-generated method stub
		
	}
	
}

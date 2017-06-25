package model;

import java.util.Observable;

import model.element.mobileElement.Diamond;
import model.element.mobileElement.Ennemy;
import model.element.mobileElement.EnnemyDiamonds;
import model.element.mobileElement.MobileElementFactory;
import model.element.mobileElement.Rock;
import model.element.mobileElement.Rockford;
import model.element.motionlessElement.Air;
import model.element.motionlessElement.MotionlessElementFactory;

public class Map extends Observable implements IMap {

	private int width;
	private int height;
	private IElement[][] map;

	public int getWidth() {
		return width;
	}

	public void setWidth(int width) {
		this.width = width;
	}

	public int getHeight() {
		return height;
	}

	public void setHeight(int height) {
		this.height = height;
	}

	public IElement getOnTheMapXY(int x, int y) {
		return map[x][y];
	}

	public void setOnTheMapXY(IElement element, int x, int y) {
		map[x][y] = element;
	}

	public void setAirOnTheMapXY(int x, int y) {
		this.setOnTheMapXY(MotionlessElementFactory.createAir(), x, y);
	}

	public Map(String fileName) {
		super();
		this.loadFile(fileName, 1, 1);
	}

	public void loadFile (String fileName,  final int RockfordStartX, final int RockfordStartY){
		this.setMap(new Map(fileName));
		this.setRockford(new Rockford(RockfordStartX, RockfordStartY ) this.getMap);
	}

	public Observable getObservable() {
		return this;
	}

	@Override
	public void setMobileHasChanged() {
		// TODO Auto-generated method stub

	}

	@Override
	public void updateMap() {
		for (int y = this.getHeight() - 2; y >= 0; y--) {
			for (int x = 0; x < this.getWidth(); x++) {

				if (this.getOnTheMapXY(x, y).getClass().isInstance(Diamond.class)
						|| this.getOnTheMapXY(x, y).getClass().isInstance(Rock.class)) {
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
										this.setOnTheMapXY(MobileFactory.createDiamond(), i, j);
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
							this.setOnTheMapXY(MotionlessFactory.createAir(), x, y);
							this.getOnTheMapXY(x, y + 1).setFalling(true);
						}
					}
				} else if (this.getOnTheMapXY(x, y).getClass().isInstance(Ennemy.class)) {
					if (this.getOnTheMapXY(x, y).isAirEverywhere()) {
						switch (this.getOnTheMapXY(x, y).getDirection()) {
						case up:
							this.getOnTheMapXY(x, y).moveUp();
							this.setAirOnTheMapXY(x, y);
							break;
						case down:
							this.getOnTheMapXY(x, y).moveDown();
							this.setAirOnTheMapXY(x, y);
							break;
						case Right:
							this.getOnTheMapXY(x, y).moveRight();
							this.setAirOnTheMapXY(x, y);
							break;
						case Left:
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
						case up:
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
						case left:
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
						case down:
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
						case right:
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
}

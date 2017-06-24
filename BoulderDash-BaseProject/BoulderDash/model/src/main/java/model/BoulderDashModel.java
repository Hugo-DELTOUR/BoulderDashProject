package model;

public class BoulderDashModel implements IBoulderDashModel{
	private IMap map;
	private IMobile Rockford;
	private boolean win = false;

	public IMap getMap() {
		return map;
	}

	public void setMap(IMap map) {
		this.map = map;
	}

	public IMobile getRockford() {
		return Rockford;
	}

	public void setRockford(IMobile rockford) {
		Rockford = rockford;
	}

	public void updateModel() {
		this.getMap().updateMap();
	}


	public boolean getWin(){
		return win;
	}

	public void setWin(boolean win){
		this.win = win;
	}
}

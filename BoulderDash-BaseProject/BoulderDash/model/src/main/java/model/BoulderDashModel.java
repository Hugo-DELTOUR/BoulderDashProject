package model;

public class BoulderDashModel implements IBoulderDashModel {
	private IMap map;
	private IMobile Rockford;
	
	public BoulderDashModel(int mapcharged, int startx, int starty) {
	}
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
	@Override
	public void updateModel() {
		
	}
	
}

package model;

public class BoulderDashModel implements IBoulderDashModel{
	private IMap map;
	private IMobile Rockford;
	
	public BoulderDashModel(int mapcharged, int startx, int starty) {
		// TODO Auto-generated constructor stub
	}
	public BoulderDashModel() {
		// TODO Auto-generated constructor stub
	}
	public IMap getMap() {
		return map;
		
		/** 
		 * This is the getter of the variable "map".
		 */
	}
	public void setMap(IMap map) {
		this.map = map;
		/** 
		 * This is the setter of the variable "map".
		 */
	}
	public IMobile getRockford() {
		return Rockford;
		/** 
		 * This is the getter of the variable "Rockford".
		 */
	}
	public void setRockford(IMobile rockford) {
		Rockford = rockford;
		/** 
		 * This is the setter of the variable "Rockford".
		 */
	}
	@Override
	public void updateModel() {
		this.map.updateMap();
	}
	
}

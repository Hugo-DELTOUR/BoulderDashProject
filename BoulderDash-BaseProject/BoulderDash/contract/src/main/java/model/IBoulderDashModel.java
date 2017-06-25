package model;

public interface IBoulderDashModel {
	/**
	 * Gets the map
	 * @return IMap
	 */
	public IMap getMap();
	
	/**
	 * Gets Rockford
	 * @return IMobile
	 */
	public IMobile getRockford();

	public void updateModel();
}

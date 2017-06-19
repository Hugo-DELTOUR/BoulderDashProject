package Shared;

public interface ICAD {
	public void connect();
	public void close();
	public char[][]getMap(int idMap);
	public void saveNewMap();
}

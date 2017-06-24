package model;

import java.io.IOException;

public interface ICAD {
	public void Connect () throws Exception;
	public void Close () throws Exception;
	public char[][] getMap (String identifiant, int idMap )  throws IOException;
}

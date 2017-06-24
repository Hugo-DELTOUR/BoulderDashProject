package model.dao;

import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

import model.ICAD;
import model.IElement;


public class BoulderDashBDDConnector implements ICAD{
		

	
	
		final String url = "jdbc:mysql:////localhost/javapetri?autoReconnect=true&useSSL=false";
		final String user = "root";
		final String passwd = "";
		Connection connection = null;
		Statement statement = null;
		
		public void Connect (){
			
			try {
				Class.forName("com.mysql.jdbc.Driver");
			} catch (ClassNotFoundException e) {
				System.out.println("Vérifie tes Drivers");
				e.printStackTrace();
			}
			System.out.println("Driver OK");
			
			try {
				connection = DriverManager.getConnection(url, user, passwd);
				statement = connection.createStatement();
			} catch (SQLException e1) {
				System.out.println("Vérifie ta connection internet et/ou tes logins");	
				e1.printStackTrace();
			}
			System.out.println("Connection OK");
			
			
			
		}
		
		
		
		public void Close() throws Exception {
			try {
				connection.close();
			} catch (SQLException e) {
				System.out.println("Impossible de fermer, démerde toi");
				e.printStackTrace();
			}
		}

		
		public char[][] getMap (String identifiant, int idMap )  throws IOException{	
			Connect();
			int Width;
			int Height;
			String[] tableauDecoupage = null;
			String stringSQl;
			ResultSet ligneSQL;
		
			ligneSQL = statement.executeQuery( "SELECT * WHERE idMap ==" + idMap + " " + "FROM info;");
			ligneSQL.next();
			Width = ligneSQL.getInt(2);	 
			Height = ligneSQL.getInt(3);
			
			char[][] tableMap = new char[Width][Height];
			
			
			for (int y = 0 ; y < (int) Height; y++){							
				ligneSQL = statement.executeQuery( "SELECT ligneMap WHERE idMap ==" + idMap + " AND " + "numLigneMap == "+ y + "FROM BaseMap;");
				tableauDecoupage = ligneSQL.split("");
				for(int x = 0; x< tableauDecoupage.length; x++){ 
					tableMap[x][y] = tableauDecoupage[x];						// TODO Refaire ce bloc de requettes avec ligneSql.next()
				}
			}

		
		
}


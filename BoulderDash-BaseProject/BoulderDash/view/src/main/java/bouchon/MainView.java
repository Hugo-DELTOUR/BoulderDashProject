package bouchon;

import java.io.IOException;

import view.BoulderDashView;

public class MainView {

	public static void main(String[] args) throws IOException {
		
		BoulderDashView welc = new BoulderDashView(new BouchonMap(), new BouchonRockford());
		welc.WelcomeScreen();
		
	}	
}

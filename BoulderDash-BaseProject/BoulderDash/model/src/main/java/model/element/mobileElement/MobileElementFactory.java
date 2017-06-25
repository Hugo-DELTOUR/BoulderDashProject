package model.element.mobileElement;

public class MobileElementFactory {
	
	/**
	*
	*
	*
	*/
	private static Diamond diamond = new Diamond();
	private static EnnemyDiamonds ennemyDiamonds = new EnnemyDiamonds();
	private static EnnemyPoints ennemyPoints = new EnnemyPoints();
	private static Rock rock = new Rock();
	private static Rockford rockford = new Rockford();
	private static Mobile[] mobileElement = {
		diamond,
		ennemyDiamonds,
		ennemyPoints,
		rock,
		rockford};
	
	public static Mobile createDiamond(){
		return diamond;
	}

	public static Mobile createEnnemyDiamonds(){
		return ennemyDiamonds;
	}

	public static Mobile createEnnemyPoints(){
		return ennemyPoints;
	}

	public static Mobile createRock(){
		return rock;
	}

	public static Mobile createRockford(){
		return rockford;
	}

	public Mobile getFromFileSymbol(final char fileSymbol){
		for (final Mobile mobileElement : mobileElement) {
			if (mobileElement.getSprite().getConsoleImage() == fileSymbol){
				return mobileElement;
			}
		}
		return rock;
	}
}

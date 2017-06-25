package controller;

import java.io.IOException;

	/**
	 * The BoulderDashController interface
	 * @author Robin
	 *
	 */

public interface IBoulderDashController {
	public void play() throws InterruptedException;
	public IOrderPerformer getOrderPerformer() throws IOException;
}

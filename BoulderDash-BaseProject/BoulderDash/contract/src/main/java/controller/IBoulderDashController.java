package controller;

import java.io.IOException;

public interface IBoulderDashController {
	public void play() throws InterruptedException;
	public IOrderPerformer getOrderPerformer() throws IOException;
}

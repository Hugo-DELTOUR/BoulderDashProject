package view;

import controller.IOrderPerformer;

public interface IBoulderDashView {
	public void displayMessage(String message);
	public void followRockford();
	public void setOrderPerformer(IOrderPerformer orderPerformer);
}

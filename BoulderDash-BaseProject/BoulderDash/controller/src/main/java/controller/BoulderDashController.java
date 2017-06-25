package controller;

import java.awt.Point;
import java.io.IOException;
import java.sql.SQLException;

import common.UserOrder;
import model.IBoulderDashModel;
import view.IBoulderDashView;

/**
 * <h1>The Class ControllerFacade provides a facade of the Controller
 * component.</h1>
 *
 * first @author Jean-Aymeric DIET jadiet@cesi.fr
 * second @author Robin MAISANO robin.maisano@viacesi.fr
 * 
 * @version 2.0
 */
public class BoulderDashController implements IBoulderDashController, IOrderPerformer {

	/** The constant speed 
	 * Game will be in 4Hz, 4 fps
	 */
	private static final int speed = 250;

	/** The view. */
	private IBoulderDashView view;

	/** The model. */
	private IBoulderDashModel model;

	/** The Stack Order, containing orders */
	private UserOrder stackOrder;

	/**
	 * Instantiates a new controller facade.
	 *
	 * @param view
	 *            the view
	 * @param model
	 *            the model
	 */
	public BoulderDashController(final IBoulderDashView view, final IBoulderDashModel model) {
		super();
		this.view = view;
		this.model = model;
		this.clearStackOrder();
	}

	public BoulderDashController() {

	}

	/**
	 * Game loop Start.
	 *
	 * @throws SQLException
	 *             the SQL exception
	 */
	public void play() throws InterruptedException {
		while (this.getModel().getRockford().isAlive()) {
			Thread.sleep(speed);
			switch (this.getStackOrder()) {
			case UP:
				this.getModel().getRockford().moveUp();
				break;
			case DOWN:
				this.getModel().getRockford().moveDown();
				break;
			case LEFT:
				this.getModel().getRockford().moveLeft();
				break;
			case RIGHT:
				this.getModel().getRockford().moveRight();
				break;
			case NOP:
			default:
				this.getModel().getRockford().doNothing();
				break;
			}
			this.clearStackOrder();
			if (this.getModel().getRockford().isAlive()) {
				this.getModel().getRockford().doNothing();
			}
			this.getView().followRockford();
			this.getModel().getMap().update();
		}
		
//		this.getModel().
		this.getView().displayMessage("You had a painful  death. RIP.");
	}

	
	/**
	 * Gets the view.
	 *
	 * @return the view
	 */
	public IBoulderDashView getView() {
		return this.view;
	}

	/**
	 * Sets the view
	 * 
	 * @param The
	 *            view
	 */
	public void setView(IBoulderDashView view) {
		this.view = view;
	}

	/**
	 * Gets the model.
	 *
	 * @return the model
	 */
	public IBoulderDashModel getModel() {
		return this.model;
	}

	/**
	 * Sets the model
	 * 
	 * @param The
	 *            Model
	 */
	public void setModel(IBoulderDashModel model) {
		this.model = model;
	}

	/**
	 * Gets the Stack Order
	 * 
	 * @return the Stack Order
	 */
	public UserOrder getStackOrder() {
		return this.stackOrder;
	}

	/**
	 * Sets the Stack Order
	 * 
	 * @param stackOrder
	 */
	public void setStackOrder(UserOrder stackOrder) {
		this.stackOrder = stackOrder;
	}

	/**
	 * Clear the Stack Order by setting it on "No Order Performed"
	 */
	public void clearStackOrder() {
		this.stackOrder = UserOrder.NOP;
	}

	/**
	 * Gets the Order Performer
	 * 
	 * @return The Controller Facade
	 */
	@Override
	public IOrderPerformer getOrderPerformer() {
		return this;
	}

	/**
	 * Sets the Stack Order and dealing with IOExceptions
	 * 
	 * @param userOrder
	 * @throws IOException
	 */
	@Override
	public final void orderPerform(UserOrder userOrder) throws IOException {
		this.setStackOrder(userOrder);
	}

}

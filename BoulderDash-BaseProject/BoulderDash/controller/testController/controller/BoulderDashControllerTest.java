package controller;

import static org.junit.Assert.assertEquals;

import java.io.IOException;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

import common.UserOrder;
import model.IBoulderDashModel;
import model.IMap;
import model.IMobile;
import view.IBoulderDashView;

public class BoulderDashControllerTest {

	// Declaration of the needed variables
	IBoulderDashView testView;
	IBoulderDashModel testModel;

	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
	}

	@AfterClass
	public static void tearDownAfterClass() throws Exception {
	}

	@Before
	public void setUp() throws Exception {
		// Instantiation of the TestView and TestModel
		// TODO Erase these functions and replace with real one
		testView = new BouchonIBoulderDashView();
		testModel = new BouchonIBoulderDashModel();

	}

	@After
	public void tearDown() throws Exception {
	}

	/**
	 * Setter and Getter for the View tested at the same time
	 */
	@Test
	public void testSetGetView() {
		// fail("Not yet implemented");
		BoulderDashController ctrl = new BoulderDashController();
		ctrl.setView(testView);
		assertEquals(testView, ctrl.getView());

	}

	/**
	 * Setter and Getter for the Model tested at the same time
	 */
	@Test
	public void testSetGetModel() {
		// fail("Not yet implemented");
		BoulderDashController ctrl = new BoulderDashController();
		ctrl.setModel(testModel);
		assertEquals(testModel, ctrl.getModel());
	}

	/**
	 * Setter and Getter for the Stack Order tested at the same time
	 */
	@Test
	public void testSetGetStackOrder() {
		// fail("Not yet implemented");
		final UserOrder expected = UserOrder.UP;
		BoulderDashController ctrl = new BoulderDashController();
		ctrl.setStackOrder(UserOrder.UP);
		assertEquals(expected, ctrl.getStackOrder());
	}

	/**
	 * Clearing the Stack Order test
	 */
	@Test
	public void testClearStackOrder() {
		// fail("Not yet implemented");
		final UserOrder expected = UserOrder.NOP;
		BoulderDashController ctrl = new BoulderDashController();
		ctrl.clearStackOrder();
		assertEquals(expected, ctrl.getStackOrder());
	}

	/**
	 * OrderPerform function test (Exceptions handled)
	 * 
	 * @throws IOException
	 */
	@Test
	public void testOrderPerform() throws IOException {
		// fail("Not yet implemented");
		final UserOrder expected = UserOrder.DOWN;
		BoulderDashController ctrl = new BoulderDashController();
		ctrl.orderPerform(UserOrder.DOWN);
		assertEquals(expected, ctrl.getStackOrder());
	}

	/**
	 * Temporary creation of classes from Interfaces until I got the real
	 * classes from my mates
	 * 
	 * @author Robin
	 *
	 */

	// TODO Erase this function when real one is disponible
	@Deprecated
	public static class BouchonIBoulderDashView implements IBoulderDashView {

		@Override
		public void displayMessage(String message) {

		}

		@Override
		public void followRockford() {

		}

		@Override
		public void setOrderPerformer(IOrderPerformer orderPerformer) {
			
		}

	}

	// TODO Erase this function when real one is disponible
	@Deprecated
	public static class BouchonIBoulderDashModel implements IBoulderDashModel {

		@Override
		public IMap getMap() {
			return null;
		}

		@Override
		public IMobile getRockford() {
			return null;
		}

		@Override
		public void updateModel() {
			
		}

	}

}

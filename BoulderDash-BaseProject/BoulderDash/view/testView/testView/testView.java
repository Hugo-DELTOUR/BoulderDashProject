package testView;

import static org.junit.Assert.assertEquals;

import java.awt.Component;
import java.awt.event.KeyEvent;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

import fr.exia.showboard.BoardFrame;
import view.BoulderDashView;

public class testView {
	
	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
	}

	@AfterClass
	public static void tearDownAfterClass() throws Exception {
	}

	private BoulderDashView view;

	@Before
	public void setUp() throws Exception {
		this.view = new BoulderDashView();
	}
	
	@After
	public void tearDown() throws Exception {
	}
	
	@Test
	public void displayMessage() {
		String str = "Hello";
		assertEquals(str,"Hello");
	}
	
	@Test
	public void show() {
		
		assertEquals();
	}
	
	@Test
	public void keyCodeToUserOrder() {
		int expected = KeyEvent.VK_RIGHT;
		BoardFrame instance = new BoardFrame();
		KeyEvent key = new KeyEvent(instance, KeyEvent.KEY_PRESSED, System.currentTimeMillis(), 0,  KeyEvent.VK_UP,'Z');
		assertEquals(expected,key);
	}

	@Test
	public void keyTyped() {
		
		assertEquals(key,view.getOrderPerformer());
	}
	
	@Test
	public void keyPressed() {
		
		assertEquals(key,view.getOrderPerformer());
	}
	
	@Test
	public void keyReleased() {
		assertEquals();
	}
	
	@Test
	public void followRockford() {
		assertEquals();
	}
}

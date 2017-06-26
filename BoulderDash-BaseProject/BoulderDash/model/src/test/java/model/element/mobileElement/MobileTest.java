package model.element.mobileElement;

import static org.junit.Assert.assertEquals;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

import common.Permeability;

public class MobileTest extends Mobile{

	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
	}

	@AfterClass
	public static void tearDownAfterClass() throws Exception {
	}
	private Mobile test;

	@Before
	public void setUp() throws Exception {
		this.test = new Mobile(0, 0, 'x', "titi", Permeability.PENETRABLE);
	}

	@After
	public void tearDown() throws Exception {
	}
	
	
	@Test
	public void testConsoleImage() {
		char test ='x';
		assertEquals(test, this.test.getConsoleImage());
	}
	@Test
	public void testSetX() {
		int x = 5;
		assertEquals(x, test.getX() );	}	
	@Test
	public void testSetY() {
		int y = 5;
		assertEquals(y, test.getY() );	}
	@Test
	
	public void testIsAlive() {
		Boolean alive = true;
		assertEquals(alive, test.isAlive() );	}

}

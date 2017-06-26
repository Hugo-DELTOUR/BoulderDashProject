package model;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

public class MapTest {

	private Map map;

	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
	}

	@AfterClass
	public static void tearDownAfterClass() throws Exception {
	}


	@Before
	public void setUp() throws Exception {
		this.map = new Map(null);
	}

	@After
	public void tearDown() throws Exception {
	}

	@Test
	public void testSetWidth() {
		int width = 0;
        assertEquals(width, map.getWidth());
	}

	@Test
	public void testSetHeigth() {
		int height = 0;
        assertEquals(height, map.getHeight());
	}

	

}

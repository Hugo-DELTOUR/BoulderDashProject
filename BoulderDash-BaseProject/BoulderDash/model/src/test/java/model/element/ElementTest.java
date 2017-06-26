package model.element;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Assert;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

import common.Permeability;
import common.Sprite;
import model.element.mobileElement.Mobile;


public class ElementTest  {

	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
	}

	@AfterClass
	public static void tearDownAfterClass() throws Exception {
	}

	private Mobile test;

	@Before
	public void setUp() throws Exception {
		this.test = new Mobile(0, 0, 'x', "titi", Permeability.BLOCKING);
	}

	@After
	public void tearDown() throws Exception {
	}

	@Test
	public void testSetSprite() {
		
		Sprite sprite2 = new Sprite('c', "titi");
		
		Assert.assertEquals(sprite2, sprite2.getSprite());
		
	}
	

}

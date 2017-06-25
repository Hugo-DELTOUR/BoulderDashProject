package model;

import static org.junit.Assert.*;

import java.io.IOException;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

import common.Permeability;
import junit.framework.Assert;
import model.element.mobileElement.Rockford;

public class BoulderDashModelTest extends BoulderDashModel {

	private BoulderDashModel Boulder;
	
	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
	}

	@AfterClass
	public static void tearDownAfterClass() throws Exception {
	}

	@Before
	public void setUp() throws Exception {
		this.Boulder = new BoulderDashModel();
	}

	@After
	public void tearDown() throws Exception {
	}

	@Test
	public void testSetMap() throws Exception {

		Map map = new Map("fg");
		assertEquals(map, Boulder.getMap());
	}
	
	@Test
	public void testSetRockford() throws IOException {

		Rockford rockford = new Rockford(Boulder.getRockford().getX(), Boulder.getRockford().getY(), 'c', "titi", Permeability.BLOCKING);
		assertEquals(rockford, Boulder.getRockford());
	}

}

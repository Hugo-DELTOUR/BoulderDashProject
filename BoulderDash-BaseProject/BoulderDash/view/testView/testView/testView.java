package testView;

import static org.junit.Assert.assertEquals;

import java.awt.event.KeyEvent;
import java.io.IOException;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

import Shared.IMap;
import Shared.IMobile;
import Shared.IOrderPerformer;
import bouchon.BouchonMap;
import bouchon.BouchonRockford;
import view.BoulderDashView;

public class testView {
	
	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
	}

	@AfterClass
	public static void tearDownAfterClass() throws Exception {
	}

	private BoulderDashView view;
	private IMap map;
	@Before
	public void setUp() throws Exception {
		this.view = new BoulderDashView(new BouchonMap(), new BouchonRockford());
	}
	
	@After
	public void tearDown() throws Exception {
	}
	
	@Test
	public void testDisplayMessage() {
		
	}
	
	@Test
	public void testShow() {
		
	}
	
	@Test
	public void testKeyCodeToUserOrder() {
		int expected = 39;
		assertEquals(expected,KeyEvent.VK_RIGHT);
	}

	@Test
	public void testKeyTyped() {
	}
	
	@Test
	public void testKeyPressed() {
		int expected = KeyEvent.VK_RIGHT;
		assertEquals(expected,39);
	}
	
	@Test
	public void testKeyReleased() {
	}
	
	@Test
	public void testFollowRockford() {
		
	}
	
	@Test
	public void testSetCloseView(){
		view.setCloseView(null);
		assertEquals(null, view.getCloseView());
	}
	
	@Test
	public void testSetView(){
		view.setView(1);
		assertEquals("setView",1, view.getView());
	}
	
	@Test
	public void testSetMap() throws IOException{
		view.setMap(map);
		assertEquals("setMap", map, view.getMap());
	}
	
	@Test
	public void testSetRockford(){
		IMobile rockford = null;
		view.setRockford(rockford);
		assertEquals("setRockford", rockford, view.getRockford());
	}
	
	@Test
	public void testSetOrderPerformer(){
		IOrderPerformer orderPerformer = null;
		view.setOrderPerformer(orderPerformer);
		assertEquals("setOrderPerformer", orderPerformer, view.getOrderPerformer());
	}
	
}

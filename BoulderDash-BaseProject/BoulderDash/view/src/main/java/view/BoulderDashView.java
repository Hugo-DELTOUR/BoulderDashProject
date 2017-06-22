package view;


import java.awt.Dimension;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.Insets;
import java.awt.Rectangle;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.io.File;
import java.io.IOException;

import javax.imageio.ImageIO;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.SwingUtilities;

import Shared.IBoulderDashView;
import Shared.IElement;
import Shared.IMap;
import Shared.IMobile;
import Shared.IOrderPerformer;
import Shared.UserOrder;
import bouchon.BouchonMap;
import bouchon.BouchonRockford;
import fr.exia.showboard.BoardFrame;
import fr.exia.showboard.IPawn;
import fr.exia.showboard.ISquare;

public class BoulderDashView implements IBoulderDashView, Runnable, KeyListener{
	
	private int mapView = 10;
	private int squareSize = 20;
	private Rectangle closeView;
	private int view = 600;
	private IMap map;
	private IMobile rockford;
	private IOrderPerformer orderPerformer;
	
    public BoulderDashView(IMap map, IMobile rockford) throws IOException {
        this.setView(mapView);
        this.setMap(map);
        this.setRockford(rockford);
        this.getRockford();
      	this.setCloseView(new Rectangle(0, this.getRockford().getY(), this.getMap().getWidth(), mapView));
        SwingUtilities.invokeLater(this);	
    }
	
	public void displayMessage(String message) {
		JOptionPane.showMessageDialog(null, message);
		System.out.print(message);
	}
	
	@Override
    public final void run(){
    	final BoardFrame boardFrame = new BoardFrame("BoulderDash");
    	boardFrame.setDimension(new Dimension(this.getMap().getWidth(), this.getMap().getHeight()));
    	boardFrame.setDisplayFrame(this.closeView);
    	boardFrame.setSize(600, 400);
    	boardFrame.addKeyListener(this);
    	boardFrame.setFocusable(true);
    	boardFrame.setResizable(true);
    	boardFrame.setFocusTraversalKeysEnabled(false);
    	
    	for(int x = 0; x < this.getMap().getWidth(); x++){
    		for(int y = 0; y < this.getMap().getHeight(); y++){
    			boardFrame.addSquare((ISquare) this.map.getOnTheMapXY(x, y), x, y);
    		}
    	}
    	
    	boardFrame.addPawn((IPawn) this.getRockford());
    	
    	this.getMap().getObservable().addObserver(boardFrame.getObserver());
    	this.followRockford();
		try {
			boardFrame.setContentPane(new JLabel(new ImageIcon(ImageIO.read(new File("C:\\Users\\delto\\Downloads\\BoulderDashProject-master\\BoulderDashBackground.jpg")))));
		} catch (IOException e) {
			e.printStackTrace();
		}

    	boardFrame.setVisible(true);
    	
    }
    
    public void show(int yStart){
    	int y = yStart % this.getMap().getHeight();
    	for(int view = 0; view< this.getView(); view++){
    		for(int x = 0; x < this.getMap().getWidth(); x++){
    			if((x == this.getRockford().getX()) && (y == yStart)){
    				System.out.print(((IElement)this.getRockford()).getSprite().getConsoleImage());
    			}
    			else{
    				System.out.print(((IElement)this.getMap().getOnTheMapXY(x, y)).getSprite().getConsoleImage());
    			}
    		}
    		y = (y+1) % this.getMap().getHeight();
    		System.out.print("\n");
    	}
    }
    
    public UserOrder keyCodeToUserOrder(int keyCode){
    	UserOrder userOrder;
    	
    	switch(keyCode){
    	case KeyEvent.VK_LEFT:	
    		userOrder = UserOrder.LEFT;
    		break;
    		
    	case KeyEvent.VK_UP:
    		userOrder = UserOrder.UP;
    		break;
    		
    	case KeyEvent.VK_RIGHT:
    		userOrder = UserOrder.RIGHT;
    		break;
    		
    	case KeyEvent.VK_DOWN:
    		userOrder = UserOrder.DOWN;
    		break;
    		
    	default:
    		userOrder = UserOrder.NOP;
    		break;
    	}
    	
    	return userOrder;
    }
    
    public void keyTyped(KeyEvent keyEvent){
    	
    }
    
    public void keyPressed(KeyEvent keyEvent){
    	int keyCode = keyEvent.getKeyCode();
    	if(keyCode == KeyEvent.VK_RIGHT){
    		rockford.moveRight();
    	}
    	else if(keyCode == KeyEvent.VK_LEFT){
    		rockford.moveLeft();
    	}
    	else if(keyCode == KeyEvent.VK_UP){
    		rockford.moveUp();
    	}
    	else if(keyCode == KeyEvent.VK_DOWN){
    		rockford.moveDown();
    	}
    	else{
    		rockford.doNothing();
    	}
    }
    
    public void keyReleased(KeyEvent keyEvent){
    	
    	int keyCode = keyEvent.getKeyCode();
    	
    	if(keyCode == KeyEvent.VK_RIGHT){
    		rockford.moveRight();
    	}
    	else if(keyCode == KeyEvent.VK_LEFT){
    		rockford.moveLeft();
    	}
    	else if(keyCode == KeyEvent.VK_UP){
    		rockford.moveUp();
    	}
    	else if(keyCode == KeyEvent.VK_DOWN){
    		rockford.moveDown();
    	}
    	else{
    		rockford.doNothing();
    	}
    }
    
    public void followRockford(){
    	
    	this.getCloseView().y = this.getRockford().getY() - 3;
    	
    	this.getCloseView().x = this.getRockford().getX() - 3;
    	
    }

	public Rectangle getCloseView() {
		return this.closeView;
	}

	public void setCloseView(Rectangle closeView) {
		this.closeView = closeView;
	}

	public int getView() {
		return this.view;
	}

	public void setView(int view) {
		this.view = view;
	}

	public IMap getMap() {
		return this.map;
	}
	
	public void setMap(IMap map) throws IOException{
		this.map = map;
		for(int x = 0; x < this.getMap().getWidth(); x++){
			for(int y = 0; y< this.getMap().getHeight(); y++){
				this.getMap().getOnTheMapXY(x, y).getSprite().loadedImage();
			}
		}
	}
	
	public IMobile getRockford() {
		return this.rockford;
	}
	
	public void setRockford(IMobile rockford) {
		this.rockford = rockford;
	}
	
	public IOrderPerformer getOrderPerformer() {
		return this.orderPerformer;
	}
	
	public void setOrderPerformer(IOrderPerformer orderPerformer) {
		this.orderPerformer = orderPerformer;
	}
}

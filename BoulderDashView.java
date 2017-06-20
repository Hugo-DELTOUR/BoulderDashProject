package view;

import java.awt.Dimension;
import java.awt.Rectangle;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

import Shared.IBoulderDashView;
import Shared.IMap;
import Shared.IMobile;
import Shared.IOrderPerformer;
import Shared.UserOrder;
import fr.exia.showboard.BoardFrame;

public class BoulderDashView implements IBoulderDashView ,Runnable ,KeyListener {
	
	private int mapView;
	private int squareSize;
	private Rectangle closeView;
	private int view;
	private IMap map;
	private IMobile rockford;
	private IOrderPerformer orderPerformer;

    public BoulderDashView() {
        this.setView(mapView);
        this.setMap(map);
    }
	
	public void displayMessage(String message) {
		System.out.println(message);
	}
	
    public void run(){
    	final BoardFrame boardFrame = new BoardFrame("Close");
    	boardFrame.setDimension(new Dimension(this.getMap().getWidth(), this.getMap().getHeight()));
    	boardFrame.setDisplayFrame(this.closeView);
    	boardFrame.setSize(this.closeView.width * squareSize, this.closeView.height * squareSize);
    	boardFrame.setHeightLooped(true);
    	boardFrame.addKeyListener(this);
    	boardFrame.setFocusable(true);
    	boardFrame.setFocusTraversalKeysEnabled(false);
    	
    	for(int x = 0; x<this.getMap().getWidth(); x++){
    		for(int y = 0; y<this.getMap().getHeight(); y++){
    			
    		}
    	}
    	
    	this.getMap().getObservable().addObserver(boardFrame.getObserver());
    	this.followRockford();
    	
    	boardFrame.setVisible(true);
    	
    }
    
    public void show(int yStart){
    	
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
    	
    }
    
    public void keyReleased(KeyEvent keyEvent){
    	
    }
    
    public void followRockford(){
    	
    }

	public Rectangle getCloseView() {
		return closeView;
	}

	public void setCloseView(Rectangle closeView) {
		this.closeView = closeView;
	}

	public int getView() {
		return view;
	}

	public void setView(int view) {
		this.view = view;
	}

	public IMap getMap() {
		return map;
	}

	public void setMap(IMap map) {
		this.map = map;
	}

	public IMobile getRockford() {
		return rockford;
	}

	public void setRockford(IMobile rockford) {
		this.rockford = rockford;
	}
	
	public IOrderPerformer getOrderPerformer() {
		return orderPerformer;
	}
	
	public void setOrderPerformer(IOrderPerformer orderPerformer) {
		this.orderPerformer = orderPerformer;
	}
}

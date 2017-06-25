package main;

import controller.BoulderDashController;
import controller.IBoulderDashController;
import model.BoulderDashModel;
import model.IBoulderDashModel;
import view.IBoulderDashView;

/**
 * <h1>The Class Main.</h1>
 *
 * @author Robin Maisano - robin.maisano@viacesi.fr
 * @version 1.0
 */
public abstract class Main {

	private static final int mapCharged = 1;
	private static final int startX = 1;
	private static final int startY = 1;
	
    /**
     * The main method.
     *
     * @param args
     *            the arguments
     */
    public static void main(final String[] args){
        final IBoulderDashModel model = new BoulderDashModel(mapCharged, startX, startY);
        final IBoulderDashView view = new BoulderDashView(model.getMap(), model.getRockford());
    	final IBoulderDashController controller = new BoulderDashController(view, model);
    	view.setOrderPerformer(controller.getOrderPerformer());
        controller.play();
        }
    }

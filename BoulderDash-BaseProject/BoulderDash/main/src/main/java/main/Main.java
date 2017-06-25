package main;

import controller.IBoulderDashController;
import model.IBoulderDashModel;
import view.IBolderDashView;

/**
 * <h1>The Class Main.</h1>
 *
 * @author Robin Maisano - robin.maisano@viacesi.fr
 * @version 1.0
 */
public abstract class Main {

	x
	private static final int mapCharged = 1;
	private static final int startX;
	private static final int startY;
	
    /**
     * The main method.
     *
     * @param args
     *            the arguments
     */
    public static void main(final String[] args) throw Exceptions {
        final IBoulderDashModel model = new BoulderDashModel(mapCharged, startX, startY);
        final IBoulderDashView view = new BoulderDashView(model.getMap(), model.getRockford());
    	final IBoulderDashController controller = new BoulderDashController(view, model);
    	view.setOrderPerformer(controller.getOrderPerformer);
        controller.play();
        }
    }

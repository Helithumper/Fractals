package trees;

import javax.swing.JApplet;
import javax.swing.JPanel;

public class FractalTreeRunner extends JApplet {

	private static final int APPLET_WIDTH = 1000;
	private static final int APPLET_HEIGHT = 1000;
	
	private FractalTree graphic;
	private JPanel appletPanel;
	
	public void init(){
		graphic = new FractalTree(APPLET_WIDTH,APPLET_HEIGHT);
		appletPanel = new JPanel();
		appletPanel.add(graphic);
		getContentPane().add(appletPanel);
		setSize(APPLET_WIDTH,APPLET_HEIGHT);
	}
}
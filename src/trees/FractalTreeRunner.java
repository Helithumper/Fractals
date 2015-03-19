package trees;

import javax.swing.JApplet;
import javax.swing.JPanel;

public class FractalTreeRunner extends JApplet {

	private final int APPLET_WIDTH = 2000;
	private final int APPLET_HEIGHT = 2000;
	
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
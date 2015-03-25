package trees;

import java.util.Scanner;

import javax.swing.JApplet;
import javax.swing.JPanel;

public class FractalTreeRunner extends JApplet {

	private static final int APPLET_WIDTH = 1000;
	private static final int APPLET_HEIGHT = 1000;
	
	private FractalTree graphic;
	private JPanel appletPanel;
	
	public void init(){
		System.out.println("Please enter a number between 1 and 1000 (365 is Optimal, 1 is for the pure fractal)");
		Scanner reader = new Scanner(System.in);
		int input = reader.nextInt();
		graphic = new FractalTree(APPLET_WIDTH,APPLET_HEIGHT,input);
		appletPanel = new JPanel();
		appletPanel.add(graphic);
		getContentPane().add(appletPanel);
		setSize(APPLET_WIDTH,APPLET_HEIGHT);
	}
}
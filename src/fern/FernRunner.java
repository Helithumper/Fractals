package fern;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Toolkit;

import javax.swing.JApplet;
import javax.swing.JPanel;

public class FernRunner extends JApplet {
  private final int APPLET_WIDTH = 1920;
  private final int APPLET_HEIGHT = 1080;
  
  private FernFractal drawing;
  private JPanel appletPanel;
  
  public void init() {

	Dimension dim = Toolkit.getDefaultToolkit().getScreenSize();
    drawing = new FernFractal(dim.width, dim.height);
    appletPanel = new JPanel();
    appletPanel.add(drawing);
    appletPanel.setBackground(Color.BLACK);
    getContentPane().add(appletPanel);
    setSize(APPLET_WIDTH, APPLET_HEIGHT);
  }
}
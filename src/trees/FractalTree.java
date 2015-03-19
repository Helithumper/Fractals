package trees;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Graphics;

import javax.swing.JPanel;

public class FractalTree extends JPanel {

	public FractalTree(int PANEL_WIDTH, int PANEL_HEIGHT) {
		setBackground(Color.BLUE);
		setPreferredSize(new Dimension(PANEL_WIDTH, PANEL_HEIGHT));
	}

	// Recursive Method
	int i = 0;
	int j = 0;
	int k = 0;
	private void drawTree(Graphics g, int x1, int y1, double angle, int depth) {
		if (depth == 0) {
			return;
		}
		i++;
		j++;
		k++;
		int x2 = x1 + (int) (Math.cos(Math.toRadians(angle)) * depth * 5.0);
		int y2 = y1 + (int) (Math.sin(Math.toRadians(angle)) * depth * 5.0);
		g.drawLine(x1, y1, x2, y2);
		drawTree(g, x2, y2, angle - 15, depth - 1);
		drawTree(g, x2, y2, angle + 15, depth - 1);
		g.setColor(new Color(i%255,j%255,k%255,255));
	}
	
	public void paintComponent(Graphics g){
		super.paintComponent(g);
		g.setColor(Color.PINK);
		drawTree(g,200,450,-90,21);
	}
}

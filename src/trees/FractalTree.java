package trees;

import java.awt.BasicStroke;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.RenderingHints;

import javax.swing.JPanel;

public class FractalTree extends JPanel {

	public FractalTree(int PANEL_WIDTH, int PANEL_HEIGHT) {
		setBackground(Color.BLACK);
		setPreferredSize(new Dimension(PANEL_WIDTH, PANEL_HEIGHT));
	}

	// Recursive Method
	int i = 0;
	int j = 75;
	int k = 150;
	Graphics2D g2d;

	private void drawTree(Graphics g, int x1, int y1, double angle, int depth) {
		if (depth == 0) {
			return;
		}
		i += 30;
		j += 30;
		k += 30;
		int x2 = x1 + (int) (Math.cos(Math.toRadians(angle)) * depth * 5);
		int y2 = y1 + (int) (Math.sin(Math.toRadians(angle)) * depth * 5);// <<2;
		g2d = (Graphics2D) g;
		g2d.setRenderingHint(RenderingHints.KEY_ANTIALIASING,
				RenderingHints.VALUE_ANTIALIAS_ON);
		g2d.setStroke(new BasicStroke(.75f * depth, BasicStroke.CAP_ROUND,
				BasicStroke.JOIN_MITER));
		g.drawLine(x1, y1, x2, y2);
		int newAngle = (int) (angle) << 11;
		drawTree(g, x2, y2, newAngle - 30, depth - 1);
		drawTree(g, x2, y2, newAngle + 30, depth - 1);
		g.setColor(new Color(i % 255, 20, 25, 255));
	}
	static int index;
	
	public void paintComponent(Graphics g) {
		super.paintComponent(g);
		g.setColor(new Color(0, 20, 25, 255));
		for (int index = 0; index < 365; index++) {
			System.out.println(index);
			drawTree(g, 300, 300, index, 12);
		
	}
	}
}

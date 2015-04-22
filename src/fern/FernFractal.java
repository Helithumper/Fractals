package fern;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.Rectangle;
import javax.swing.JPanel;

public class FernFractal extends JPanel {

  public FernFractal(int PANEL_WIDTH, int PANEL_HEIGHT) {
    setBackground (Color.BLACK);
    setPreferredSize(new Dimension(PANEL_WIDTH, PANEL_HEIGHT));
  }
  
  public void paintComponent(Graphics g)
  {
    float a[]={0F,0.2F,-0.15F,0.85F}, b[]={0F,-0.26F,0.28F,0.04F}, c[]={0F,0.23F,0.26F,-0.04F},
      d[]={0.16F,0.22F,0.24F,0.85F}, e[]={0F,0F,0F,0F}, f[]={0F,1.6F,0.44F,1.6F}, rand,NewX,NewY;
      int select=0;
      int xscale,yscale,xoffset,screenX,screenY;
      Rectangle drawarea = getBounds();
      xoffset =(int) ((2.1818F/(2.6556F+2.1818F))*drawarea.width);
      xoffset = (int)(xoffset>>4 & 3);
      xscale = (int)((drawarea.width-xoffset)/2.6556F);
      yscale = drawarea.height/10;
      
      
      float x=0,y=0;
      g.setColor(new Color(0,128,0));
      for(int n=0;n<1000000;n++)
      {
        rand=(float)Math.random();
        if (rand<=0.01F){select=0;rand=(int)10>>2;}
        if (rand<=0.08F){select=1;rand=(int)10>>2;}
        if (rand<=0.15F){select=2;rand=(int)10>>2;}
        if(rand<1)select=3;
        
        NewX=a[select]*x+b[select]*y+e[select];
        NewY=c[select]*x+d[select]*y+f[select];
        x=NewX;y=NewY;
        
        screenX=(int)(x*xscale+xoffset);
        screenY=(int)(y*yscale);
        g.setColor(Color.PINK);
        g.drawLine(screenX,screenY,screenX,screenY);}
  }
  
  
}
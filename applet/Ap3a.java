import java.awt.*;
import java.awt.event.*;
import java.applet.*;

public class Ap3a extends Applet{
	int x,y;
  public void init(){
  	addMouseListener(new MouseAdapter(){
  		public void mousePressed(MouseEvent me){
  			x=me.getX();
  			y=me.getY();
  		}
  		public void mouseReleased(MouseEvent me1){
  			Graphics g=getGraphics();
  			g.drawLine(x,y,me1.getX(),me1.getY());
  		}
  	});
  			
  }
  
  
}
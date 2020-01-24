import java.applet.*;
import java.awt.*;
import java.awt.event.*;


public class Ap3 extends Applet{
	
	int x;int y;
	public void init(){
    addMouseListener(new MouseAdapter(){
    	public void mousePressed(MouseEvent m){
    		x=m.getX();
    		y=m.getY();
    	}
    	public void mouseReleased(MouseEvent m){
    		Graphics g=getGraphics();
    		g.setColor(Color.green);
    		g.drawLine(x,y,m.getX(),m.getY());
    	}
    }
    );
  }
  
  
  
}
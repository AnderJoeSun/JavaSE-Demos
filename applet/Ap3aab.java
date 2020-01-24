import java.awt.*;
import java.applet.*;
import java.awt.event.*;

public class Ap3aab extends Applet{
	int x;
	int y;
	public void init(){
		
		addMouseListener(new MouseAdapter(){
			public void mousePressed(MouseEvent e){
				x=e.getX();
				y=e.getY();
			}
			public void mouseReleased(MouseEvent es){
				Graphics g=getGraphics();
				g.drawLine(x,y,es.getX(),es.getY());
			}
		});
		
	}
	
}
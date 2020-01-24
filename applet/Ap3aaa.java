import java.awt.*;
import java.applet.*;
import java.awt.event.*;

public class Ap3aaa extends Applet{
	public void init(){
		int x;
		int y;
		addMouseListener(new MouseAdapter(){
			public void mousePressed(MouseEvent e){
				x=e.getX();
				y=e.getY();
			}
			public void mouseReleased(MouseEvent es){
				Graphics g=new Graphics();
				g.drawLine(x,y,es.getX(),es.getY());
			}
		});
		
	}
	
}
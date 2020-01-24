import java.awt.*;
import java.applet.*;

public class Ap5aaa extends Applet{
	Image im;
	public void init(){
		
		im=getImage(getCodeBase(),"T1.gif");
	
		
	}
	public void paint(Graphics g){
		g.drawImage(im,0,0,this);
	}
}

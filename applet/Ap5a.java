import java.applet.*;
import java.awt.*;

public class Ap5a extends Applet{
	Image img;
	public void init(){
		img=getImage(getDocumentBase(),"T1.gif");
	}
	
	public void paint(Graphics g){
		
		g.drawImage(img,0,0,this);
	}
}
		
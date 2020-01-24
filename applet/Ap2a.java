import java.applet.*;
import java.awt.*;

public class Ap2a extends Applet{
	String s;
	public void init(){
		s=getParameter("font");
	}
	
	public void paint(Graphics g){
		Font f=new Font(s,Font.BOLD,30);
		g.setFont(f);
		g.drawString(new String("Joyu loves Molyn.."),20,30);
	}
}
		
	
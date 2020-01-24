import java.awt.*;
import java.applet.*;

public class Ap2aaa extends Applet{
	String str;
	public void init(){
		str=getParameter("font");
	}
	public void paint(Graphics g){
		Font f=new Font(str,Font.BOLD,30);
		g.setFont(f);
		g.drawString("Joyu loves Saiyu!",0,30);
	}
}
		
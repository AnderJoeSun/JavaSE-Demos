import java.applet.*;
import java.awt.*;

public class Ap2 extends Applet{
	String fontStr;
	
	public void init(){
    System.out.println("Init");
    fontStr=getParameter("font");
  }
  
  public void paint(Graphics g){
  	Font f=new Font(fontStr,Font.BOLD,30);
  	g.setFont(f);
  	g.setColor(Color.blue);
  	g.drawString("���㰮��Molyn",0,30);
  }
}


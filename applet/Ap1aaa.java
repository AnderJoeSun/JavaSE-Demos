import java.applet.*;
import java.awt.*;

public class Ap1aaa extends Applet{
	
	public void init(){
		System.out.println("init");
	}
	public void start(){
		System.out.println("start");
	}
	public void stop(){
		System.out.println("stop");
	}
	public void destroy(){
		System.out.println("destroy");
	}
	public void paint(Graphics g){
		Font f=new Font("����GB_2312",Font.BOLD,30);
		g.setFont(f);
		g.drawString("Joyu loves Saiyu!",0,50);
	}
}
	
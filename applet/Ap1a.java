import java.applet.*;
import java.awt.*;

public class Ap1a extends Applet{
	public void init(){
		System.out.println("Init");
	}
	
	public void start(){
		System.out.println("Start");
	}
	
	public void stop(){
		System.out.println("Stop");
	}
	
	public void destroy(){
		System.out.println("Destroy!");
	}
	
	public void paint(Graphics g){
		String a=new String("Joyu loves Molyn..");
		g.setColor(Color.blue);
		Font f=new Font("ø¨ÃÂGB_2312",Font.BOLD,30);
		g.setFont(f);
		g.drawString(a,30,30);
	}
}
		
		
		
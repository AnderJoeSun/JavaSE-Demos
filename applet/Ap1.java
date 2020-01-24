import java.awt.*;

import java.applet.*;

public class Ap1 extends Applet{
	
		public void init(){
			System.out.println("Init!");
		}
		public void start(){
			System.out.println("Start!");
		}
		public void stop(){
			System.out.println("Stop!");
		}
		public void destroy(){
			System.out.println("Destroy!");
		}
		public void paint(Graphics g){
			Font f=new Font("ø¨ÃÂGB_2312",Font.BOLD,30);
			g.setFont(f);
			g.drawString("Joyu loves Molyn...",0,20);
		}
	
}

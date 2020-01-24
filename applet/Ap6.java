import java.awt.*;
import java.applet.*;

public class Ap6 extends Applet{
	Image[] im;
	int total=10;
	int current;
	public void init(){
		im=new Image[total];
		for(int i=0;i<total;i++){
			im[i]=getImage(getDocumentBase(),"T"+(i+1)+".gif");
		}
	}
	public void start(){
		current=0;
	}
	public void paint(Graphics g){
		g.drawImage(im[current],0,0,this);
		current=++current%10;
		try{
			Thread.sleep(300);
		}catch(Exception e){
			e.printStackTrace();
		}
		repaint();
	}
	
	
	
}
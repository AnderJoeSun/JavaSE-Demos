import java.applet.*;
import java.awt.*;

public class Ap7aaa extends Applet{
	Image img;
	Image[] im;
	Graphics g;
	int total=10;
	int current;
	MediaTracker mt;
	
	public void init(){
		mt=new MediaTracker(this);
		im=new Image[total];
		for(int i=0;i<total;i++){
			im[i]=getImage(getCodeBase(),"T"+i+".gif");
			mt.addImage(im[i],i);
		}
		img=createImage(600,400);
		g=img.getGraphics();
		g.setColor(Color.white);
		g.fillRect(0,0,600,400);
		try{
			mt.waitForID();
		}catch(Exception e){
			e.printStackTrace();
		}
	}
	
	public void start(){
		current=0;
		g.drawImage(im[0],0,0,this);
		current=1;
	}
	
	public void paint(Graphics gh){
		gh.drawImage(img,0,0,this);
		mt.checkID(current,
		g.fillRect(0,0,600,400);
		g.drawImage(im[current],0,0,this);
		current=++current%10;
		try{
			Thread.sleep(30);
		}catch(Exception e){
			e.printStackTrace();
		}
		repaint();
	}
	
	public void update(Graphics ghs){
		paint(ghs);
	}
	
}
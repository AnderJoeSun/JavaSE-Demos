import java.awt.*;
import java.applet.*;

public class Ap7 extends Applet{
	Image[] im;
	int total=10;
	int current;
	Image img;
	Graphics g;
	public void init(){
		img=createImage(600,400);
		g=img.getGraphics();//创建g用来放img;它可看成是一个缓存区。
		g.setColor(Color.white);
		g.fillRect(0,0,600,400);
		im=new Image[total];
		for(int i=0;i<total;i++){
			im[i]=getImage(getCodeBase(),"T"+(i+1)+".gif");
		}
		
		
	}
	public void start(){
	  current=0;
	  g.drawImage(im[0],0,0,this);
	  current=1;
	}
	public void paint(Graphics gh){
		gh.drawImage(img,0,0,this);//画装在g中的img[0]。
		g.fillRect(0,0,600,400);
		g.drawImage(im[current],0,0,this);//把im[1]放入g中,
		//赋给或使其成为img,当又
		//第i次循环到此时，把im[i]放入g中，赋给或使其成为img;
		current=++current%10;
		try{
			Thread.sleep(100);
		}catch(Exception e){
			e.printStackTrace();
		}
		
		repaint();
	}
	public void update(Graphics ghs){
		paint(ghs);
	}
}
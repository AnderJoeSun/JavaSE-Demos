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
		g=img.getGraphics();//����g������img;���ɿ�����һ����������
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
		gh.drawImage(img,0,0,this);//��װ��g�е�img[0]��
		g.fillRect(0,0,600,400);
		g.drawImage(im[current],0,0,this);//��im[1]����g��,
		//������ʹ���Ϊimg,����
		//��i��ѭ������ʱ����im[i]����g�У�������ʹ���Ϊimg;
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
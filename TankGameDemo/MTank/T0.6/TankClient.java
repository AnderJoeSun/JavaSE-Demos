import java.awt.*;
import java.awt.event.*;

public class TankClient extends Frame{
	int x=50;
	int y=50;
	public static final int GAME_WIDTH=800;
	public static final int GAME_HEIGHT=600;
	Image offScreenImage=null;
	
	public void paint(Graphics g){
		
		Color c=g.getColor();//����g��ԭɫ��Ĭ��Ϊ�ڡ�
		g.setColor(Color.RED);//���ʵ�ɫ�óɺ�ɫ��
		g.fillOval(x,y,30,30);//�ú�ɫ�Ļ���g������
	  g.setColor(c);//�ָ�ԭɫ��
	  
	  
	  new Thread(new PaintThread()).start();
	}
	
	public void update(Graphics g){
		if(offScreenImage==null){
			offScreenImage=this.createImage(GAME_WIDTH,GAME_HEIGHT);
		}
		Graphics gOffScreen=offScreenImage.getGraphics();
		Color c=gOffScreen.getColor();
		gOffScreen.setColor(Color.GREEN);
		gOffScreen.fillRect(0,0,GAME_WIDTH,GAME_HEIGHT);
		gOffScreen.setColor(c);
		paint(gOffScreen);
		g.drawImage(offScreenImage,0,0,this);
		//��������˳��paint>repaint()>update()>paint();
		
		
		
		
	}
			
		
		
	
	private class PaintThread implements Runnable{
		public void run(){
			while(true){
				try{
	  	Thread.sleep(100);
	    }catch(Exception e){
	  	e.printStackTrace();
	    }
	    repaint();
			}
		}
	}
			
	public void lauchFrame(){
		this.setLocation(400,300);
		this.setSize(GAME_WIDTH,GAME_HEIGHT);
		this.addWindowListener(new WindowAdapter(){
			public void windowClosing(WindowEvent e){
				System.exit(0);
			}
		}
		);
		this.setTitle("TankWar");
		this.addKeyListener(new KeyMonitor());
		this.setBackground(Color.GREEN);
		this.setResizable(false);
		this.setVisible(true);
	}
	
	public static void main(String arg[]){
		TankClient tc=new TankClient();
		tc.lauchFrame();
	}
	
	private class KeyMonitor extends KeyAdapter{
		public void keyPressed(KeyEvent e){
			int Key=e.getKeyCode();
			switch(Key){
				case KeyEvent.VK_LEFT:
				   x-=5;
				   break;
				case KeyEvent.VK_RIGHT:
				   x+=5;
				   break;
				case KeyEvent.VK_UP:
				   y-=5;
				   break;
				case KeyEvent.VK_DOWN:
				   y+=5;
				   break;
			}
		}
	} 
				   
	
}













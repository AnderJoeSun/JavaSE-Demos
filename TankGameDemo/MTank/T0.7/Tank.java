import java.awt.*;
import java.awt.event.*;

class Tank extends Frame{
	int x;
	int y;
	
	public Tank(int x,int y){
		this.x=x;
		this.y=y;
		
	}
	
	public void paint(Graphics g){
		
		Color c=g.getColor();//����g��ԭɫ��Ĭ��Ϊ�ڡ�
		g.setColor(Color.RED);//���ʵ�ɫ�óɺ�ɫ��
		g.fillOval(x,y,30,30);//�ú�ɫ�Ļ���g������
	  g.setColor(c);//�ָ�ԭɫ��
	  
	 
	}
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

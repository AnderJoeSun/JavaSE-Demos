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
		
		Color c=g.getColor();//画笔g的原色，默认为黑。
		g.setColor(Color.RED);//画笔的色置成红色。
		g.fillOval(x,y,30,30);//用红色的画笔g画饼。
	  g.setColor(c);//恢复原色。
	  
	 
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

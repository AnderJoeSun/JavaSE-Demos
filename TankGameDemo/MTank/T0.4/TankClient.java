import java.awt.*;
import java.awt.event.*;

public class TankClient extends Frame{
	int x=50;
	int y=50;
	
	public void paint(Graphics g){
		
		Color c=g.getColor();//画笔g的原色，默认为黑。
		g.setColor(Color.RED);//画笔的色置成红色。
		g.fillOval(x,y,30,30);//用红色的画笔g画饼。
	  g.setColor(c);//恢复原色。
	  
	  y+=5;
	  new Thread(new PaintThread()).start();
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
		this.setSize(800,600);
		this.addWindowListener(new WindowAdapter(){
			public void windowClosing(WindowEvent e){
				System.exit(0);
			}
		}
		);
		this.setBackground(Color.GREEN);
		this.setResizable(false);
		this.setVisible(true);
	}
	
	public static void main(String arg[]){
		TankClient tc=new TankClient();
		tc.lauchFrame();
	}
}


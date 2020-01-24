import java.awt.*;
import java.awt.event.*;

public class TankClient extends Frame{
	
	public void paint(Graphics g){
		
		Color c=g.getColor();//画笔g的原色，默认为黑。
		g.setColor(Color.RED);//画笔的色置成红色。
		g.fillOval(50,50,30,30);//用红色的画笔g画饼。
	  g.setColor(c);//恢复原色。
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


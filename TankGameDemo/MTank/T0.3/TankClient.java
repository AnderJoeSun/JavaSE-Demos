import java.awt.*;
import java.awt.event.*;

public class TankClient extends Frame{
	
	public void paint(Graphics g){
		
		Color c=g.getColor();//����g��ԭɫ��Ĭ��Ϊ�ڡ�
		g.setColor(Color.RED);//���ʵ�ɫ�óɺ�ɫ��
		g.fillOval(50,50,30,30);//�ú�ɫ�Ļ���g������
	  g.setColor(c);//�ָ�ԭɫ��
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

import java.awt.*;
import java.awt.event.*;
import java.applet.*;

public class Ap5 extends Applet{
	Image im;
	public void init(){
		//im=getImage(getDocumentBase(),"T1.gif");//getDocumentBase()��
		//����Applet�����ص��ࣨ��������Ap5.java�������ɵ�Ap5.class)����Ŀ¼��URL;
		im=getImage(getCodeBase(),"T1.gif");//getImage(getCodeBase()�Ƿ���
		//����Applet��html�ļ�����Ŀ¼��URL������Ϊ�Ұ�Applet���ֽ����ļ�����
		//class�ļ����������Applet�����html�ļ�����һ�𣬹����ַ��������Ľ����
		//һ���ģ�
	}
	public void paint(Graphics g){
		g.drawImage(im,0,0,this);//thisָ��Applet��һ������,�ڴ˾���
		//ָ��Ap5�������⣬g.drawImage(im,0,0,this)����ֻ����public void paint(Graphics g)
		//������ʹ�ã�
	}
}
	
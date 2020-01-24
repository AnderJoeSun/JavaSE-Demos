import java.awt.*;
import java.awt.event.*;
import java.applet.*;

public class Ap5 extends Applet{
	Image im;
	public void init(){
		//im=getImage(getDocumentBase(),"T1.gif");//getDocumentBase()是
		//返回Applet所加载的类（在这里是Ap5.java编译生成的Ap5.class)所在目录的URL;
		im=getImage(getCodeBase(),"T1.gif");//getImage(getCodeBase()是返回
		//包含Applet的html文件所在目录的URL。又因为我把Applet的字节码文件（即
		//class文件）与包含此Applet程序的html文件放在一起，故两种方法产生的结果是
		//一样的！
	}
	public void paint(Graphics g){
		g.drawImage(im,0,0,this);//this指本Applet的一个对象,在此就是
		//指本Ap5对象；另外，g.drawImage(im,0,0,this)方法只能在public void paint(Graphics g)
		//方法中使用！
	}
}
	
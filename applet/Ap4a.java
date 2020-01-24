import java.io.*;
import java.applet.*;
import java.awt.*;
import java.net.*;
import java.awt.event.*;

public class Ap4a extends Applet{
	
	public void init(){
  }
  
  public void start(){
  	Button b=new Button("百度一下！");
  	add(b);
  	b.addActionListener(new ActionListener(){
  		public void actionPerformed(ActionEvent e){
  			try{
  			  URL u=new URL(new String("http://www.baidu.com/"));
  			  getAppletContext().showDocument(u,"_blank");
  			}catch(Exception es){
  				es.printStackTrace();
  			}
  		}
  	});
  }
}
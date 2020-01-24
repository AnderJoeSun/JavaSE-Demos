//¹ØÓÚURL

import java.awt.*;
import java.awt.event.*;
import java.io.*;
import java.net.*;
import javax.swing.*;

public class Sl6{
	
	public static void main(String arg[]){
		JFrame jf=new JFrame("Joyu Download");
		jf.setSize(600,400);
		jf.setLocation(200,100);
  	JPanel p=new JPanel();
  	JLabel l=new JLabel("Please input a URL:");
	  p.add(l);
   	final JTextField tf=new JTextField(30);
  	p.add(tf);
  	jf.add(p,"North");
  	final JTextArea ta=new JTextArea();
   	jf.add(ta,"Center");
  	JButton jb=new JButton("Download!");
  	jb.addActionListener(new ActionListener(){
  		public void actionPerformed(ActionEvent e){
  			String s=tf.getText();
  			try{
  				URL u=new URL(s);
  				URLConnection cn=u.openConnection();
  				String line=System.getProperty("line.separator");
  				ta.append("Host:"+u.getHost());
  				ta.append(line);
  				ta.append("Port:"+u.getDefaultPort());
  				ta.append(line);
  				ta.append("ContentType:"+cn.getContentType());
  				ta.append(line);
  				ta.append("ContentLength:"+cn.getContentLength());
  				
  				InputStream is=cn.getInputStream();
  				FileOutputStream fos=new FileOutputStream("1.html");
  				int data;
  				while((data=is.read())!=-1){
  					fos.write(data);
  				}
  				is.close();
  				fos.close();
  				
  			}catch(Exception ex){
  				ex.printStackTrace();
  			}
  		}
  	});
  	jf.add(jb,"South");
  	jf.addWindowListener(new WindowAdapter(){
  		public void windowClosing(WindowEvent w){
  			System.exit(0);
  		}
  	});
  	
  	jf.show();
	}
}
//¹ØÓÚURL

import java.awt.*;
import java.awt.event.*;
import java.io.*;
import java.net.*;
import javax.swing.*;

public class Sl7a{
	
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
  				InputStreamReader isr=new InputStreamReader(is);
  				BufferedReader br=new BufferedReader(isr);
  				FileOutputStream fos=new FileOutputStream("b.html");
  				
  				String strline;
  				while((strline=br.readLine())!=null){
  					fos.write(strline.getBytes());
  					fos.write(line.getBytes());
  				}
  				
  				isr.close();
  				fos.close();
  				
  				
  			}catch(Exception ex){
  				ex.printStackTrace();
  			}
  		}
  	});
  	jf.add(jb,"South");
  	jf.addWindowListener(new WindowAdapter(){
			public void windowClosing(WindowEvent e){
				System.exit(0);
		  }
		});
  	jf.show();
  	
	}
}
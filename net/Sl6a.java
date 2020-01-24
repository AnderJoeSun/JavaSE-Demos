//¹ØÓÚURL

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import java.net.*;
import java.io.*;

public class Sl6a{
	public static void main(String arg[]){
		JFrame jf=new JFrame("Joyu Love Molyn...");
		jf.setSize(700,400);
		jf.setLocation(100,100);
		final JTextField tf=new JTextField(30);
		JLabel l=new JLabel("Please input a URL:");
		JPanel p=new JPanel();
		p.add(l);
		p.add(tf);
		jf.add(p,"North");
		final JTextArea ta=new JTextArea();
		jf.add(ta,"Center");
		JButton b=new JButton("Download!");
		jf.add(b,"South");
		b.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent e){
				try{
				String s=new String(tf.getText());
				URL u=new URL(s);
				URLConnection cn=u.openConnection();
				String line=System.getProperty("line.separator");
				ta.append("Host: "+u.getHost());
				ta.append(line);
				ta.append("Port: "+u.getDefaultPort());
				ta.append(line);
				ta.append("Content Type: "+ cn.getContentType());
				ta.append(line);
				ta.append("Content Length: "+cn.getContentLength());
				ta.append(line);
				
				InputStream is=cn.getInputStream();
				FileOutputStream fos=new FileOutputStream("a.html");
				int data;
				while((data=is.read())!=-1){
					fos.write(data);
				}
			  }catch(Exception es){
			  	es.printStackTrace();
			  }
			}
		});
		jf.show();
		jf.addWindowListener(new WindowAdapter(){
			public void windowClosing(WindowEvent e){
				System.exit(0);
		  }
		});
		
	}

}
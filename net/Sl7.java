//关于URL

import java.awt.*;
import java.awt.event.*;
import java.io.*;
import java.net.*;
import javax.swing.*;

public class Sl7{
	
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
  					fos.write(strline.getBytes());//46与47两行的操作能将文本文件正确取存。
  //却不能进行图片文件的操作，因为图片文件的内容是以二进制数据存的，里面只有0与1
 //而01表示13（在文本文件里表示换行）也即换行，在图片文件中它们只是图片内容，这样按行
 //操作会将两个“换行符”之间作为一行，再加上这些换行符，当然数据内容发生
 //变化（文件长度会增加！）！导致图形无法绘出！故对于图形文件，只能用Sl6a.java中的操作，按字节读写了！ 
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
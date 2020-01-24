import java.net.*;
import java.io.*;

public class Sl1aaa{
	public static void s() throws Exception{
	  ServerSocket ss=new ServerSocket(6000);
	  Socket s=ss.accept();
	  InputStream is=s.getInputStream();
	  byte[] b=new byte[10000];
	  int len=is.read(b);
	  System.out.println(new String(b,0,len));
	  
	  OutputStream os=s.getOutputStream();
	  os.write("Welcome you,Joyu!".getBytes());
	  
	  os.close();
	  is.close();
	  s.close();
	  ss.close();
  }
  
  public static void c() throws Exception{
  	Socket s=new Socket(InetAddress.getByName("Joyu"),6000);
  	
  	OutputStream os=s.getOutputStream();
  	os.write("Joyu loves Molyn!".getBytes());
  	
  	InputStream is=s.getInputStream();
  	byte[] b=new byte[10000];
  	int len=is.read(b);
  	System.out.println(new String(b,0,len));
  	
  	os.close();
  	is.close();
  	s.close();
  }
  	
  	
  	
	
	public static void main(String arg[]) throws Exception{
		if(arg.length>0){
			c();
		}else{
			s();
		}
	}
}
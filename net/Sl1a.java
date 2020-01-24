import java.io.*;
import java.net.*;

class Sl1a{
	public static void s(){
		try{
		ServerSocket ss=new ServerSocket(6000);
		Socket s=ss.accept();
		
		InputStream is=s.getInputStream();
		byte[] b=new byte[100];
		int len=is.read(b);
		System.out.println(new String(b,0,len));
		//is.close();//´í£¡
		
		OutputStream os=s.getOutputStream();
		os.write("Welcome you! Joyu!".getBytes());
		//os.close();//´í£¡
		os.close();
		is.close();
		s.close();
	  ss.close();
	  }catch(Exception e){
	  	e.printStackTrace();
	  }
	  
	}
	
	public static void c(){
		try{
			Socket s=new Socket(InetAddress.getByName(null),6000);
			OutputStream os=s.getOutputStream();
			os.write("This is Joyu!".getBytes());
			//os.close();//´í£¡
			
			InputStream is=s.getInputStream();
			byte[] b=new byte[1000];
			int len=is.read(b);
			System.out.println(new String(b,0,len));
			//is.close();//´í£¡
			os.close();
			is.close();
			s.close();
		}catch(Exception e){
			e.printStackTrace();
		}
	}
		
		
	public static void main(String arg[]){
		if(arg.length>0){
			s();
		}else c();
	}
}
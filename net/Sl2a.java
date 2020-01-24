import java.io.*;
import java.net.*;

public class Sl2a extends Thread{
	private Socket s;
	public Sl2a(Socket s){
		this.s=s;
	}
	
	public static void main(String arg[]){
		if(arg.length>0){
			s();
		}else c();
	}
	public void run(){
		try{
			InputStream i=s.getInputStream();
			byte[] b1=new byte[100];
			int len1=i.read(b1);
			System.out.println(new String(b1,0,len1));
			
			OutputStream o=s.getOutputStream();
			o.write("Hello, welcome you!".getBytes());
			o.close();
			i.close();
			s.close();
			
		}catch(Exception e){
			e.printStackTrace();
		}
	}
	public static void s(){
		try{
			ServerSocket ss=new ServerSocket(4500);
			while(true){
				Socket s1=ss.accept();
				new Sl2a(s1).start();
			}
		}catch(Exception e){
			e.printStackTrace();
		}
	}
	public static void c(){
		try{
			Socket s2=new Socket(InetAddress.getByName("localhost"),4500);
			InputStream is=s2.getInputStream();
			byte[] b=new byte[100];
			int len=is.read(b);
			System.out.println(new String(b,0,len));
			
			OutputStream os=s2.getOutputStream();
			os.write("This is Joyu!".getBytes());
			os.close();
			is.close();
			s2.close();
		}catch(Exception e){
			e.printStackTrace();
		}
	}
}


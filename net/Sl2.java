//基于TCP的网络编程
import java.net.*;
import java.io.*;

public class Sl2 extends Thread{
	private Socket s;
	public Sl2(Socket s){
		this.s=s;
	}
	public void run(){
		try{
			OutputStream os=s.getOutputStream();
			InputStream is=s.getInputStream();
			os.write("Hello, Are you Joyu? er... How are you all these years? I miss you...".getBytes());
			byte[] b=new byte[100];
			int len=is.read(b);
			System.out.println(new String(b,0,len));
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
		}
		else{
			c();
		}
	}
	
	public static void s(){
		
		try{
			ServerSocket ss=new ServerSocket(3000);
			while(true){
		    Socket s=ss.accept();
			  new Sl2(s).start();
			}
			//ss.close();
		}catch(Exception e){
			e.printStackTrace();
		}
	}
	public static void c(){
		try{
		Socket s=new Socket(InetAddress.getByName(null/*or 
		"localhost" or "127.0.0.1"*/),3000);
		OutputStream os=s.getOutputStream();
		InputStream is=s.getInputStream();
		os.write("I'm Joyu...".getBytes());
		byte[] b=new byte[100];
		int len=is.read(b);
		System.out.println(new String(b,0,len));
		os.close();
		is.close();
		s.close();
	 }catch(Exception e){
	 	e.printStackTrace();
	}
	}
		
}
import java.net.*;
import java.io.*;

public class Sl4aaa{
	public static void main(String arg[]) throws Exception{
		  st();
			rv();
		
			
		
	}
	
	public static void st() throws Exception{
		DatagramSocket ds=new DatagramSocket();
		String str="Hello,Molyn!";
		DatagramPacket dp=new DatagramPacket(str.getBytes(),str.length(),
		                                 InetAddress.getByName("localhost"),3000);
		ds.send(dp);
		
		ds.close();
		
		
	}
	
	public static void rv() throws Exception{
		DatagramSocket ds=new DatagramSocket(3000);
		
		byte[] b=new byte[100];
		DatagramPacket dp=new DatagramPacket(b,100);
		ds.receive(dp);
		System.out.println(new String(b,0,dp.getLength()));
		ds.close();
	}
}
import java.io.*;
import java.net.*;

public class Sl4a{
	public static void main(String arg[]){
		if(arg.length>0){
			rv();
		}else sd();
	}
	public static void rv(){
		try{
	  	DatagramSocket ds=new DatagramSocket(4800);
	  	byte[] b=new byte[1024];
	  	DatagramPacket dp=new DatagramPacket(b,300);
	  	ds.receive(dp);
	  	System.out.println(new String(b,0,dp.getLength()));
	  	ds.close();
   	}catch(Exception e){
	  	e.printStackTrace();
  	}
  }
  public static void sd(){
  	try{
  		DatagramSocket ds=new DatagramSocket();
  		String str=new String("Hello!");
  		DatagramPacket dp=new DatagramPacket(str.getBytes(),str.length(),
  		                           InetAddress.getByName("127.0.0.1"),
  		                          4800);
  		ds.send(dp);
  		ds.close();
  	}catch(Exception e){
  		e.printStackTrace();
  	}
  }
}
  		
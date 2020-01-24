//关于基于UDP的网络编程；
import java.net.*;

public class Sl5a{
	public static void main(String arg[]){
		if(arg.length>0){
			rv();
		}else sd();
	}
	public static void rv(){
		try{
		DatagramSocket ds=new DatagramSocket(3300);
		byte[] b=new byte[400];
		DatagramPacket dp=new DatagramPacket(b,300);
		ds.receive(dp);
		System.out.println(new String(b,0,dp.getLength()));
		
		String str=new String("Welcome you!");
		DatagramPacket dpsd=new DatagramPacket(str.getBytes(),str.length(),
		                      dp.getAddress(),dp.getPort());
		ds.send(dpsd);
		ds.close();
	  }catch(Exception e){
	     e.printStackTrace();
	  }  	
	}
	
	public static void sd(){
		try{
		DatagramSocket ds=new DatagramSocket();
		String str=new String("This is Joyu!");
		DatagramPacket dp=new DatagramPacket(str.getBytes(),str.length(),
		                     InetAddress.getByName(null),3300);
		ds.send(dp);
		
		byte[] b=new byte[400];
		DatagramPacket dprv=new DatagramPacket(b,300);
		ds.receive(dprv);
		System.out.println(new String(b,0,dprv.getLength()));
		ds.close();
	  }catch(Exception e){
	  	e.printStackTrace();
	  }
	}
}
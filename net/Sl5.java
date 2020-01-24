//基于UDP的网络编程
import java.net.*;
import java.io.*;

public class Sl5{
	public static void main(String arg[]){
		if(arg.length>0){
			rv();
		}else{
			st();
		}
	}
	public static void rv(){
		try{
			DatagramSocket ds=new DatagramSocket(6000);
			byte[] b=new byte[300];
			DatagramPacket dp=new DatagramPacket(b,300);
			ds.receive(dp);//得到的数据包保存在dp里，再赋给数组b,最后由19行打印出来。
			System.out.println(new String(b,0,dp.getLength()));
			
			String str=new String("Welcome you!");
			DatagramPacket dsst=new DatagramPacket(str.getBytes(),str.length(),
			                                  dp.getAddress(),dp.getPort());
			ds.send(dsst);
			ds.close();
			
		}catch(Exception e){
			e.printStackTrace();
		}
	}
	public static void st(){
		try{
			DatagramSocket ds=new DatagramSocket();
			String str=new String("Hello, this is Joyu!");
			DatagramPacket dp=new DatagramPacket(str.getBytes(),str.length(),
			                                InetAddress.getByName("localhost"
			                                ),6000);//"localhost"是接收者的地址！
			ds.send(dp);
			
			byte[] b=new byte[100];
			DatagramPacket dprv=new DatagramPacket(b,100);
			ds.receive(dprv);
			System.out.println(new String(b,0,dprv.getLength()));
			ds.close();
		
			                                
			
		}catch(Exception e){
			e.printStackTrace();
		}
	}
}	
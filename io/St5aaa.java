import java.io.*;

public class St5aaa{
	public static void main(String arg[]) throws Exception{
	  PipedOutputStream pos=new PipedOutputStream();
	  PipedInputStream pis=new PipedInputStream();
	  try{
	  	pos.connect(pis);
	  }catch(Exception e){
	  e.printStackTrace();
	  }
	  Out out=new Out(pos);
	  In in=new In(pis);
	  out.start();
	  in.start();
	}
}

class Out extends Thread{
	PipedOutputStream pos;
	public Out(PipedOutputStream pos){
		this.pos=pos;
	}
	public void run(){
		try{
		  pos.write("Joyu loves Molyn...".getBytes());
		  pos.close();
		}catch(Exception e){
			e.printStackTrace();
		}
		
	}
}

class In extends Thread{
	PipedInputStream pis;
	In(PipedInputStream pis){
		this.pis=pis;
	}
	
	public void run(){
		try{
		  byte[] b=new byte[100];
		  int len=pis.read(b);
		  System.out.println(new String(b,0,len));
		  pis.close();
		}catch(Exception e){
			e.printStackTrace();
		}
	}
}
		
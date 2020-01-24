import java.io.*;
class St5{
	public static void main(String a[]){
		PipedOutputStream pos=new PipedOutputStream();
		PipedInputStream pis=new PipedInputStream();
		try{
		    pis.connect(pos);
		  }catch(Exception e){
		  	e.printStackTrace();
		  }
		Out o=new Out(pos);
		In i=new In(pis);
		try{
		    o.start();
		    i.start();
		  }catch(Exception e){
		  	e.printStackTrace();
		  }
		
		
	}
}
class Out extends Thread{
	private PipedOutputStream pos;
	Out(PipedOutputStream pos){
		this.pos=pos;
	}
	public void run() /*throws Exception */ {//不能抛出异常！
		try{
		   pos.write("Welcome to Joyu's new house..".getBytes());
		   pos.close();
		  }catch(Exception e){
		  	e.printStackTrace();
		  }
		
	}
}

class In extends Thread{
	private PipedInputStream pis;
	In(PipedInputStream pis){
		this.pis=pis;
	}
	public void run() /*throws Exception */ {//不能抛出异常！
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
			
			
	
import java.io.*;
class St5a{
	public static void main(String arg[]) throws Exception{
		PipedOutputStream pos=new PipedOutputStream();
		PipedInputStream pis=new PipedInputStream();
		pos.connect(pis);
		new P(pos).start();
		new C(pis).start();
		
	}
}

class P extends Thread { 
	PipedOutputStream pos;
	P(PipedOutputStream pos){
		this.pos=pos;
	}
  public void run() /*throws Exception*/{
  	try{
  	  pos.write("Joyu loves Molyn...".getBytes());
      pos.close();
    }catch(Exception e){
    	e.printStackTrace();
    }
  }
}

class C extends Thread {
	PipedInputStream pis;
	C(PipedInputStream pis){
		this.pis=pis;
	}
	public void run() /*throws Exception*/{//run()方法不能抛出异常！
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
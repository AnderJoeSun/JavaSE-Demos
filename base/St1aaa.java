//����ͬһ��������̣߳�����ͬ�������������ã�

public class St1aaa{
	public static void main(String arg[]){
		new Sell().start();
		new Sell().start();
		//new Sell().start();
		//new Sell().start();
	}
}

class Sell extends Thread{
	static int t=100;
	public void run(){
		sell();
	}
   synchronized void  sell(){
		while(t>0){
			synchronized(this){
			try{
				Thread.sleep(30);
			}catch(Exception e){
				e.printStackTrace();
			}
		  System.out.println(getName()+" Sell:"+t);
		  t--;
		}
	  }
	}
}
public class Eth2{
	public static void main(String arg[]){
		//һ���̶߳���ֻ�ܲ���һ���̣߳�
		Th th=new Th();
		th.start();
		new Th().start();
		new Th().start();
		
		
		int i=0;
		while(i<3){
			
			try{
				Thread.sleep(1);
			}catch(Exception e){
				e.printStackTrace();
			}
			System.out.println(Thread.currentThread().getName());
			i++;
		}
		if(i==3){
			th.thStop();
			
		}
		
	}
}

class Th extends Thread{
	boolean a=true;
	public void run(){
		
		while(a){
		  synchronized(this){
			  System.out.println(Thread.currentThread().getName());
		  }
		}
	}
	public void thStop(){
		a=false;
	}
}
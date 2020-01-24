public class Eth1{
	public static void main(String arg[]){
		//一个线程对象只能产生一个线程！
		Th th=new Th();
		th.start();
		th.start();
		th.start();
		int i=0;
		while(i<100){
			System.out.println(Thread.currentThread().getName());
			try{
				Thread.sleep(3);
			}catch(Exception e){
				e.printStackTrace();
			}
			i++;
		}
		if(i==100){
			th.thStop();
		}
		
	}
}

class Th extends Thread{
	boolean a=true;
	public synchronized void run(){
		while(a){
			System.out.println(Thread.currentThread().getName());
		}
	}
	public void thStop(){
		a=false;
	}
}
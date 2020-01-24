public class Th1aae{
	public static void main(String arg[]){
		M m=new M();
		m.start();
		m.setPriority(Thread.MAX_PRIORITY);
		int i=0;
		while(true){
			if(i++==50) break;
			System.out.println(Thread.currentThread().getName());
		}
	
	}
}

class M extends Thread{
	public void run(){
		int i=1;
		while(true){
			if(i++==50) break;
			System.out.println(getName());
			yield();
		}
	}
}
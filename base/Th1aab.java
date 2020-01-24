public class Th1aab{
	public static void main(String arg[]){
		M m=new M();
		m.start();
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
			if(i++==60) break;
			System.out.println(getName());
			yield();
		}
	}
}
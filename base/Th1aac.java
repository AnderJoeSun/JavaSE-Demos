public class Th1aac{
	public static void main(String arg[]){
		M m=new M();
		m.setDaemon(true);
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
			
			System.out.println(getName());
		}
	}
}
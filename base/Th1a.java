class Th1a{
	public static void main(String arg[]){
		Myth mt=new Myth();
		new Thread(mt).start();
		while(true){
			System.out.println(Thread.currentThread().getName());
	  }
			
		
		
	}
}
class Myth implements Runnable{
	public void run(){
	  while(true){
	  	System.out.println(Thread.currentThread().getName());
	  }
	}
}
	
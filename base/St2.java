class St2{
	public static void main(String arg[]){
		Se2 s=new Se2();
		new Thread(s).start();
		new Thread(s).start();
		new Thread(s).start();
		new Thread(s).start();
	}
}
class Se2 implements Runnable{
	static int tik=100;
	public void run(){
		sell();
	}
	 
  synchronized void sell(){
		while(tik>0){
		    System.out.println(Thread.currentThread().getName()+"Sell "+tik);
		    tik--;
	  }
	}
}
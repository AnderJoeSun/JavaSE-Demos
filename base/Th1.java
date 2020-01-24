class Th1{
  public static void main(String arg[]){
	Mth m=new Mth();
	
	m.setDaemon(true);
	m.start();
	
	//new Thread(m).start();
	//m.setPriority(Thread.MAX_PRIORITY);
	int j=0;
	while(true){
		if(j++==80) break;
		System.out.println(Thread.currentThread().getName());
	}
	
	
	}
}

class Mth extends Thread /*implements Runnable*/{
	public void run(){
		int i=0;
		while(true){
		  if(i++==50) break;
			System.out.println(getName());
			yield();
		}
	}
}
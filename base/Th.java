class Th{
	public static void main(String a[]){
		MyTh mt=new MyTh();
		//mt.setDaemon(true);
		new Thread(mt).start();
		
		
		
		//mt.start();
		//mt.setPriority(Thread.MAX_PRIORITY);
		int j=0;
		while(true){
			if(j++==50)
			break;
			System.out.println(Thread.currentThread().getName());
		}
  }
}
class MyTh implements Runnable{
	public void run(){
		int i=0;
		while(true){
			//if(i++==100)
			//break;
		System.out.println(Thread.currentThread().getName());
		
	}
	
	}
  
	
}
	
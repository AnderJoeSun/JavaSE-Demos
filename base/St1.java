class St1{
	public static void main(String arg[]){
		Se1 s=new Se1();
		new Thread(s).start();
		new Thread(s).start();
		new Thread(s).start();
		new Thread(s).start();
	}
}
class Se1 implements Runnable{
	int tik=100;
	public void run(){
		synchronized(this){
			
		  while(tik>0){
		    try{
			    Thread.sleep(10);
		    }catch(Exception e){
		  	  e.printStackTrace();
		    }
		    System.out.println("Sell "+tik);
		    tik--;
	  	}
	  }
		
	}
	
}
			
			
		
	
	

class St{
  public static void main(String a[]){
  	Se s=new Se();
  	
  		new Thread(s).start();
  		try{
	  			Thread.sleep(1);
	  		}catch(Exception e){
	  			System.out.println(e);
	  		}
	  	
	  	s.b=false;
  	  new Thread(s).start();
  	 
  }
}
class Se implements Runnable /*throws Exception*/{
	int tik=100;
	boolean b=true;
	Object obj=new Object();
	
	public void run(){
	  if(b==true){
	  	 while(true)
	  	      sell();
	  	    }
	  else  {
	  	while(true){
	  	  synchronized(this){
	  	    if(tik>0){
	  		     try{
	  			     Thread.sleep(10);
	  		     }catch(Exception e){
	  			   System.out.println(e);
	  		     }
	  		     System.out.println(Thread.currentThread().getName()+" RUN sell "+tik);
	  	       tik--;
	  	  
	  	   }
	  	
	    }
	  	
	
	  	
	  }
	
	  
	}
 }
	public synchronized void sell(){
		while(true){
	  	
	  	if(tik>0){
	  		try{
	  			Thread.sleep(100);
	  		}catch(Exception e){
	  			System.out.println(e);
	  		}
	  		System.out.println(Thread.currentThread().getName()+" SELL sell "+tik);
	  	  
	  	  tik--;
	  	}
	  }
	
	}
	
}
  	
	  	
		
		
	  
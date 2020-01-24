class St1a{
	public static void main(String arg[]){
		Sell sell=new Sell();
		new Thread(sell).start();
		try{
			Thread.sleep(3);
		}catch(Exception e){
			e.printStackTrace();
		}
		sell.a=true;
		new Thread(sell).start();
		//new Thread(sell).start();
		//new Thread(sell).start();
	}
}

class Sell implements Runnable{
	int tik=100;
	
	public void run(){
	    
			synchronized(this){
				try{
			    Thread.sleep(30);
		    }catch(Exception e){
			     e.printStackTrace();
		    }
				synchronized(Obj){
				
				  if(tik>0){
	  		    System.out.println(Thread.currentThread().getName()+"sell:"+tik);
	  		    tik--;
	  	  }
			}
		  }
		  
		
	
	  
	}
	
	public synchronized void se(){
	
	  		if(tik>0){
	  		  System.out.println(Thread.currentThread().getName()+"sell:"+tik);
	  		  tik--;
	  	  }
	  	
	}
		
}
		
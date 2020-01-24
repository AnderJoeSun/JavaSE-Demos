class St3{
	public static void main(String arg[]){
		Se3 s=new Se3();
		new Thread(s).start();
		try{
			Thread.sleep(30);
		}catch(Exception e){
			e.printStackTrace();
		}
		s.a=false;
		new Thread(s).start();
		
	}
}
class Se3 implements Runnable{
	int tik=100;
	boolean a=true;
	public void run(){
		if(a==true){
			while(true){
		    synchronized(this){
		    	if(tik>0){
		  	    try{
			        Thread.sleep(100);
		        }catch(Exception e){
			        e.printStackTrace();
		        }
		        System.out.println("Run sell "+tik);
		        tik--;
	  	    }
	  	  }
	    }
	  
	  }
	  else if(a==false) {
	   	while(true){
	   		sell();
	   	}
	  }
	}
	synchronized void sell(){
		
		if(tik>0){
			try{
			  Thread.sleep(100);
	  	}catch(Exception e){
		    e.printStackTrace();
	  	}
		    System.out.println("Sell sell "+tik);
		    tik--;
		 }
	  
	}
}
//这里是同一个对象的几个线程！故t可以不必是static的！

public class St1aab{
	public static void main(String arg[]){
		Sell s=new Sell();
		new Thread(s).start();
		try{
		  Thread.sleep(3);
		}catch(Exception e){
			e.printStackTrace();
		}
		s.a=false;
		new Thread(s).start();
		
	}
}

class Sell implements Runnable{
	int t=100;
	boolean a=true;
	public void run(){
		
		  if(a){
			  while(true){
				  synchronized(this){
				  	try{
				  		Thread.sleep(30);
				  	}catch(Exception e){
				  		e.printStackTrace();
				  	}
		        if(t>0){
		          System.out.println(Thread.currentThread().getName()+" sells: "+t);
		          t--;
	          }
	        }
	      }
	    }
	  
	    else{
	  	  while(true){
	  	  	try{
				  	Thread.sleep(30);
				  }catch(Exception e){
				  	e.printStackTrace();
				  }
	        sell();
	      }
	    
	    }
	  
  }
	public synchronized void sell(){
		if(t>0){
		  System.out.println(Thread.currentThread().getName()+" sells: "+t);
		  t--;
	  }
	}
}
		
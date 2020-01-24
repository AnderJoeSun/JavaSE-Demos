class St4{
	public static void main(String arg[]){
		Se4 s=new Se4();
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
class Se4 implements Runnable{
	int tik=100;
	boolean a=true;
	Object obj=new Object();
	public void run(){
		if(a==true){
			while(true){
				synchronized(obj){
					try{
			        Thread.sleep(100);
		        }catch(Exception e){
			        e.printStackTrace();
		        }
		      
		      synchronized(this){
		    	  if(tik>0){
		  	      /*try{
			          Thread.sleep(100);
		          }catch(Exception e){
			          e.printStackTrace();
		          }*/
		          System.out.println("Run sell "+tik);
		          tik--;
	  	      }
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
		try{
		  Thread.sleep(100);
	  }catch(Exception e){
		  e.printStackTrace();
	  }
		synchronized(obj){
		
		  if(tik>0){
		  	/*try{
		  	  Thread.sleep(100);
	    	}catch(Exception e){
		      e.printStackTrace();
	     	}*/
		      System.out.println("Sell sell "+tik);
		      tik--;
		   }
	  
	  }
  }
}
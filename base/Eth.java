class Eth{
	public static void main(String a[]){
		Th1 t1=new Th1();
		
		t1.start();
	  
		/*try{
			Thread.sleep(1);
		}catch(Exception e){
			e.printStackTrace();
		}*/
		int i=0;
		while(true){
		    System.out.println(Thread.currentThread().getName());
		    
		    if(i++==50){
		    	
		    	t1.thStop();
		    	t1.interrupt();
		    	break;
		    }
		 }
		  System.out.println("main exit!");		    	 
	}
}

class Th1 extends Thread{
	boolean a=false;
	public synchronized void run(){
	while(!a){
			try{
				wait();
			}catch(Exception e){
				e.printStackTrace();
				//return;
			}
			System.out.println(getName());
		}
	 }
	
	public void thStop(){
		a=true;
	}
}
			
		
	
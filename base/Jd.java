class Jd{
	public static void main(String a[]){
		Q q=new Q();
		Producer p=new Producer(q);
		p.start();
		Comsumer c=new Comsumer(q);
		c.start();
	}
}

class Producer extends Thread{
	Q q;
	Producer(Q q){ 
		this.q=q;
	}
	public void run(){
		for(int i=0;i<10;i++){
			q.put(i);
			System.out.println("put:"+i);
		}
	}
}
		
class Comsumer extends Thread{
	Q q;
	Comsumer(Q q){
	this.q=q;
	}
	public void run(){
		while(true){
		System.out.println("get:"+q.get());
	}
}
}
	
class Q{
	int value;
	boolean a=false;
	public synchronized void  put(int i){
		if(!a){
			value=i;
			a=true;
			notify();
			
		}
		try{
			wait();
		}catch(Exception e){
			e.printStackTrace();
		}
		
	}
	
	public synchronized int get(){
	  
	  if(!a){
		  try{
	  	  wait();
	    }catch(Exception e){
	  	  e.printStackTrace();
	    }
	    
	  
	  }
	  a=false;
	  notify();
	  return value;
	}
	
}
	
		
		
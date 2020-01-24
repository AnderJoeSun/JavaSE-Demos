public class Jd1aaa{
	public static void main(String arg[]){
		Q q=new Q();
		Put put=new Put(q);
		Get get=new Get(q);
		new Thread(put).start();
		new Thread(get).start();
	}
}

class Put implements Runnable{
	Q q;
	Put(Q q){
		this.q=q;
	}
	public void run(){
		for(int i=0;i<10;i++){
			q.put(i);
			System.out.println("Put :"+i);
		}
	}
}

class Get implements Runnable{
	Q q;
	Get(Q q){
		this.q=q;
	}
	public void run(){
		while(true){
			
			System.out.println("Get!:"+q.get());
		}
	}
}

class Q{
	int value;
	boolean kong=true; 
	public synchronized void put(int a){
		if(kong){
			value=a;
			kong=false;
			notify();
		}
		
		
		try{
			wait();
		}catch(Exception e){
			e.printStackTrace();
		}
		
	}
	public synchronized int get(){
		
		
			try{
			  wait();
	   	}catch(Exception e){
		  	e.printStackTrace();
		  }
		  if(!kong){
			kong=true;
		  notify();
		  return value;
			
		  }
		
		
		
	}
}
			
	
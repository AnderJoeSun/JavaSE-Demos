class Jd1{
	public static void main(String arg[]){
		Q1 q=new Q1();
		P p=new P(q);
		p.start();
		G g=new G(q);
		g.start();
		
	}
}
class P extends Thread{
	Q1 q;
	P(Q1 q){
		this.q=q;
	}
	public void run(){
	  for(int i=0;i<9;i++){
	  	q.p(i);
	  	System.out.println("Put: "+i);
	  }
	}
}

class G extends Thread{
	Q1 q;
	G(Q1 q){
		this.q=q;
	}	
	public void run(){
		while(true){
		  System.out.println("Get: "+q.g());
		}
	}
}

class Q1{
	int num;
	boolean a=false;
	public synchronized void p(int i){
		if(!a){
			num=i;
			a=true;
			notify();
		}
		try{
			wait();
		}catch(Exception e){
		  e.printStackTrace();
		}
		
	}
	public synchronized int g(){
		if(!a){
			try{
				wait();
			}catch(Exception e){
				e.printStackTrace();
			}
		}
		
		a=false;
		notify();
		return num;
	}
}
			
			
		
			 
	
	
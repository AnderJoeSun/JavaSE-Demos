class Jd1a{
	public static void main(String arg[]){
	 D d=new D();
	 F f=new F(d);
	 f.start();
	 N n=new N(d);
	 n.start();
	}
}

class F extends Thread{
	D d;
	F(D d){
		this.d=d;
	}
	public void run(){
		for(int j=0;j<10;j++){
			d.p(j);
		  System.out.println("put:"+j);
		}
	}
}

class N extends Thread{
	D d;
	N(D d){
		this.d=d;
	}
	public void run(){
		while(true){
		  System.out.println("Get:"+d.g());
		}
	}
}

class D{
	int value;
	boolean a=false;
	public synchronized void p(int i){
		if (!a){
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
		return value;
	}	
}
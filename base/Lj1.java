public class Lj1{
	
	int hao;
	static int count=0;
	Lj1(){
		count++;
		System.out.println("Object "+count+" is created");
		
		set(count);
		
	}
	void set(int id){
		hao=id;
	}
	protected void finalize(){
		System.out.println("Object "+hao+" is reclained");
	}
	public static void main(String arg[]){
	  new Lj1();System.gc();
	  new Lj1();System.gc();
	  new Lj1();System.gc();
	  new Lj1();System.gc();
	
	}
	
}
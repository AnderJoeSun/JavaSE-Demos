class Lj1a{
	int hao;
	static int count;
	Lj1a(){
		count++;
		System.out.println("Object "+count+" is created");
		set();
	}
	void set(){
		hao=count;
	}
		
	protected void finalize(){
		System.out.println("Object "+hao+"is reclained");
	}
  public static void main(String arg[]){
  	new Lj1a();System.gc();
  	new Lj1a();
  	new Lj1a();
  	new Lj1a();
  	new Lj1a();
  	System.gc();
  }
}
  	
class Outer{
	int a=3;
  static int b;
  static void p2(){
  	System.out.println("Hello, Joyu");
  	System.out.println(b);
  }
  void fn(){
  	
  	final int c=300;
  	class M{
  		int d=400;
  	  class Inner{
  	    int a=4;
        int b;
  	    void print(){
  		    int a=5;
  		    System.out.println(Outer.b);
  		    System.out.println(this.a);
  		    System.out.println(Outer.this.a);
  		    System.out.println(c);
  		    System.out.println(M.this.d);
  		    p2();
  		  }
  	  }
  	}
  	//return new M();
  }
  public static void main(String arg[]){
  	Outer o=new Outer();
  	//Outer.Inner in=o.new Inner();
  	//in.print();
  }
  
}
class Test{
	
	public static void main(String arg[]){
    Outer.p2();
  }
}
public class Outer1aa{
	static class Inner{
		int a=1000;
		static int b=3;
		static void print(){
			System.out.println(b);
		}
		void print2(){
			System.out.println(a);
		}
	}
			
	public static void main(String arg[]){
		Aj aj=new Aj();
		aj.print();
		
		
	}
}

class Aj{
	public void print(){
	  Outer1aa ou=new Outer1aa();
	  Outer1aa.Inner in=new Outer1aa.Inner();
    Outer1aa.Inner.print();
    in.print();
	  in.print2();
	}
}

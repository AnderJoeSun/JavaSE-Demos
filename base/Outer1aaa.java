public class Outer1aaa{
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
		
		Inner in=new Inner();
		Outer1aaa.Inner.print();
		in.print();
		in.print2();
	}
}


	
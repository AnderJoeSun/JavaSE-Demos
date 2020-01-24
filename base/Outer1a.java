class Outer1a{
	int a=3;
	static int b=4;
	class Inner{
		int a=8;
		int b=80;
	  void fn1(){
			final int a=100;
			class In{
				int a=90;
				//static int b=111;
				void fn2(){
					System.out.println(Outer1a.this.a);
					System.out.println(Outer1a.this.b);
					System.out.println(Outer1a.b);
					System.out.println(Inner.this.b);
					System.out.println(Inner.this.a);
					//System.out.println(Inner.b);
					System.out.println(a);
					System.out.println(this.a);
					System.out.println(In.this.a);
					System.out.println();
					System.out.println();
					System.out.println();
					
				}
			}
			//return new In();
		}
	}
	
	public static void main(String arg[]){
		Outer1a outer=new Outer1a();
	  Outer1a.Inner inner=outer.new Inner();
	  //inner.fn1().f2();
	  //in.fn2();
	}
}


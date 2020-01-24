class Qz{
	public static void main(String arg[]){
		A a=new A();
		Ax d=new Ax();
		A b=(A)d;
		Ax c=(Ax)a;
	  b.eat();
	  c.sleep();
	  c.eat();
		
	}
}
class A{
	void eat(){
		System.out.println("A eat");
	}
}

class Ax extends A{
	void sleep(){
		System.out.println("Ax sleep");
	}
}

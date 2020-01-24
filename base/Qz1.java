public class Qz1{
  public static void main(String arg[]){
  	A a=new A();
  	Ax b=(Ax)a;
  	b.sleep();
  }
}

class A{
	public void eat(){
		System.out.println("ni eat!");
	}
}

class Ax extends A{
	public void sleep(){
		System.out.println("ni sleep!");
	}
}
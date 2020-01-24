public class Jin1{
	public static void main(String arg[]){
		Ax ax=new Ax();
		ax.eat();
		ax.fan();
		ax.mi();
	}
}

class A{
	void eat(){
		System.out.println("a eat!~");
	}
	
	void fan(){
		System.out.println("a eat fan");
	}
}

class Ax extends A{
	void mi(){
		System.out.println("a eat mi");
	}
}
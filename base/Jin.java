class Jin{
	public static void main(String arg[]){
		Ax ax=new Ax();
		ax.mi();
		ax.fan();
	}
}

class A{
	static void eat(){
		System.out.println("A eat");
	}
	void fan(){
		eat();
		System.out.println("A eat fan");
	}
}

class Ax extends A{
	
	void mi(){
		Ax.eat();
		System.out.println("Ax eat mi");
	}
}
		
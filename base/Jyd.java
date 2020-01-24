public class Jyd{
	int a=3;
	static int b=1;
	void print(){
		System.out.println(Jyd.this.a);
	}
	public static void main(String arg[]){
		//Jyd.this.print();
		Jyd j=new Jyd();
		j.print();
	}
}
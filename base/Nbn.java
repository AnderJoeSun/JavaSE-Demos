class N{
	 void p(){
		System.out.println("Hello,Molyn");
	}
}
class Nbn extends N{
	void p2(){
		Nbn.super.p();
	}
	public  static void main(String arg[]){
		Nbn n=new Nbn();
		n.p2();
		//this.p2();
	}
}

	
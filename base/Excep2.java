class Excep2{
	public static void main(String arg[]) throws Exception{
		try{
			Ex2.fn1(5,-1);
		}catch(Exception a){
			a.printStackTrace();
			throw new Exc2("you fu shu!");
		}
		try{
			Ex2.fn1(5,0);
		}catch(Exception e){
			e.printStackTrace();
		}
		
		
	}
}
class Ex2{
	static int div(int x,int y) throws Exception{
		if (y<0)
			throw new Exception("fu Shu!");
		else if(y==0)
			throw new ArithmeticException("ling");
		else
			return x/y;
	}
  static int fn1(int x,int y) throws Exception{
  	int a=div(x,y);
  	return a;
  }
}
	
class Exc2 extends Exception{
	Exc2(String str){
		super(str);
	}
}
	
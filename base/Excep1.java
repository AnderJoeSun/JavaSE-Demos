public class Excep1{
	public static void main(String arg[]) {
		Ex1 ex=new Ex1();
		try{
		  System.out.println(ex.div(3,0));
	  }catch(Exception e){
	  	e.printStackTrace();
	  }
		try{
	    System.out.println(ex.div(3,-1));
	    
	  }catch(Exception e){
	  	e.printStackTrace();
	  }
	  try{
	    System.out.println(ex.div(3,2));
	  }catch(Exception e){
	  	e.printStackTrace();
	  }
	}
}

class Exc extends Exception{
	Exc(String str){
		super(str);
	}
}

class Ex1{
	public int div(int x,int y) throws Exception{
		if(y<0) throw new Exc("Ð¡ÓÚ0");
		if(y==0) throw new Exc("ÓÐ0");
		return x/y;
	}
}
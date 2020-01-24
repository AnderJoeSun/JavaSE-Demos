class Cla1a{
  public static void main(String arg[]){
  	L a=new L();
  	
  	Class a1=a.getClass();
  	System.out.println(a1.getName());
  	
  	try{
  	  Class a2=Class.forName("L");
  	  System.out.println(a2.getName());
  	}catch(Exception e){
  		e.printStackTrace();
  	}
  	
  	
  	Class a3=L.class;
  	System.out.println(a3.getName());
  	
  	Class a4=int.class;
  	System.out.println(a4.getName());
  	
  	Class a5=Integer.class;
  	System.out.println(a5.getName());
  	
  	Class a6=Integer.TYPE;
  	System.out.println(a6.getName());
  }
}

class L{
	static{
		System.out.println("L loading!");
	}
}
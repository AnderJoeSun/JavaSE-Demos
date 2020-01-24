public class Cla1aa{
	public static void main(String arg[]){
		P p=new P();
		
		Class c1=p.getClass();
		System.out.println(c1.getName());
		
		try{
		  Class c2=Class.forName("P");
		  System.out.println(c2.getName());
		}catch(Exception e){
			e.printStackTrace();
		}
		
		Class c3=P.class;
		System.out.println(c3.getName());
		
		Class c4=int.class;
		System.out.println(c4.getName());
		
		Class c5=Integer.class;
		System.out.println(c5.getName());
		
		Class c6=Integer.TYPE;
		System.out.println(c6.getName());
	}
}
		
		


class P{
	int a,b;
	static{
		System.out.println("loading P");
	}
}

	
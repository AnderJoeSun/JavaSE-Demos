class Cla{
	public static void main(String agr[]){
		/*Point p=new Point();
		Class c1=p.getClass();
		System.out.println(c1.getName());
		
		try{
		  Class c2=Class.forName("Point");
		  System.out.println(c2.getName());
		}catch(Exception e){
			System.out.println(e);
		}
		
		Class c3=Point.class;
		System.out.println(c3.getName());
		
		Class c4=int.class;
		System.out.println(c4.getName());
		
		Class c5=Integer.class;
		System.out.println(c5.getName());
		
		Class c6=Integer.TYPE;
		System.out.println(c6.getName());*/
		
	  System.out.println("before new Line()");
	  new Line();
	  System.out.println("after new Line() and before Class Line");
	  Class c=Line.class;
	  System.out.println(c.getName());
	  System.out.println("after Class Line");
	  	
	
	}
}
class Point{
	int a;int b;
	static {
		System.out.println("loading Point");
	}
}
class Line{
	static {
		System.out.println("Loading Line");
	}
}
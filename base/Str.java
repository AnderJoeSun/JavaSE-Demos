class Str{
	static void ch1(int x,int y){
		x=x+y;
		y=x-y;
		x=x-y;
	}
	static void ch2(int[] x){
		x[0]=x[1]+x[0];
		x[1]=x[0]-x[1];
		x[0]=x[0]-x[1];
	}
	static void ch3(X z){
		z.x=z.x+z.y;
		z.y=z.x-z.y;
		z.x=z.x-z.y;
	}
		
	public static void main(String agr[]){
	  /*String a=new String("abc");
	  String b=new String("adc");
	  StringBuffer c=new StringBuffer("abcd");
	  c.append("e").append("dfddf");
	  c.delete(2,5);
	  c.insert(3,"MolynLovesJoyu!");
	  System.out.println(c);
	  
	  String[] d=new String[]{a,b,b,a,b};
	  for(int i=0;i<d.length;i++)
	  System.out.println("d["+i+"]="+d[i]);*/
	  int a=3;int b=4;
	  int[] c=new int[]{5,6};
	  X z=new X(8,9);
	  ch1(a,b);
	  ch2(c);
	  ch3(z);
	  System.out.println("a="+a+",b="+b);
	  System.out.println("c[0]="+c[0]+",c[1]="+c[1]);
	  System.out.println("z.x="+z.x+",z.y="+z.y);
	  
	}
}
class X{
	int x;
	int y;
	X(int x,int y){
		this.x=x;
		this.y=y;
	}
}
class Str2{
	static void ch1(int x,int y){
		x=x+y;
		y=x-y;
		x=x-y;
	}
	static void ch2(int[] a){
		a[0]=a[0]+a[1];
		a[1]=a[0]-a[1];
		a[0]=a[0]-a[1];
	}
	static void ch3(X b){
		b.x=b.x+b.y;
		b.y=b.x-b.y;
		b.x=b.x-b.y;
	}
	public static void main(String arg[]){
	/*StringBuffer a=new StringBuffer("abcbcdcda");
	a.append("dda").append("ddb").append("ddc");
	a.delete(2,5);
	a.insert(3,"kgk");
	System.out.println(a);*/
	
	/*String[] b=new String[]{"a","d","c"};
	for(int i=0;i<b.length;i++){
		System.out.println("b["+i+"]="+b[i]);
	}*/
	
	int a=3;int b=4;
	int[] c=new int[]{0,1};
	X z=new X(6,9);
	ch1(a,b);
	ch2(c);
	ch3(z);
	System.out.println(a+","+b);
	System.out.println(c[0]+","+c[1]);
	System.out.println(z.x+","+z.y);
	
	}
}
class X{
	int x,y;
	X(int x,int y){
		this.x=x;
		this.y=y;
	}
}
	
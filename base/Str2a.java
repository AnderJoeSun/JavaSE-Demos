class Str2a{
	public static void ch1(int x,int y){
		x=x+y;
		y=x-y;
		x=x-y;
	}
	
	/*public  static void ch2(String a,String b){
		a=a+b;
		b=a-b;
		a=a-b;
	}*/
	
	public  static void ch3(P p){
		p.x=p.y+p.x;
		p.y=p.x-p.y;
		p.x=p.x-p.y;
	}
	
	public  static void ch4(int[] a){
		a[1]=a[1]+a[0];
		a[0]=a[1]-a[0];
		a[1]=a[1]-a[0];
	}
	
	public static void main(String arg[]){
		/*StringBuffer sb=new StringBuffer("abcd");
		sb.append("eeee").append("fffff");
		System.out.println(sb);
		sb.delete(3,4);
		System.out.println(sb);
		sb.insert(5,"oooo");
		System.out.println(sb);*/
		
		int x=3,y=4;
		String a="abc",b="eee";
		int[] c=new int[]{0,1};
		P p=new P();
		System.out.println(x+","+y+";"+a+","+b+";"+c[0]+","+c[1]+";"+p.x+","+p.y);
		ch1(x,y);
		//ch2(a,b);
		ch3(p);
		ch4(c);
		System.out.println(x+","+y+";"+a+","+b+";"+c[0]+","+c[1]+";"+p.x+","+p.y);
		
	}
}

class P{
	int x=55,y=99;
}
	
		
		
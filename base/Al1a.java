import java.util.*;
class Al1a{
	public static void main(String arg[]){
		ArrayList al=new ArrayList();
		al.add("abc");
		al.add("dddd");
		al.add("ee");
		System.out.println(al);
		for(int i=0;i<al.size();i++){
			System.out.println(al.get(i));
		}
		al.add(new P(3,4));
		al.add(new P(5,3));
		al.add(new P(2,4));
		al.add(new P(8,9));
		System.out.println(al);
		
		
	}
}

class P{
	int x,y;
	P(int x,int y){
		this.x=x;
		this.y=y;
	}
	public String toString(){
		return "x="+x+",y="+y;
	}
	public int compareTo(java.lang.Object o){
		P p=(P)o;
		return x>p.x?1:(x==p.x?0:-1);
	}
}
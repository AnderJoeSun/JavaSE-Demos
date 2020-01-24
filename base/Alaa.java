import java.util.*;
class Alaa{
	public static void main(String arg[]){
		ArrayList al=new ArrayList();
		al.add("one");
		al.add("two");
		al.add("three");
		al.add("four");
		System.out.println(al);
		Iterator it=al.iterator();
		while(it.hasNext()){
			System.out.println(it.next());
		}
		ArrayList al1=new ArrayList();
		al1.add(new P(3,4));
		al1.add(new P(3,88));
		al1.add(new P(4,8));
		al1.add(new P(34,8));
		System.out.println(al1);
		Iterator it1=al1.iterator();
		while(it1.hasNext()){
			System.out.println(it1.next());
		}
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
}
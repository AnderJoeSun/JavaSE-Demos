import java.util.*;
class Al2a{
	public static void printParam(Collection c){
		Iterator it=c.iterator();
		while(it.hasNext()){
			System.out.println(it.next());
		}
	}
	public static void main(String arg[]){
		ArrayList al=new ArrayList();
		al.add(new P(3,4));
		al.add(new P(5,3));
		al.add(new P(2,4));
		al.add(new P(8,9));
		System.out.println(al);
		java.lang.Object[] obj=al.toArray();
		List lt=Arrays.asList(obj);
		lt.set(2,"abc");
		printParam(lt);
		
		
		
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
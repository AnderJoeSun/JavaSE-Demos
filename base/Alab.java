import java.util.*;
class Alab{
	public static void main(String arg[]){
		ArrayList al=new ArrayList();
		al.add(new P(2,4));
		al.add(new P(9,4));
	  al.add(new P(7,4));
	  al.add(new P(6,6));
	  java.lang.Object[] o=al.toArray();
	  List l=Arrays.asList(o);
	  l.set(1,"Joyu!");
	  Iterator it=l.iterator();
	  while(it.hasNext()){
	  	System.out.println(it.next());
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
import java.util.*;

public class Ts1aaa{
	public static void main(String arg[]){
		TreeSet ts=new TreeSet();
		ts.add(new Stu(3,"Saiyu"));
		ts.add(new Stu(29,"Joyu"));
		ts.add(new Stu(1,"Molyn"));
		System.out.println(ts+"\n");
		Iterator it=ts.iterator();
		while(it.hasNext()){
			System.out.println(it.next());
		}
		
	}
}

class Stu implements Comparable{
	int hao;
	String name;
	Stu(int hao,String name){
		this.hao=hao;
		this.name=name;
	}
	public String toString(){
		return hao+","+name;
	}
	public int compareTo(Object o){
		Stu s=(Stu)o;
	  return hao>s.hao?1:(hao==s.hao?0:-1);
	}
}
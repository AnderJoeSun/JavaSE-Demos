import java.util.*;
class Ts1aa{
	public static void main(String arg[]){
		TreeSet ts=new TreeSet();
		ts.add(new Stu(29,"Joyu"));
		ts.add(new Stu(1,"Molyn"));
		ts.add(new Stu(29,"Joyu"));
		ts.add(new Stu(31,"Xue"));
		ts.add(new Stu(31,"Jun"));
		System.out.println(ts);
	}
}
class Stu implements Comparable{
	int hao;
	String name;
	Stu(int hao,String name){
		this.hao=hao;
		this.name=name;
	}
	static class Com implements Comparator{
		public int compare(java.lang.Object o1,java.lang.Object o2){
			Stu s1=(Stu)o1;
			Stu s2=(Stu)o2;
			int re=s1.hao>s2.hao?1:(s1.hao==s2.hao?0:-1);
			if(re==0){
				re=s1.name.compareTo(s2.name);
			}
			return re;
		}
	}
			
	public String toString(){
		return "hao="+hao+",name="+name;
	}
	public int compareTo(java.lang.Object o){
		Stu s=(Stu)o;
		int re=hao>s.hao?1:(hao==s.hao?0:-1);
		if(re ==0){
			re=name.compareTo(s.name);
		}
		return re;
	}
}
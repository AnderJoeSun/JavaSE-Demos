import java.util.*;
class Ts1a{
	public static void main(String arg[]){
		TreeSet ts=new TreeSet(new Stu.StuCom());
		ts.add(new Stu(1,"Joyu"));
	  ts.add(new Stu(30,"Xue"));
		ts.add(new Stu(1,"Joyu"));
		ts.add(new Stu(29,"Molyn"));	
		Iterator it=ts.iterator();
		while(it.hasNext()){
			System.out.println(it.next());
		}
	}
}

class Stu{
	int hao;
	String name;
	Stu(int hao,String name){
		this.hao=hao;
		this.name=name;
	}
	static class StuCom implements Comparator{
		public int compare(java.lang.Object o1,java.lang.Object o2){
			Stu s1=(Stu)o1;
			Stu s2=(Stu)o2;
			int re=s1.hao>s2.hao?1:(s1.hao==s2.hao?0:-1);
			if(re==0){
				re =s1.name.compareTo(s2.name);
			}
			return re;
		}
	}
	public String toString(){
		return "hao="+hao+",name="+name;
	}
}
		
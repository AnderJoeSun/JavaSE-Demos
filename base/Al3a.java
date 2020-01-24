import java.util.*;
class Al3a{
	public static void printParam(Collection c){
		Iterator it=c.iterator();
		while(it.hasNext()){
			System.out.println(it.next());
		}
	}
	public static void main(String arg[]){
		Stu s1=new Stu(30,"Jun");
		Stu s2=new Stu(1,"Molyn");
		Stu s3=new Stu(1,"Joyu");
		Stu s4=new Stu(29,"Xue");
		ArrayList al=new ArrayList();
		al.add(s1);
		al.add(s2);	
		al.add(s3);
		al.add(s4);
		Collections.sort(al);
		printParam(al);
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
		return "hao="+hao+",name="+name;
	}
	public int compareTo(java.lang.Object o){
		Stu s=(Stu)o;
		int r=hao>s.hao?1:(hao==s.hao?0:-1);
		if(r==0){
			r=name.compareTo(s.name);
		}
		return r;
	}
}
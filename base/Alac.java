import java.util.*;
class Alac{
	public static void main(String arg[]){
		ArrayList al=new ArrayList();
		al.add(new Stu(,));
		al.add(new Stu(,));
		al.add(new Stu(,));
		al.add(new Stu(,));
		System.out.println("before sort:\n"+al);
		Collection.sort(al);
		System.out.println("after sort:\n"+al);
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
		return hao=hao,name=name;
	}
	public int compareTo(Object o){
		Stu s=(Stu)o;
		int r=hao>s.hao?1:(hao==s.hao?0:-1);
		if(r==0){
			r=name.compareTo(s.name);
		}
	}
}
		
		
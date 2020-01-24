import java.util.*;
class Hs1aa{
	public static void print(Collection c){
		Iterator it=c.iterator();
		while(it.hasNext()){
			System.out.println(it.next());
		}
	}
	public static void main(String arg[]){
		HashSet hs=new HashSet();
		hs.add(new Stu(1,"Joyu"));
		hs.add(new Stu(29,"Molyn"));
		hs.add(new Stu(1,"Joyu"));
		hs.add(new Stu(30,"xue"));
		System.out.println(hs);
		print(hs);
	}
}
class Stu{
	int hao;
	String name;
	Stu(int hao,String name){
		this.hao=hao;
		this.name=name;
	}
	public String toString(){
		return "hao="+hao+",name="+name+";";
	}
	public int hashCode(){
		return hao*name.hashCode();
	}
	public boolean equals(java.lang.Object o){
		Stu s=(Stu)o;
		return hao==s.hao && name.equals(s.name);
	}
	
}
		

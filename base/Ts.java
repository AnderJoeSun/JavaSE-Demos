
import java.util.*;
class Ts{
  public static void main(String a[]){
  	TreeSet ts=new TreeSet();
  	ts.add(new Stu(31,"XueJun"));
  	ts.add(new Stu(29,"Joyu"));
  	ts.add(new Stu(1,"Molyn"));
  	ts.add(new Stu(31,"XueJun"));
  	
  	Iterator it=ts.iterator();
  	while(it.hasNext()){
  		System.out.println(it.next());
  	}
  	
  }
}
class Stu implements Comparable{
	int hao;String name;
	Stu(int x,String y){
		hao=x;
		name=y;
	}
	public String toString(){
		return "hao="+hao+",name="+name;
	}
	public int compareTo(Object o){
		Stu s=(Stu)o;
	  int re=hao<s.hao?1:(hao==s.hao?0:-1);
	  if(re==0){
	  	re=name.compareTo(s.name);
	  }
	  return re;
	}
	/*public int hashCode(){
		return hao*name.hashCode();
	}
	public boolean equals(Object o){
		Stu s=(Stu)o;
	  return hao==s.hao&&name.equals(s.name);
	}*/
}
			
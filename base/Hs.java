import java.util.*;
class Hs{
  public static void main(String a[]){
  	HashSet hs=new HashSet();
  	hs.add(new Stu(31,"XueJun"));
  	hs.add(new Stu(29,"Joyu"));
  	hs.add(new Stu(1,"Molyn"));
  	hs.add(new Stu(31,"XueJun"));
  	
  	Iterator it=hs.iterator();
  	while(it.hasNext()){
  		System.out.println(it.next());
  	}
  	
  }
}
class Stu{
	int hao;String name;
	Stu(int x,String y){
		hao=x;
		name=y;
	}
	public String toString(){
		return "hao="+hao+",name="+name;
	}
	public int hashCode(){
		return hao*name.hashCode();
	}
	public boolean equals(Object o){
		Stu s=(Stu)o;
	  return hao==s.hao&&name.equals(s.name);
	}
}
			
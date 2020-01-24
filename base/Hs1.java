import java.util.*;

public class Hs1{
	public static void main(String arg[]){
		HashSet hs=new HashSet();
		hs.add(new Stu(1,"Molyn"));
		hs.add(new Stu(2,"Joyu"));
		hs.add(new Stu(3,"Saiyu"));
		hs.add(new Stu(1,"Molyn"));
		System.out.println(hs);
	}
}

class Stu{
	int hao;
	String name;
	Stu(int hao,String name){
		this.hao=hao;
		this.name=name;
	}
	
	/*public int hashCode(){
		return hao*name.hashCode();
	}*/
	
	public String toString(){
		return hao+","+name;
	}
	
	public boolean equals(Object o){
		Stu s=(Stu)o;
		if(s.hao==hao&&s.name==name)
		return true;
		else
		return false;
	}
}
import java.util.*;

public class Arr1ab{
	public static void main(String[] arg){
		Stu[] s=new Stu[]{new Stu(1,"Molyn"),new Stu(29,"Joyu"),new Stu(2,"XueJun")};
		Stu[] s2=new Stu[3];
		System.arraycopy(s,0,s2,0,3);
		for(int i=0;i<s2.length;i++){
			System.out.println(s2[i]);
		}
		s2[1]=new Stu(3,"Saiyu");
		for(int i=0;i<s2.length;i++){
			System.out.println(s2[i]);
		}
		
		System.out.println("Before Sort!");
		for(int i=0;i<s2.length;i++){
			System.out.println("\t"+s2[i]);
		}
		
		Arrays.sort(s2);
		System.out.println("After Sort!");
		for(int i=0;i<s2.length;i++){
			System.out.println("\t"+s2[i]);
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
		int re=hao>s.hao?1:(hao==s.hao?0:-1);
		if(re==0){
			re=name.compareTo(s.name);
		}
		return re;
	}
}
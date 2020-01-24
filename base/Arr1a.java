import java.util.*;

class Arr1a{
	public static void main(String arg[]){
		Stu[] s1=new Stu[]{new Stu(29,"Joyu"),new Stu(1,"Xue"),new Stu(1,"Molyn"),new Stu(30,"Xiong")};
		Stu[] s2=new Stu[4];
		System.arraycopy(s1,0,s2,0,4);
		System.out.println("before sort:");
		for(int i=0;i<s2.length;i++){
			System.out.println(s2[i]);
		}
		System.out.println("after sort:");
		Arrays.sort(s2);
		for(int i=0;i<s2.length;i++){
			System.out.println(s2[i]);
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
	public int compareTo(java.lang.Object o){
		Stu s=(Stu)o;
		int r=hao>s.hao?1:(hao==s.hao?0:-1);
		if(r==0){
			r=name.compareTo(s.name);
		}
		return r;
	}
}
		
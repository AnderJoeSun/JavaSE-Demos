import java.util.*;
class Arr{
	public static void main(String arg[]){
		/*int[] n1=new int[]{3,2,8};
		int[] n2=new int[3];
		System.arraycopy(n1,0,n2,0,n1.length);
		for(int i=0;i<3;i++)
		System.out.println(n2[i]);
		Arrays.sort(n2);
		
		for(int i=0;i<3;i++)
		System.out.println("Sort after:"+n2[i]);
		int index=Arrays.binarySearch(n2,3);
		System.out.println("3 is num:"+(index+1));*/
		
		Stu[] s1=new Stu[]{new Stu(6,"ranwu"),new Stu(6,"zhangsan"),new Stu(5,"lisi"),new Stu(6,"Joyu"),new Stu(29,"Molyn"),new Stu(5,"Fanyu")};
		Stu[] s2=new Stu[6];
		System.arraycopy(s1,0,s2,0,6);
		System.out.println("Before Sort:");
		for(int i=0;i<6;i++)
		System.out.println("\ts2["+i+"]="+s2[i]);
		Arrays.sort(s2);
		System.out.println("After Sort:");
		for(int i=0;i<6;i++)
		System.out.println("\ts2["+i+"]="+s2[i]);
		int index2=Arrays.binarySearch(s2,new Stu(29,"Molyn"));
		System.out.println("Molyn, 29hao, is number:"+(index2+1));
		
		
		
		
	}
}
class Stu implements Comparable{
	int hao;String name;
	Stu(int x,String y){
		hao=x;
		name=y;
	}
	public String toString(){
		return "p.hao="+hao+",p.name="+name;
	}
	public int compareTo(Object o){
		Stu s=(Stu)o;
	  int	result= hao>s.hao?1:(hao==s.hao?0:-1);
	  if(result==0){
	  	result=name.compareTo(s.name);
	  }
	  return result;
		
		
	}
		
		
	
}
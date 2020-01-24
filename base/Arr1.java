import java.util.*;
class Arr1{
	public static void main(String arg[]){
	/*int[] a=new int[]{2,6,4,8,1};
	int[] b=new int[5];
	System.arraycopy(a,0,b,0,5);
	System.out.println("before sort");
	for(int i=0;i<5;i++){
		System.out.println(b[i]);
	}
	System.out.println("after sort");
	Arrays.sort(b);
	for(int i=0;i<5;i++){
		System.out.println(b[i]);
	}*/
	Stu[] s=new Stu[]{new Stu(29,"Molyn"),new Stu(29,"Joyu"),new Stu(0,"Xiong")};
	Stu[] z=new Stu[3];
	System.arraycopy(s,0,z,0,3);
	System.out.println("before sort");
	for(int i=0;i<3;i++){
		System.out.println(z[i]);
	}
	System.out.println("after sort");
	Arrays.sort(z);
	for(int i=0;i<3;i++){
		System.out.println(z[i]);	
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
		int r=hao<s.hao?1:(hao==s.hao?0:-1);
		if(r==0)
		  r=name.compareTo(s.name);
		return r;
	}
}
	 
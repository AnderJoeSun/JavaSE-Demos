import java.util.*;

public class Arr1aa{
	public static void main(String[] arg){
		Stu[] st=new Stu[]{new Stu(1,"molyn",new Pro()),new Stu(29,"Joyu",new Pro())};
		Stu s2=(Stu)st[0].clone();
		s2.p.age=443;
		System.out.println(st[0]);
		System.out.println(s2);
	}
}

class Stu implements Cloneable{
	int hao;
	String name;
	Pro p;
	Stu(int hao,String name,Pro p){
		this.hao=hao;
		this.name=name;
		this.p=p;
	}
  public String toString(){
  	return hao+","+name+","+p.name+","+p.age;
  }
  public Object clone(){
  	Stu s=null;
  	try{
  	  s=(Stu)super.clone();
    }catch(Exception e){
    	e.printStackTrace();
    }
  	s.p=(Pro)p.clone();
  	return s;
  }
}

class Pro implements Cloneable{
	String name="Xiong";
	int age=30;
	public Object clone(){
		Object o=null;
		try{
			o=super.clone();
		}catch(CloneNotSupportedException e){
			e.printStackTrace();
		}
		return o;
	}
}
	
	
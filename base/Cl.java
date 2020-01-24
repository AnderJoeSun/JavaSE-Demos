class Cl{
	public static void main(String[] agr){
		Student s1=new Student(3,"Joyu",new Professor(50,"Xiong"));
		Student s2=(Student)s1.clone();
		s2.p.age=30;
		s2.p.n="xiaoJun";
		System.out.println("s1.hao="+s1.p.age+",s1.name="+s1.p.n);
		
	}
}
class Student implements Cloneable{
	int hao;
	String name;
	Professor p;
	Student(int x,String y,Professor p){
		hao=x;
	  name=y;
	  this.p=p;
	}
	public java.lang.Object clone(){
		Student o=null;
		try{
		   o=(Student)super.clone();
		  }catch(CloneNotSupportedException e){
		  	e.printStackTrace();
		  }
		 
		  o.p=(Professor)p.clone();
		return o;
	}
}

class Professor implements Cloneable{
	String n="Xiong";
	int age=33;
	Professor (int x,String y){
		this.n=y;
		this.age=x;
	}
	public java.lang.Object clone(){
		java.lang.Object o=null;
		try{
			o=super.clone();
		}catch(CloneNotSupportedException e){
			System.out.println(e);
		}
		return o;
	}
}
	
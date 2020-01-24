class Cl1{
	public static void main(String arg[]){
		//Pro p=new Pro("Xiong",30);
		Student s1=new Student(20,"Molyn",new P(30,"Xiong"));
		Student s2=(Student)s1.clone();
		s2.p.name="XueJun";
		s2.p.hao=29;
		s2.name="Joyu";
		s2.hao=19;
		System.out.println(s1.name+","+s1.hao+","+s1.p.name+","+s1.p.hao);
		System.out.println(s2.name+","+s2.hao+","+s2.p.name+","+s2.p.hao);
	}
}

class Student implements Cloneable{
	P p;
	String name;
	int hao;
	Student(int hao,String name,P p){
		this.p=p;
		this.name=name;
		this.hao=hao;
	}
	public java.lang.Object clone(){
		Student s=null;
		try{
			s=(Student)super.clone();
		}catch(CloneNotSupportedException c){
			c.printStackTrace();
		}
		s.p=(P)p.clone();
		return s;
	}
}

class P implements Cloneable{
	String name;
	int hao;
	P(int hao,String name){
		this.hao=hao;
		this.name=name;
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
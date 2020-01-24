public class Claaa{
	public static void main(String arg[]){
		Stu[] stu=new Stu[]{new Stu(1,"Molyn",new Pro()),new Stu(2,"Saiyu",new Pro())};
		Stu[] stu2=new Stu[2];
		System.arraycopy(stu,0,stu2,0,2);
		System.out.println(stu[1]+":   :"+stu2[1]);
		stu2[1].p.name="Jun";
		System.out.println(stu[1]+":   :"+stu2[1]);
		Stu stu3=null;
		stu3=(Stu)stu[1].clone();
		stu2[1].p.name="Jian";
		System.out.println(stu[1]+":   :"+stu3);
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
	
	public String toString(){
		return hao+","+name+","+p.age+","+p.name;
	}
}

class Pro implements Cloneable{
	int age=30;
	String name="Xiong";
	
	public Object clone(){
		Object o=null;
		try{
		  o=super.clone();
	  }catch(Exception e){
	  	e.printStackTrace();
	  }
	  return o;
	}
}
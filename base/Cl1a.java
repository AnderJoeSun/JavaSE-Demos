class Cl1a{
	public static void main(String arg[]){
		P p=new P();
		S s1=new S(3,"Joyu",p);
		S s2=(S)s1.clone();
		s2.p.hao=11;
		s2.p.name="Xue";
		System.out.println(s1.p.hao+","+s1.p.name);
		System.out.println(s2.p.hao+","+s2.p.name);
	}
}

class S implements Cloneable{
	int hao;
	String name;
	P p;
	S(int hao,String name,P p){
		this.hao=hao;
		this.name=name;
		this.p=p;
	}
	public java.lang.Object clone(){
		S o=null;
		try{
			o=(S)super.clone();
		}catch(Exception e){
			System.out.println(e);
		}
		o.p=(P)p.clone();
		return o;
	}
}

class P implements Cloneable{
	int hao=33;
	String name="Xiong";
	public java.lang.Object clone(){
		P o=null;
		try{
			o=(P)super.clone();
		}catch(Exception e){
			e.printStackTrace();
		}
		return o;
	}
}	
	
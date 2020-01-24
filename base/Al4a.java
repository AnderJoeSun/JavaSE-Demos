import java.util.*;
class Al4a{
	public static void printParam(Collection c){
		Iterator it=c.iterator();
		while(it.hasNext()){
			System.out.println(it.next());
		}
	}
	public static void main(String arg[]){
		Stu s1=new Stu(30,"Jun");
		Stu s2=new Stu(1,"Molyn");
		Stu s3=new Stu(1,"Joyu");
		Stu s4=new Stu(29,"Xue");
		ArrayList al=new ArrayList();
		al.add(s1);
		al.add(s2);	
		al.add(s3);
		al.add(s4);
		System.out.println("Sort!");
		Collections.sort(al,new Stu.Com());
		printParam(al);
		/*System.out.println("Reverse order!");
		Collections.sort(al,Collections.reverseOrder());//有错！
		printParam(al);*/
		//System.out.println(Collections.max(al));//Collections.max(al)与Collections.min(al)只能用在可取最大最小的集合里。
		//System.out.println(Collections.min(al));
		//System.out.println(al.get(Collections.binarySearch(al,new Stu(1,"Molyn"))));//有错！
	}
}

class Stu {
	int hao;
	String name;
  Stu(int hao,String name){
		this.hao=hao;
		this.name=name;
	}
	static class Com implements Comparator{
		public int compare(java.lang.Object o1,java.lang.Object o2){
			Stu s1=(Stu)o1;
			Stu s2=(Stu)o2;
			int re=s1.hao>s2.hao?1:(s1.hao==s2.hao?0:-1);
			if(re==0){
				re=s1.name.compareTo(s2.name);
			}
			return re;
		}
	}
			
			
	public String toString(){
		return "hao="+hao+",name="+name;
	}
	
}
import java.util.*;
class Al{
	
	public static void  print(Collection c){
		Iterator it=c.iterator();
		while(it.hasNext()){
			System.out.println("\t"+it.next());
		}
	}		
	public static void main(String a[]){
		ArrayList al=new ArrayList();
		al.add(new Stu(29,"Joyu"));
		al.add(new Stu(1,"Molyn"));
		al.add(new Stu(31,"XueJun"));
		al.add(new Stu(1,"Alian"));
		/*System.out.println(al);
		for(int i=0;i<al.size();i++){
		 System.out.println(al.get(i));
		}*/
		//Object[] o=al.toArray();
		/*for(int i=0;i<o.length;i++){*/
			 //System.out.println(o);
		//}
		/*List l=Arrays.asList(o);
		System.out.println(l);*/
		/*Iterator it=al.iterator();
		while(it.hasNext()){
			
		  System.out.println(it.next());
		}*/
		System.out.println("before sort:");
	  print(al);
		System.out.println("after sort:");
		Collections.sort(al,new Stu.Stuc());
		print(al);
		System.out.println("after reverseOder:");
		Collections.sort(al,Collections.reverseOrder());
		print(al);
	}
}
class Stu implements Comparable{
	int hao;String name;
	Stu(int x,String y){
		hao=x;
		name=y;
	}
  static class Stuc implements Comparator{
		public int compare(Object o1,Object o2){
			Stu s1=(Stu)o1;
			Stu s2=(Stu)o2;
			int result=s1.hao>s2.hao?1:(s1.hao==s2.hao?0:-1);
			if(result==0){
				result=s1.name.compareTo(s2.name);
			}
			return result;
	  }
	}
	 
	public String toString(){
		return "s.hao="+hao+",s.name="+name;
	}
	public int compareTo(Object o){
		Stu s=(Stu)o;
		int result= hao>s.hao?1:(hao==s.hao?0:-1);
		if(result ==0){
			result=name.compareTo(s.name);
		}
		return result;
	}
		
}

	
	


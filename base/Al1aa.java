import java.util.*;

public class Al1aa{
	public static void main(String[] arg){
		ArrayList al=new ArrayList();
		al.add("akf");
		al.add("dkfsal");
		al.add("kdfl");
		System.out.println(al);
		for(int i=0;i<al.size();i++){
			System.out.println(al.get(i));
		}
		Object[] o=al.toArray();
		for(int i=0;i<o.length;i++){
			System.out.println(o[i]);
		}
		List l=Arrays.asList(o);
		for(int i=0;i<l.size();i++){
			System.out.println(l.get(i));
		}
		Iterator it=l.iterator();
		while(it.hasNext()){
			System.out.println(it.next());
		}
		ArrayList al1=new ArrayList();
		al1.add(new Stu(1,"Molyn"));
		al1.add(new Stu(29,"Joyu"));
		al1.add(new Stu(2,"XueJun"));
		al1.add(new Stu(2,"Fanyu"));
		Collections.sort(al1);
		System.out.println(al1);
		//al1.set(2,"sdjfsljf");
		al1.set(2,new Stu(29,"Asdf"));
		System.out.println(al1);
		Collections.sort(al1,new Stu.Com());
		System.out.println(al1);
		Collections.sort(al1);
		System.out.println(al1);
		Collections.sort(al1,Collections.reverseOrder());
		System.out.println(al1);
	}
	
}

class Stu implements Comparable{
	int hao;
	String name;
	Stu(int hao,String name){
		this.hao=hao;
		this.name=name;
	}
	static class Com implements Comparator{
		public  int compare(Object o1,Object o2){
			Stu s1=(Stu)o1;
			Stu s2=(Stu)o2;
			int re=s1.hao>s2.hao?1:(s1.hao==s2.hao?0:-1);
			if(re==0){
				re=s1.name.compareTo(s2.name);
			}
			return re;
		}
	}
	public int compareTo(Object o){
		Stu s=(Stu)o;
		int r=hao<s.hao?1:(hao==s.hao?0:-1);
		if(r==0){
			r=name.compareTo(s.name);
		}
		return r;
	}
	public String toString(){
		return hao+","+name;
	}
	
}
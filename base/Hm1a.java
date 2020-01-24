import java.util.*;
class Hm1a{
	static void print(Collection c){
		Iterator it=c.iterator();
		while(it.hasNext()){
			System.out.println(it.next());
		}
	}
		
	public static void main(String arg[]){
		HashMap hm=new HashMap();
		hm.put("one","Joyu");
		hm.put("two","Molyn");
		hm.put("three","Xue");
		System.out.println(hm.get("one"));
		System.out.println(hm.get("three"));
		System.out.println(hm.get("two"));
		
		Set keys=hm.keySet();
		print(keys);
	  Collection values=hm.values();
	  print(values);
	  
	  Set e=hm.entrySet();
	  print(e);
	  Iterator it1=e.iterator();
	  while(it1.hasNext()){
	  	Map.Entry me=(Map.Entry)it1.next();
	  	System.out.println(me.getKey()+","+me.getValue());
	  }
	}
}
		
		
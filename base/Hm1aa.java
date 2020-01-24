import java.util.*;
class Hm1aa{
	public static void print(Collection c){
		Iterator it=c.iterator();
		while(it.hasNext()){
			System.out.println(it.next());
		}
	}
		
	public static void main(String arg[]){
		HashMap hm=new HashMap();
		hm.put("one","Joyu");
		hm.put("three","Molyn");
		hm.put("five","Xue");
		hm.put("sit","Jun");
		hm.put("lay","Jian");
		hm.put("six","An");
		System.out.println(hm);
		
		Set s=hm.keySet();
		print(s);
		Collection c=hm.values();
		print(c);
		
		Set duan=hm.entrySet();
		print(duan);
		Iterator it=duan.iterator();
		while(it.hasNext()){
			Map.Entry me=(Map.Entry)it.next();
			System.out.println(me.getKey()+","+me.getValue());
		}
	}
}


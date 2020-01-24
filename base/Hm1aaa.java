import java.util.*;

public class Hm1aaa{
	public static void main(String arg[]){
		HashMap hm=new HashMap();
		hm.put(1,"Molyn");
		hm.put(29,"Joyu");
		hm.put(2,"Saiyu");
		System.out.println(hm);
		
		Set keys=hm.keySet();
		System.out.println(keys);
		
		Set duan=hm.entrySet();
		System.out.println(duan);
		Iterator it=duan.iterator();
		while(it.hasNext()){
			System.out.println(it.next());
		}
		Iterator it1=duan.iterator();
		while(it1.hasNext()){
			Map.Entry me=(Map.Entry)it1.next();
			System.out.println(me.getKey()+","+me.getValue());
		}
  }
}
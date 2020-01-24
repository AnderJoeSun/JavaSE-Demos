import java.util.*;
import java.nio.charset.*;

public class CharSet1aa{
	public static void main(String arg[]){
	  Map m=Charset.availableCharsets();
	  Set s=m.keySet();
	  System.out.println("keys:");
	  Iterator it=s.iterator();
	  while(it.hasNext()){
	  	System.out.println("\t"+it.next());
	  }
	  /*Set s2=m.valueSet();
	  System.out.println("values:");
	  Iterator it2=s2.iterator();
	  while(it2.hasNext()){
	  	System.out.println("\t"+it2.next());
	  }*/
	}
}
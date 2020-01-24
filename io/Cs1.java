import java.nio.charset.*;
import java.util.*;
class Cs1{
	public static void main(String arg[]){
		Map m=Charset.availableCharset();
		Set s=m.keySet();
		Iterator it=s.iterator();
		while(it.hasNext()){
			System.out.println(it.next());
		}
			
		Properties p=System.getProperties();
		p.put("file.encoding","ISO-8859-1");
		byte[] b=new byte[100];
		int data;
		int i;
		while((data=System.in.read())!='q'){
			b[i]=data;
			i++;
		}
		String st2=new String(b,0,i);
		System.out.println(st2);
		String st3=new String(st2.getBytes("ISO-8859-1"),"GBK")
		System.out.println(st3);
		
		
	}
}
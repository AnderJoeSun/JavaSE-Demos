import java.util.*;
import java.nio.charset.*;
public class Cs1aaa{
	public static void main(String arg[]) throws Exception{
		Map m=Charset.availableCharsets();
		Set k=m.keySet();
		System.out.println(k);
		
		Properties pps=new Properties();
		pps.list(System.out);
		pps.put("file.encoding","ISO-8859-1");
		int data;
		byte[] b=new byte[100];
		int i=0;
		while((data=System.in.read())!='q'){
			b[i]=(byte)data;
			i++;
		}
		String str=new String(b,0,i);
		System.out.println(str);
		
		String str2=new String(str.getBytes("ISO-8859-1"),"GBK");
		System.out.println(str2);
			
		
	}
}
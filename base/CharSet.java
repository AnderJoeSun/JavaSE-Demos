import java.util.*;

import java.nio.charset.*;
class CharSet{
  public static void main(String a[]) throws Exception{
  	/*Map m=Charset.availableCharsets();
  	Set s=m.keySet();
  	Iterator it=s.iterator();
  	while(it.hasNext()){
  		System.out.println(it.next());
  	}*/
  	Properties pps=System.getProperties();
  	pps.put("file.decoding","ISO-8859-1");
  	//pps.list(System.out );
  	//pps.put("file.encoding","ISO-8859-1");
  	int data;
  	byte[] buf=new byte[100];
  	int i=0;
  	while((data=System.in.read())!='q'){
  		buf[i]=(byte)data;
  		
  		i++;
  	}
  	String s=new String(buf,0,i);
  	System.out.println(s);
  	/*String s2=new String(s.getBytes("ISO-8859-1"),"GBK");
  	System.out.println(s2);*/
  	
	}
}
	
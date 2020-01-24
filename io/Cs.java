import java.io.*;
import java.nio.charset.*;
import java.util.*;
class Cs{
	public static void main(String arg[]) throws Exception{
		Map m=Charset.availableCharsets();
		Set name=m.keySet();
		Iterator it=name.iterator();
		while(it.hasNext()){
			System.out.println(it.next());
		}
		
		Properties p=System.getProperties();
		p.list(System.out);
		p.put("file.encoding","ISO-8859-1");//把JVM虚拟机的编或解码方
		//式改为"ISO-8859-1"。注意区分虚拟机与系统平台下的字符集！
		int data;
		byte[] b=new byte[100];
		int i=0;
		while((data=System.in.read())!='q'){//data=System.in.read()得到的
			//码型为本地字符集码型--GBK。
			
			b[i]=(byte)data;
			i++;
		}
		String str=new String(b,0,i);//通过JVM虚拟机的解码方式"ISO-8859-1"
		//（15行已改成了"ISO-8859-1"）把字节数组解码为str字符串。
		System.out.println(str);//str是通过“ISO-8859-1”解码得到的，
		//而System.out.println(str);是将str编码为本地字符集码型（GBK）再输出，
		//解码与编码的方式不同，故会出现乱码。
		
		String strGBK=new String(str.getBytes("ISO-8859-1"),"GBK");
		//str.getBytes("ISO-8859-1")是将str通过JVM虚拟机的编码
		//方式"ISO-8859-1"编码，于是str还原为“GBK”码型的byte[]；
		//再将byte[]解码为“GBK”型的strGBK字符串。
		System.out.println(strGBK);//因为strGBK是“GBK”型的，故不会出现乱码。
		
	}
}
		
		
		
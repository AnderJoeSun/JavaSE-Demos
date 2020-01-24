import java.util.*;
import java.nio.charset.*;

public class CharSet1ac{
	public static void main(String arg[]) throws Exception{
		Properties pps=System.getProperties();
		pps.put("file.encoding","IS0-8859-1");
		int data;
		int i=0;
		byte[] b=new byte[100];
		while((data=System.in.read())!='q'){
			b[i]=(byte)data;
			i++;
		}
		String str1=new String(b,0,i);//用"IS0-8859-1"解码得字符串
		System.out.println(str1);//此字符串先被OUT对象用“GBK”编码成字节数组再打印
		/*String str2=new String(str1.getBytes("IS0-8859-1"),"GBK");
		System.out.println(str2);*/
	}
}
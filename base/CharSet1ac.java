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
		String str1=new String(b,0,i);//��"IS0-8859-1"������ַ���
		System.out.println(str1);//���ַ����ȱ�OUT�����á�GBK��������ֽ������ٴ�ӡ
		/*String str2=new String(str1.getBytes("IS0-8859-1"),"GBK");
		System.out.println(str2);*/
	}
}
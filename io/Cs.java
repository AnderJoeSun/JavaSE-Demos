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
		p.put("file.encoding","ISO-8859-1");//��JVM������ı����뷽
		//ʽ��Ϊ"ISO-8859-1"��ע�������������ϵͳƽ̨�µ��ַ�����
		int data;
		byte[] b=new byte[100];
		int i=0;
		while((data=System.in.read())!='q'){//data=System.in.read()�õ���
			//����Ϊ�����ַ�������--GBK��
			
			b[i]=(byte)data;
			i++;
		}
		String str=new String(b,0,i);//ͨ��JVM������Ľ��뷽ʽ"ISO-8859-1"
		//��15���Ѹĳ���"ISO-8859-1"�����ֽ��������Ϊstr�ַ�����
		System.out.println(str);//str��ͨ����ISO-8859-1������õ��ģ�
		//��System.out.println(str);�ǽ�str����Ϊ�����ַ������ͣ�GBK���������
		//���������ķ�ʽ��ͬ���ʻ�������롣
		
		String strGBK=new String(str.getBytes("ISO-8859-1"),"GBK");
		//str.getBytes("ISO-8859-1")�ǽ�strͨ��JVM������ı���
		//��ʽ"ISO-8859-1"���룬����str��ԭΪ��GBK�����͵�byte[]��
		//�ٽ�byte[]����Ϊ��GBK���͵�strGBK�ַ�����
		System.out.println(strGBK);//��ΪstrGBK�ǡ�GBK���͵ģ��ʲ���������롣
		
	}
}
		
		
		
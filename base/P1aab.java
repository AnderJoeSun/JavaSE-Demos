import java.io.*;
import java.util.*;

public class P1aab{
	public static void main(String arg[]) throws Exception{ 
		Properties pps=new Properties();
		pps.load(new FileInputStream("Saiyu.ini"));
		Enumeration e=pps.propertyNames();
		while(e.hasMoreElements()){
			System.out.println(e.nextElement()+"="+pps.getProperty(e.nextElement().toString()));
		}//pps.getProperty(e.nextElement().toString())�õ����ǵڶ���!
		//��Ϊǰ���e.nextElement()������һ��Ԫ�ص�Ȼ���ǵڶ�����¼��ֵ��!����P2.java�Ƚ���.
	}
}
			
		
		
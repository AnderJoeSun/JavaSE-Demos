import java.io.*;
import java.util.*;

public class P1aab{
	public static void main(String arg[]) throws Exception{ 
		Properties pps=new Properties();
		pps.load(new FileInputStream("Saiyu.ini"));
		Enumeration e=pps.propertyNames();
		while(e.hasMoreElements()){
			System.out.println(e.nextElement()+"="+pps.getProperty(e.nextElement().toString()));
		}//pps.getProperty(e.nextElement().toString())得到的是第二条!
		//因为前面的e.nextElement()的再下一个元素当然就是第二条记录的值了!参照P2.java比较下.
	}
}
			
		
		
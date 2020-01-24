import java.io.*;

import java.util.*;
class P{
	public static void main(String a[])throws Exception{
		/*Properties pps=System.getProperties();
		pps.list(System.out);*/
		Properties pps =new Properties();
		
		pps.load(new FileInputStream("Joyu.ini"));
		Enumeration e=pps.propertyNames();
		while(e.hasMoreElements()){
		
			System.out.println(e.nextElement());
		}
		
		
		
	}
}
		
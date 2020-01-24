import java.util.*;
import java.io.*;

class P2a{
	public static void main(String arg[]){
		Properties pps=new Properties();
		try{
			pps.load(new FileInputStream("Molyn.ini"));
			Enumeration enum=pps.propertyNames();
			while(enum.hasMoreElements()){
				String strKey=(String)enum.nextElement();
				String strValue=pps.getProperty(strKey);
				System.out.println(strKey+"="+strValue);
			}
		}catch(Exception e){
			e.printStackTrace();
		}
			
	}
}

import java.io.*;
import java.util.*;
class P2{
	public static void main(String arg[]){
		Properties pps=new Properties();
		
		
		try{
			pps.load(new FileInputStream("Molyn.ini"));
			Enumeration en=pps.propertyNames();
			
			while(en.hasMoreElement()){
				String strKey=(String)en.nextElement();
		    String strValue=pps.getProperty(strKey);
				System.out.println(strKey+"="+strValue);
			}
		}catch(Exception e){
			e.printStackTrace();
		}
	}
}
		
			
			